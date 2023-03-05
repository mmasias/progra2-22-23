
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubjectTest {

    private Subject subject;

    @BeforeEach
    public void setUp() {
        subject = new Subject("Math", 5);

        subject.addStudent(new Student("Alice", 85));
        subject.addStudent(new Student("Bob", 70));
        subject.addStudent(new Student("Charlie", 92));
        subject.addStudent(new Student("Dave", 77));
        subject.addStudent(new Student("Eve", 90));
    }

    @Test
    public void validateAddStudent() {
       assertEquals(5, subject.getPosition());
    }

    @Test
    public void validateOrderStudents() {
        subject.orderStudents();
        assertEquals("Charlie", subject.getBestStudent().getName());
        assertEquals("Bob", subject.getWorstStudent().getName());
    }

    @Test
    public void validateGetMedian() {
        subject.orderStudents();
        assertEquals(85.0f, subject.getMedian(), 0.1f);
    }

    @Test
    public void validateGetAverageGrade() {
        assertEquals(82.8f, subject.getAverageGrade(), 0.1f);
    }

    @Test
    public void validateGetBestStudent() {
        subject.orderStudents();
        assertEquals("Charlie", subject.getBestStudent().getName());
    }

    @Test
    public void validateGetWorstStudent() {
        subject.orderStudents();
        assertEquals("Bob", subject.getWorstStudent().getName());
    }
}
