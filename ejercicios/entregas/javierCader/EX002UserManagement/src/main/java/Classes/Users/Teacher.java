package Classes.Users;

import Utils.Enums.Subjects;

public class Teacher extends User {
    final private Subjects subject;

    public Teacher(String username, String password, Subjects subject) {
        super(username, password, false);
        this.subject = subject;
    }

    public Subjects getSubject() {
        return subject;
    }
}
