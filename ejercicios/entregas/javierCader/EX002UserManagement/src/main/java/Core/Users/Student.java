package Core.Users;

import Core.Options.Options;
import Utils.Enums.Subjects;
import Utils.Functions.UserActions;
import Utils.Interfaces.MenuItem;

public class Student extends User {
    private final Subjects[] subjects;
    private final int[] grades;
    public Student (String username, String password, int[] grades) {
        super(username, password, false);
        this.subjects = new Subjects[]{
                    Subjects.MATHEMATICS_II,
                    Subjects.ICT,
                    Subjects.PROGRAMMING_II,
                    Subjects.DISCRETE_MATHEMATICS,
                    Subjects.LOGIC,
        };
        this.grades = grades;
        this.options = new MenuItem[]{
                new Options("Display Grades", UserActions::displayGrades),
                new Options("Send Email", UserActions::studentSendEmail),
                UserActions.logout,
                UserActions.quit,
        };
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrade(int index, int newGrade) {
        this.grades[index] = newGrade;
    }

    public Subjects[] getSubjects() {
        return subjects;
    }
}
