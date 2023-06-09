
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testConstructor() {
        String name = "John";
        String surname = "Doe";
        String id = "12345";
        float grade = 3.5f;

        Student student = new Student(name, surname, id, grade);

        assertEquals(name, student.getName());
        assertEquals(surname, student.getSurname());
        assertEquals(id, student.getId());
        assertEquals(grade, student.getGrade(), 0); // delta is 0 to check for exact equality of floats
    }

    @Test
    public void testSetGrade() {
        float grade = 4.0f;

        Student student = new Student("John", "Doe", "12345", 3.5f);

        student.setGrade(grade);

        assertEquals(grade, student.getGrade(), 0); // delta is 0 to check for exact equality of floats
    }

    @Test
    public void testSetName() {
        String name = "Jane";

        Student student = new Student("John", "Doe", "12345", 3.5f);

        student.setName(name);

        assertEquals(name, student.getName());
    }

    @Test
    public void testSetSurname() {
        String surname = "Smith";

        Student student = new Student("John", "Doe", "12345", 3.5f);

        student.setSurname(surname);

        assertEquals(surname, student.getSurname());
    }

    @Test
    public void testSetId() {
        String id = "67890";
        Student student = new Student("John", "Doe", "12345", 3.5f);
        student.setId(id);
        assertEquals(id, student.getId());
    }
}