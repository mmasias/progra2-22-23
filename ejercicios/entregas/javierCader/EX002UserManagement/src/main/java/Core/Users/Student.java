package Core.Users;

import Core.Options.Options;
import Utils.Enums.Subjects;
import Utils.Functions.UserActions;
import Utils.Interfaces.MenuItem;

public class Student extends User {
    private final Subjects[] subjects;
    private final int[] grades;

    public Student(String username, String password, int[] grades) {
        super(username, password);
        this.subjects = createSubjects();
        this.grades = grades;
        options = createStudentOptions();
    }

    private Subjects[] createSubjects() {
        return new Subjects[]{
                Subjects.MATHEMATICS_II,
                Subjects.ICT,
                Subjects.PROGRAMMING_II,
                Subjects.DISCRETE_MATHEMATICS,
                Subjects.LOGIC,
        };
    }

    private MenuItem[] createStudentOptions() {
        return new MenuItem[]{
                new Options("Display Grades", UserActions::displayGrades),
                new Options("Send Email", UserActions::studentSendEmail),
                UserActions.logOutUser,
                UserActions.exitProgram,
        };
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrade(int index, int newGrade) {
        grades[index] = newGrade;
    }

    public Subjects[] getSubjects() {
        return subjects;
    }
}
