package Classes.Users;
public class Student extends User {
    private final String[] subjects;
    private final int[] grades;
    public Student (String username, String password, int[] grades) {
        super(username, password, false);
        this.subjects = new String[] {"Programación II", "TIC", "IGPS", "Física"};
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrade(int index, int newGrade) {
        this.grades[index] = newGrade;
    }

    public String[] getSubjects() {
        return subjects;
    }
}
