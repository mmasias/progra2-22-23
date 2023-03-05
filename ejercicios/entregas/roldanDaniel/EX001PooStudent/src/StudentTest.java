import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void validateConstructorWithId() {
        Student student = new Student("John", "Doe", "123456", 8.5f);
        assertEquals("John", student.getName());
        assertEquals("Doe", student.getSurname());
        assertEquals("123456", student.getId());
        assertEquals(8.5f, student.getGrade(), 0.01f);
    }

    @Test
    public void validateConstructorWithoutId() {
        Student student = new Student("John", 8.5f);
        assertEquals("John", student.getName());
        assertNull(student.getSurname());
        assertNull(student.getId());
        assertEquals(8.5f, student.getGrade(), 0.01f);
    }

    @Test
    public void validateSettersAndGetters() {
        Student student = new Student("John", "Doe", "123456", 8.5f);
        student.setName("Jane");
        student.setSurname("Smith");
        student.setId("789012");
        student.setGrade(7.0f);
        assertEquals("Jane", student.getName());
        assertEquals("Smith", student.getSurname());
        assertEquals("789012", student.getId());
        assertEquals(7.0f, student.getGrade(), 0.01f);
    }
}
