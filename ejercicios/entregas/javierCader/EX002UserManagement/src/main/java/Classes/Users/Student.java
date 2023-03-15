package Classes.Users;

import Utils.Enums.Subjects;

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
    }

    public Student(String username, String password, int[] grades, Subjects[] subjects) {
        super(username, password, false);
        this.subjects = subjects;
        this.grades = grades;

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
