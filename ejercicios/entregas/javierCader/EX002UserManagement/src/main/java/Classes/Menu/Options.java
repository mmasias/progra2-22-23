package Classes.Menu;
import Classes.Manager;
import Classes.Users.Student;
import Classes.Users.Teacher;
import Classes.Users.User;
import Interfaces.MenuItem;

import java.util.Scanner;

public class Options {
    private final MenuItem quit = new MenuItemImpl("Quit", this::quit);
    private final MenuItem logout = new MenuItemImpl("Logout", this::logout);
    private final Manager manager;
    private final Scanner scanner = new Scanner(System.in);

    private final MenuItem[] studentOptions = {
            new MenuItemImpl("Display Grades", this::displayGrades),
            new MenuItemImpl("Send Email", this::studentSendEmail),
            logout,
            quit
    };
    private final MenuItem[] teacherOptions = {
            new MenuItemImpl("See All Students' Grades", this::seeAllStudentGrades),
            new MenuItemImpl("Change Student Grade", this::changeStudentGrade),
            logout,
            quit
    };
    private final MenuItem[] adminOptions = {
            new MenuItemImpl("Display All Users", this::displayAllUsers),
            new MenuItemImpl("Change Username", () -> editUser("Change username")),
            new MenuItemImpl("Change Password", () -> editUser("Change password")),
            logout,
            quit
    };

    public Options(Manager manager) {
        this.manager = manager;
    }

    private void logout() {
        this.manager.getCurrentUser().setLogin(false);
        System.out.println();
    }

    private void quit() {
        this.manager.setRunSystem(false);
        System.exit(0);
    }

    private void displayGrades() {
        String[] subjects = ((Student) this.manager.getCurrentUser()).getSubjects();
        int[] grades = ((Student) this.manager.getCurrentUser()).getGrades();
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%c %s: %d %s", '>', subjects[i], grades[i], System.lineSeparator());
        }
    }

    private void studentSendEmail() {
        System.out.println("Teacher's subject");
        String subject = scanner.nextLine();
        if (!validateSubject(subject)) {
            throw new IllegalArgumentException("Invalid Subject");
        }
        String teacher = getSubjectTeacher(subject);
        if (teacher == null) {
            throw new IllegalArgumentException("Invalid Teacher");
        }
        System.out.printf("Teacher: %s %s", teacher, System.lineSeparator());
        scanner.nextLine();
    }

    private void seeAllStudentGrades() {
        String teacherSubject = ((Teacher) this.manager.getCurrentUser()).getSubject();
        System.out.printf("Notas de %s:%n", teacherSubject);
        for (User user : this.manager.getAllUsers()) {
            if (user instanceof Student student) {
                int subjectIndex = -1;
                String[] subjects = student.getSubjects();
                for (int i = 0; i < subjects.length; i++) {
                    if (subjects[i].equalsIgnoreCase(teacherSubject)) {
                        subjectIndex = i;
                        break;
                    }
                }
                if (subjectIndex != -1) {
                    System.out.printf("> %s: %d%n",
                            student.getUsername(),
                            student.getGrades()[subjectIndex]
                    );
                }
            }
        }
    }

    private void changeStudentGrade() {
        String teacherSubject = ((Teacher) this.manager.getCurrentUser()).getSubject();
        System.out.println("Student to change grade");
        String student = scanner.nextLine();
        if (!validateStudent(student)) {
            throw new IllegalArgumentException("Invalid student username");
        }
        for (User user : this.manager.getAllUsers()) {
            if (user instanceof Student studentInst && (studentInst.getUsername().equalsIgnoreCase(student))){
                int[] grades = studentInst.getGrades();
                String[] subjects = studentInst.getSubjects();
                for (int i = 0; i < subjects.length; i++) {
                    if (subjects[i].equals(teacherSubject)) {
                        System.out.printf("%c %s: %d %n", '>', studentInst.getUsername(), grades[i]);
                        System.out.println("To what grade would you like to change it?");
                        int newGrade = scanner.nextInt();
                        scanner.nextLine();
                        studentInst.setGrade(i, newGrade);
                        return;
                    }
                }
            }
        }
    }

    private boolean validateStudent(String studentName) {
        for (User user : this.manager.getAllUsers()) {
            if (user instanceof Student student && (student.getUsername().equalsIgnoreCase(studentName))){
                return true;
            }
        }
        return false;
    }

    private boolean validateSubject(String subject) {
        for (String studentSubject : ((Student) this.manager.getCurrentUser()).getSubjects()) {
            if (studentSubject.equalsIgnoreCase(subject)) {
                return true;
            }
        }
        return false;
    }

    private String getSubjectTeacher(String subject) {
        for (User user : manager.getAllUsers()) {
            if (user instanceof Teacher && ((Teacher) user).getSubject().equalsIgnoreCase(subject)) {
                return user.getUsername();
            }
        }
        return null;
    }

    private void displayAllUsers() {
        User[] users = this.manager.getAllUsers();
        System.out.println("All users:");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("%d %s %n", i+1, users[i].getUsername());
        }
    }

    private void editUser(String operationType) {
        User[] users = this.manager.getAllUsers();
        this.displayAllUsers();
        System.out.println("(Input the number)");
        int selectedUser = scanner.nextInt();
        scanner.nextLine();
        User user = validateUser(selectedUser, users);
        System.out.printf("Input the new %s %n", operationType.equalsIgnoreCase("Change username") ? "username" : "password");
        String updatedValue = scanner.nextLine();
        switch (operationType.toLowerCase()) {
            case "change username" -> user.setUsername(updatedValue);
            case "change password" -> user.setPassword(updatedValue);
            default -> throw new IllegalArgumentException("Non existent action");
        }
    }

    private User validateUser(int selectedUser, User[] users) {
        if (selectedUser <= 0 || selectedUser > users.length) {
            throw new IllegalArgumentException("Non existent user");
        }
        return users[selectedUser - 1];
    }


    private MenuItem[] getStudentOptions() {
        return studentOptions;
    }

    private MenuItem[] getAdminOptions() {
        return adminOptions;
    }

    private MenuItem[] getTeacherOptions() {
        return teacherOptions;
    }

    public MenuItem[] getSelectedUserOptions() {
        User currentUser = this.manager.getCurrentUser();
        return switch (currentUser.getClass().getSimpleName()) {
            case "Student" -> getStudentOptions();
            case "Teacher" -> getTeacherOptions();
            case "Admin" -> getAdminOptions();
            default -> null;
        };
    }
}
