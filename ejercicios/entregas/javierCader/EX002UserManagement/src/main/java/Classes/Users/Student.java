package Classes.Users;

import Interfaces.MenuItem;

public class Student extends User {
    private MenuItem[] options;
    private String[] subjects;
    private int[] grades;
    public Student (String username, String password, int[] grades) {
        this.username = username;
        this.password = password;
        this.login = false;
        this.subjects = new String[] {"Programación II", "TIC", "IGPS", "Física"};
        this.grades = grades;
        this.options = this.GeneralOptions.getStudentOptions();
    }

    public int[] getGrades() {
        return grades;
    }

    public MenuItem[] getOptions() {
        return options;
    }

    public String[] getSubjects() {
        return subjects;
    }
}
