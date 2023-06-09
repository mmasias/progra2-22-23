import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    //Tests

    @Test
    public void getNameTest() {
        Student student = new Student("John", "Smith", "1", 5);
        assertEquals("John", student.getName());
    }

    @Test
    public void getSurnameTest() {
        Student student = new Student("John", "Smith", "1", 5);
        assertEquals("Smith", student.getSurname());
    }

    @Test
    public void getIdTest() {
        Student student = new Student("John", "Smith", "1", 5);
        assertEquals("1", student.getId());
    }

    @Test
    public void getGradeTest() {
        Student student = new Student("John", "Smith", "1", 5);
        assertEquals(5, student.getGrade(), 0.001);
    }

    @Test
    public void setGradeTest() {
        Student student = new Student("John", "Smith", "1", 5);
        student.setGrade(6);
        assertEquals(6, student.getGrade(), 0.001);
    }

    @Test
    public void studentTest() {
        Student student = new Student("John", "Smith", "1", 5);
        assertEquals("John", student.getName());
        assertEquals("Smith", student.getSurname());
        assertEquals("1", student.getId());
        assertEquals(5, student.getGrade(), 0.001);
    }
}
