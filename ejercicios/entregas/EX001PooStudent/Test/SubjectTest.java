import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SubjectTest {

        @Test
        public void testOrderStudents() {
            Subject subject = new Subject("Math", 5);
            Student student1 = new Student("Mario", "Garcia", "111", 4.5f);
            Student student2 = new Student("Luis", "Gomez", "222", 4.0f);
            Student student3 = new Student("Carlos", "Lopez", "333", 3.0f);
            subject.addStudent(student1);
            subject.addStudent(student2);
            subject.addStudent(student3);
            subject.orderStudents();
            assertEquals(student1, subject.getStudents()[0]);
            assertEquals(student2, subject.getStudents()[1]);
            assertEquals(student3, subject.getStudents()[2]);
        }


    @Test
    public void testAddStudent() {
        Subject subject = new Subject("Math", 5);
        Student student1 = new Student("Mario", "Garcia", "111", 4.5f);
        subject.addStudent(student1);
        assertEquals(1, subject.getPosition());
    }

    @Test
    public void testGetAverageGrade() {
        Subject subject = new Subject("Math", 5);
        Student student1 = new Student("Mario", "Garcia", "111", 4.5f);
        Student student2 = new Student("Luis", "Gomez", "222", 4.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        assertEquals(4.25f, subject.getAverageGrade());
    }

    @Test
    public void testGetMedian() {
        Subject subject = new Subject("Math", 5);
        Student student1 = new Student("Mario", "Garcia", "111", 4.5f);
        Student student2 = new Student("Luis", "Gomez", "222", 4.0f);
        Student student3 = new Student("Carlos", "Lopez", "333", 3.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        assertEquals(4.0f, subject.getMedian());
    }

    @Test
    public void testGetBestStudent() {
        Subject subject = new Subject("Math", 5);
        Student student1 = new Student("Mario", "Garcia", "111", 4.5f);
        Student student2 = new Student("Luis", "Gomez", "222", 4.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        assertEquals(student1, subject.getBestStudent());
    }

    @Test
    public void testGetWorstStudent() {
        Subject subject = new Subject("Math", 5);
        Student student1 = new Student("Mario", "Garcia", "111", 4.5f);
        Student student2 = new Student("Luis", "Gomez", "222", 4.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        assertEquals(student2, subject.getWorstStudent());
    }



}
