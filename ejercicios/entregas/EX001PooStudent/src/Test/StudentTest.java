package Test;

import org.junit.Test;
import src.Student;

import static org.junit.Assert.*;


public class StudentTest {
    private final Student student = new Student("Juan", "Pérez", "12345678A", 7.5f);

    @Test
    public void testGetName() {
        assertEquals("Juan", student.getName());
    }

    @Test
    public void testGetSurname() {
        assertEquals("Pérez", student.getSurname());
    }

    @Test
    public void testGetId() {
        assertEquals("12345678A", student.getId());
    }

    @Test
    public void testGetGrade() {
        assertEquals(7.5f, student.getGrade(), 0.0f);
    }

    @Test
    public void testSetGrade() {
        student.setGrade(8.0f);
        assertEquals(8.0f, student.getGrade(), 0.0f);
    }
}
