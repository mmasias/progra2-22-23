package Core.Users;

import Core.Email.Email;
import Core.Options.Options;
import Utils.Enums.Subjects;
import Utils.Functions.UserActions;
import Utils.Interfaces.MenuItem;

import java.util.ArrayList;

public class Teacher extends User {
    private final Subjects subject;
    private final ArrayList<Email> emails = new ArrayList<Email>();

    public Teacher(String username, String password, Subjects subject) {
        super(username, password, false);
        this.subject = subject;
        this.options = new MenuItem[]{
                new Options("See All Students' Grades", UserActions::displayAllStudentGrades),
                new Options("Change Student Grade", UserActions::changeStudentGrade),
                new Options("Get Global Average", UserActions::getGlobalAverage),
                new Options("See Emails", UserActions::displayEmails),
                UserActions.logout,
                UserActions.quit
        };
    }

    public Subjects getSubject() {
        return subject;
    }

    public void setNewEmail(Email email) {
        emails.add(email);
    }

    public ArrayList<Email> getEmailList() {
        return this.emails;
    }
}
