package Utils.Functions;

import Classes.Cypher.Enigma;
import Classes.DataBase.UserDataBase;
import Classes.Email.Email;
import Classes.Manager.Manager;
import Classes.Options.Options;
import Classes.Users.Student;
import Classes.Users.Teacher;
import Classes.Users.User;
import Utils.Enums.EditTypes;
import Utils.Enums.Subjects;
import Utils.Interfaces.MenuItem;

import java.util.Scanner;

public abstract class UserActions {
    private static void logout() {
        Manager.currentUser.setLogin(false);
    }
    private static void quit() {
        System.exit(0);
    }
    public static final MenuItem quit = new Options("Quit", UserActions::quit);
    public static final MenuItem logout = new Options("Logout", UserActions::logout);
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayGrades() {
        Subjects[] subjects = ((Student) Manager.currentUser).getSubjects();
        int[] grades = ((Student) Manager.currentUser).getGrades();
        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("%c %s: %d %s", '>', subjects[i].getStringValue(), grades[i], System.lineSeparator());
        }
    }

    public static void studentSendEmail() {
        System.out.println("Teacher's subject");
        String subject = scanner.nextLine();
        if (!validateSubject(subject)) {
            throw new IllegalArgumentException("Invalid Subject");
        }
        Teacher teacher = ((Teacher) getSubjectTeacher(subject));
        if (teacher == null) {
            throw new IllegalArgumentException("Invalid Teacher");
        }
        System.out.printf("Teacher: %s %n", teacher.getUsername());
        String message = scanner.nextLine();
        teacher.setNewEmail(new Email(Manager.currentUser.getUsername(), message));
        System.out.println("Email sent!");
    }

    public static void getGlobalAverage() {
        int totalGrade = 0;
        int totalStudents = 0;
        Subjects teacherSubject = ((Teacher) Manager.currentUser).getSubject();
        for (User user : UserDataBase.getUsers()) {
            if (user instanceof  Student student) {
                totalGrade += getGrades(student, teacherSubject);
                totalStudents += getTotalStudents(student, teacherSubject);
            }
        }
        System.out.printf("Global Average of %s: %d %n", teacherSubject, totalGrade/totalStudents);
    }

    public static void displayAllStudentGrades() {
        Subjects teacherSubject = ((Teacher) Manager.currentUser).getSubject();
        System.out.printf("Grades of %s:%n", teacherSubject);
        for (User user : UserDataBase.getUsers()) {
            if (user instanceof Student student) {
                int grade = getGrades(student, teacherSubject);
                System.out.printf("> %s: %d%n",
                        student.getUsername(),
                        grade
                );
            }
        }
    }

    public static void displayAllUsers() {
        System.out.println("All users:");
        for (int i = 0; i < UserDataBase.getUsers().length; i++) {
            System.out.printf("%d %s %n", i+1, UserDataBase.getUsers()[i].getUsername());
        }
    }

    public static void changeStudentGrade() {
        Subjects teacherSubject = ((Teacher) Manager.currentUser).getSubject();
        System.out.println("Student to change grade");
        String student = scanner.nextLine();
        if (!validateStudent(student)) {
            throw new IllegalArgumentException("Invalid student username");
        }
        for (User user : UserDataBase.getUsers()) {
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

    public static void displayEmails() {
        System.out.println("Your emails: ");
        for (Email email : ((Teacher) Manager.currentUser).getEmailList()) {
            System.out.println("*".repeat(40));
            System.out.printf("Sender: %s %n", email.getSender());
            System.out.printf("Date: %s %n", email.getDate());
            System.out.printf("Message: %s %n", email.getMessage());
            System.out.println("*".repeat(40));
        }
    }

    public static void editUser(EditTypes operationType) {
        displayAllUsers();
        System.out.println("(Input the number)");
        int selectedUser = scanner.nextInt();
        scanner.nextLine();
        User user = validateUser(selectedUser);
        System.out.printf("Input the new %s %n", operationType == EditTypes.EDIT_USER ? "username" : "password");
        String updatedValue = scanner.nextLine();
        switch (operationType) {
            case EDIT_USER -> user.setUsername(updatedValue);
            case EDIT_PASSWORD -> user.setPassword(Enigma.encrypt(updatedValue));
            default -> throw new IllegalArgumentException("Non existent action");
        }
    }

    public static void getEnigmaKey() {
        Enigma.getKey();
    }

    //Internal Functions
    private static boolean validateSubject(String subject) {
        for (Subjects studentSubject : ((Student) Manager.currentUser).getSubjects()) {
            if (studentSubject.getStringValue().equalsIgnoreCase(subject)) {
                return true;
            }
        }
        return false;
    }

    private static User getSubjectTeacher(String subject) {
        for (User user : UserDataBase.getUsers()) {
            if (user instanceof Teacher && ((Teacher) user).getSubject().getStringValue().equalsIgnoreCase(subject)) {
                return user;
            }
        }
        return null;
    }

    private static int getTotalStudents(Student student, Subjects teacherSubject) {
        Subjects[] subjects = student.getSubjects();
        for (Subjects subject : subjects) {
            if (subject.equals(teacherSubject)) {
                return 1;
            }
        }
        return 0;
    }

    private static int getGrades(Student student, Subjects teacherSubject) {
        Subjects[] subjects = student.getSubjects();
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i].equals(teacherSubject)) {
                return student.getGrades()[i];
            }
        }
        return 0;
    }

    private static boolean validateStudent(String studentName) {
        for (User user : UserDataBase.getUsers()) {
            if (user instanceof Student student && (student.getUsername().equalsIgnoreCase(studentName))){
                return true;
            }
        }
        return false;
    }

    private static User validateUser(int selectedUserIndex) {
        if (selectedUserIndex <= 0 || selectedUserIndex > UserDataBase.getUsers().length) {
            throw new IllegalArgumentException("Non existent user");
        }
        return UserDataBase.getUsers()[selectedUserIndex - 1];
    }
}
