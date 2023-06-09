import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testConstructor() {
        Student student = new Student("Juan", "perez", "777", 6f);
        assertEquals("Juan", student.getName());
        assertEquals("perez", student.getSurname());
        assertEquals("777", student.getId());
        assertEquals(6f, student.getGrade());
    }

    @Test
    void testSetName() {
        Student student = new Student("Juan", "perez", "777", 6f);
        student.setName("Juan");
        assertEquals("Juan", student.getName());
    }

    @Test
    void testSetSurname() {
        Student student = new Student("Juan", "perez", "777", 6f);
        student.setSurname("perez");
        assertEquals("perez", student.getSurname());
    }

    @Test
    void testSetId() {
        Student student = new Student("Juan", "perez", "777", 6f);
        student.setId("777");
        assertEquals("777", student.getId());
    }

    @Test
    void testSetGrade() {
        Student student = new Student("Juan", "perez", "777", 6f);
        student.setGrade(6f);
        assertEquals(6f, student.getGrade());
    }
}
