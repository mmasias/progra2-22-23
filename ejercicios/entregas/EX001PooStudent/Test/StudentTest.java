import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGetName() {
        Student student = new Student("Javier", "Ruiz", "1000", 9.5f);
        assertEquals("Javier", student.getName());
    }


    @Test
    public void testGetSurname() {
        Student student = new Student("Javier", "Ruiz", "1000", 9.5f);
        assertEquals("Ruiz", student.getSurname());
    }


    @Test
    public void testGetId() {
        Student student = new Student("Javier", "Ruiz", "1000", 9.5f);
        assertEquals("1000", student.getId());
    }


    @Test
    public void testGetGrade() {
        Student student = new Student("Javier", "Ruiz", "1000", 9.5f);
        assertEquals(9.5f, student.getGrade(), 0.001f);
    }

    @Test
    public void testSetGrade() {
        Student student = new Student("Javier", "Ruiz", "1000", 9.5f);
        student.setGrade(8.0f);
        assertEquals(8.0f, student.getGrade(), 0.001f);
    }
}
