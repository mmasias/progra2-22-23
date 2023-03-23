package Core.Users;

import Core.Email.Email;
import Core.Options.Options;
import Utils.Enums.Subjects;
import Utils.Functions.UserActions;
import Utils.Interfaces.MenuItem;

import java.util.ArrayList;

public class Teacher extends User {
    private final Subjects subject;
    private final ArrayList<Email> emails;

    public Teacher(String username, String password, Subjects subject) {
        super(username, password);
        this.subject = subject;
        this.emails = new ArrayList<>();
        options = createTeacherOptions();
    }

    private MenuItem[] createTeacherOptions() {
        return new MenuItem[]{
                new Options("See All Students' Grades", UserActions::displayAllStudentGrades),
                new Options("Change Student Grade", UserActions::changeStudentGrade),
                new Options("Get Global Average", UserActions::getGlobalAverage),
                new Options("See Emails", UserActions::displayEmails),
                UserActions.logOutUser,
                UserActions.exitProgram
        };
    }

    public Subjects getSubject() {
        return subject;
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public ArrayList<Email> getEmails() {
        return this.emails;
    }
}
