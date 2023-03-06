import org.junit.Test;
import static org.junit.Assert.*;

public class SubjectTest {
    //Tests

    @Test
    public void getNameTest() {
        Subject subject = new Subject("Math", 10);
        assertEquals("Math", subject.getName());
    }

    @Test
    public void getCapacityTest() {
        Subject subject = new Subject("Math", 10);
        assertEquals(10, subject.getCapacity());
    }

    @Test
    public void getIsOrderedTest() {
        Subject subject = new Subject("Math", 10);
        assertEquals(false, subject.isOrdered());
    }

    @Test
    public void getPositionTest() {
        Subject subject = new Subject("Math", 10);
        assertEquals(0, subject.getPosition());
    }

    @Test
    public void getStudentTest() {
        Subject subject = new Subject("Math", 10);
        Student student = new Student("John", "Smith", "1", 5);
        subject.addStudent(student);
        assertEquals(student, subject.getStudents()[0]);
    }

    @Test
    public void subjectTest() {
        Subject subject = new Subject("Math", 10);
        assertEquals("Math", subject.getName());
        assertEquals(10, subject.getCapacity());
        assertEquals(false, subject.isOrdered());
        assertEquals(0, subject.getPosition());
    }

    @Test
    public void addStudentTest() {
        Subject subject = new Subject("Math", 10);
        Student student = new Student("John", "Smith", "1", 5);
        subject.addStudent(student);
        assertEquals(student, subject.getStudents()[0]);
    }

    @Test
    public void orderStudentsTest() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("Lionel", "Messi", "6789", 0.0f);
        Student student2 = new Student("Cristiano", "Ronaldo", "3456", 5.0f);
        Student student3 = new Student("Neymar", "Junior", "0123", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        subject.orderStudents();

        assertEquals(student3, subject.getStudents()[0]);
        assertEquals(student2, subject.getStudents()[1]);
        assertEquals(student1, subject.getStudents()[2]);
    }

    @Test
    public void getBestStudentTest() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("Lionel", "Messi", "6789", 0.0f);
        Student student2 = new Student("Cristiano", "Ronaldo", "3456", 5.0f);
        Student student3 = new Student("Neymar", "Junior", "0123", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        subject.orderStudents();

        assertEquals(student3, subject.getBestStudent());
    }

    @Test
    public void getWorstStudentTest() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("Lionel", "Messi", "6789", 0.0f);
        Student student2 = new Student("Cristiano", "Ronaldo", "3456", 5.0f);
        Student student3 = new Student("Neymar", "Junior", "0123", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        subject.orderStudents();

        assertEquals(student1, subject.getWorstStudent());
    }

    @Test
    public void getAverageGradeTest() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("Lionel", "Messi", "6789", 0.0f);
        Student student2 = new Student("Cristiano", "Ronaldo", "3456", 5.0f);
        Student student3 = new Student("Neymar", "Junior", "0123", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        subject.orderStudents();

        assertEquals(5.0f, subject.getAverageGrade(), 0.0f);
    }

    @Test
    public void getMedianGradeTest() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("Lionel", "Messi", "6789", 0.0f);
        Student student2 = new Student("Cristiano", "Ronaldo", "3456", 5.0f);
        Student student3 = new Student("Neymar", "Junior", "0123", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        subject.orderStudents();

        assertEquals(5.0f, subject.getMedianGrade(), 0.0f);
    }

}
