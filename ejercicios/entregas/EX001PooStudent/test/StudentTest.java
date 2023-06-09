import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    // Prueba la creación de un objeto Student con los valores de sus atributos
    @Test
    public void testConstructor() {
        Student student = new Student("John", "Doe", "12345", 80.0f);
        assertEquals("John", student.getName());
        assertEquals("Doe", student.getSurname());
        assertEquals("12345", student.getId());
        assertEquals(80.0f, student.getGrade(), 0.0);
    }

    // Prueba la actualización de la calificación del estudiante
    @Test
    public void testSetGrade() {
        Student student = new Student("John", "Doe", "12345", 80.0f);
        student.setGrade(90.0f);
        assertEquals(90.0f, student.getGrade(), 0.0);
    }

    // Prueba la actualización del nombre del estudiante
    @Test
    public void testSetName() {
        Student student = new Student("John", "Doe", "12345", 80.0f);
        student.setName("Jane");
        assertEquals("Jane", student.getName());
    }

    // Prueba la actualización del apellido del estudiante
    @Test
    public void testSetSurname() {
        Student student = new Student("John", "Doe", "12345", 80.0f);
        student.setSurname("Smith");
        assertEquals("Smith", student.getSurname());
    }

    // Prueba la actualización del identificador del estudiante
    @Test
    public void testSetId() {
        Student student = new Student("John", "Doe", "12345", 80.0f);
        student.setId("54321");
        assertEquals("54321", student.getId());
    }
}

