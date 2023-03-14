package Classes.Users;

public class Teacher extends User {

    final private String subject;

    public Teacher(String username, String password, String subject) {
        super(username, password, false);
        this.subject = subject;
    }


    public String getSubject() {
        return subject;
    }
}
