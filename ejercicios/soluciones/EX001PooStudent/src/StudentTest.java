import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("John", "Doe", "123456789", 5.0f);
    }
    @Test
    void getName() {
        String expected = "John";
        String actual = student.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getSurname() {
        String expected = "Doe";
        String actual = student.getSurname();
        assertEquals(expected, actual);
    }

    @Test
    void getId() {
        String expected = "123456789";
        String actual = student.getId();
        assertEquals(expected, actual);
    }

    @Test
    void getGrade() {
        float expected = 5.0f;
        float actual = student.getGrade();
        assertEquals(expected, actual);
    }
}