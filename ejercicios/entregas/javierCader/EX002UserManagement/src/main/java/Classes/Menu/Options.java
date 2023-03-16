package Classes.Menu;

import Classes.Enigma;
import Classes.Manager;
import Classes.Users.Student;
import Classes.Users.Teacher;
import Classes.Users.User;
import Utils.Enums.Subjects;
import Utils.Interfaces.MenuItem;
import java.util.Scanner;

public class Options {
    private final MenuItem quit = new MenuItemImpl("Quit", this::quit);
    private final MenuItem logout = new MenuItemImpl("Logout", this::logout);
    private final Scanner scanner = new Scanner(System.in);

    private final MenuItem[] studentOptions = {
            new MenuItemImpl("Display Grades", this::displayGrades),
            new MenuItemImpl("Send Email", this::studentSendEmail),
            logout,
            quit
    };
    private final MenuItem[] teacherOptions = {
            new MenuItemImpl("See All Students' Grades", this::displayAllStudentGrades),
            new MenuItemImpl("Change Student Grade", this::changeStudentGrade),
            new MenuItemImpl("Get Global Average", this::getGlobalAverage),
            logout,
            quit
    };
    private final MenuItem[] adminOptions = {
            new MenuItemImpl("Display All Users", this::displayAllUsers),
            new MenuItemImpl("Change Username", () -> editUser("Change username")),
            new MenuItemImpl("Change Password", () -> editUser("Change password")),
            new MenuItemImpl("Get Enigma Key", this::getEnigmaKey),
            logout,
            quit
    };

    private void logout() {
        Manager.currentUser.setLogin(false);
        System.out.println();
    }

    private void quit() {
        Manager.runSystem = false;
        System.exit(0);
    }

    private void displayGrades() {
        Subjects[] subjects = ((Student) Manager.currentUser).getSubjects();
        int[] grades = ((Student) Manager.currentUser).getGrades();
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%c %s: %d %s", '>', subjects[i].getStringValue(), grades[i], System.lineSeparator());
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

    private boolean validateSubject(String subject) {
        for (Subjects studentSubject : ((Student) Manager.currentUser).getSubjects()) {
            if (studentSubject.getStringValue().equalsIgnoreCase(subject)) {
                return true;
            }
        }
        return false;
    }

    private String getSubjectTeacher(String subject) {
        for (User user : Manager.users) {
            if (user instanceof Teacher && ((Teacher) user).getSubject().getStringValue().equalsIgnoreCase(subject)) {
                return user.getUsername();
            }
        }
        return null;
    }

    private void getGlobalAverage() {
        int totalGrade = 0;
        int totalStudents = 0;
        Subjects teacherSubject = ((Teacher) Manager.currentUser).getSubject();
        for (User user : Manager.users) {
            if (user instanceof  Student student) {
                totalGrade += getGrades(student, teacherSubject);
                totalStudents += getTotalStudents(student, teacherSubject);
            }
        }
        System.out.printf("Global Average of %s: %d %n", teacherSubject, totalGrade/totalStudents);
    }

    private void displayAllStudentGrades() {
        Subjects teacherSubject = ((Teacher) Manager.currentUser).getSubject();
        System.out.printf("Grades of %s:%n", teacherSubject);
        for (User user : Manager.users) {
            if (user instanceof Student student) {
                int grade = getGrades(student, teacherSubject);
                System.out.printf("> %s: %d%n",
                        student.getUsername(),
                        grade
                );
            }
        }
    }

    private int getTotalStudents(Student student, Subjects teacherSubject) {
        Subjects[] subjects = student.getSubjects();
        for (Subjects subject : subjects) {
            if (subject.equals(teacherSubject)) {
                return 1;
            }
        }
        return 0;
    }

    private int getGrades(Student student, Subjects teacherSubject) {
        Subjects[] subjects = student.getSubjects();
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].equals(teacherSubject)) {
                return student.getGrades()[i];
            }
        }
        return 0;
    }

    private void changeStudentGrade() {
        Subjects teacherSubject = ((Teacher) Manager.currentUser).getSubject();
        System.out.println("Student to change grade");
        String student = scanner.nextLine();
        if (!validateStudent(student)) {
            throw new IllegalArgumentException("Invalid student username");
        }
        for (User user : Manager.users) {
            if (user instanceof Student studentInst && (studentInst.getUsername().equalsIgnoreCase(student))){
                int[] grades = studentInst.getGrades();
                Subjects[] subjects = studentInst.getSubjects();
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
        for (User user : Manager.users) {
            if (user instanceof Student student && (student.getUsername().equalsIgnoreCase(studentName))){
                return true;
            }
        }
        return false;
    }

    private void displayAllUsers() {
        User[] users = Manager.users;
        System.out.println("All users:");
        for (int i = 0; i < users.length; i++) {
            System.out.printf("%d %s %n", i+1, users[i].getUsername());
        }
    }

    private void editUser(String operationType) {
        User[] users = Manager.users;
        this.displayAllUsers();
        System.out.println("(Input the number)");
        int selectedUser = scanner.nextInt();
        scanner.nextLine();
        User user = validateUser(selectedUser, users);
        System.out.printf("Input the new %s %n", operationType.equalsIgnoreCase("Change username") ? "username" : "password");
        String updatedValue = scanner.nextLine();
        switch (operationType.toLowerCase()) {
            case "change username" -> user.setUsername(updatedValue);
            case "change password" -> user.setPassword(Enigma.encrypt(updatedValue));
            default -> throw new IllegalArgumentException("Non existent action");
        }
    }

    private User validateUser(int selectedUserIndex, User[] users) {
        if (selectedUserIndex <= 0 || selectedUserIndex > users.length) {
            throw new IllegalArgumentException("Non existent user");
        }
        return users[selectedUserIndex - 1];
    }

    private void getEnigmaKey() {
        Enigma.getKey();
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
        User currentUser = Manager.currentUser;
        return switch (currentUser.getClass().getSimpleName()) {
            case "Student" -> getStudentOptions();
            case "Teacher" -> getTeacherOptions();
            case "Admin" -> getAdminOptions();
            default -> null;
        };
    }
}
