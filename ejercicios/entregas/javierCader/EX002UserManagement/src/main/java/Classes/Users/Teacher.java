package Classes.Users;

import Interfaces.MenuItem;

public class Teacher extends User {
    private MenuItem[] options;
    private String subject;

    public Teacher(String username, String password, String subject) {
        this.username = username;
        this.password = password;
        this.subject = subject;
        this.options = this.GeneralOptions.getTeacherOptions();
        this.login = false;
    }

    public MenuItem[] getOptions() {
        return options;
    }

    public String getSubject() {
        return subject;
    }
}
