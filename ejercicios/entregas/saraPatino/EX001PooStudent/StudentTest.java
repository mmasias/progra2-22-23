import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    void studentName() {
        Student firstStudent = new Student();
        firstStudent.setName("Sara");
        assertEquals("Sara", firstStudent.getName());
    }

    @Test
    void studentSurname() {
        Student firstStudent = new Student();
        firstStudent.setSurname("Patino");
        assertEquals("Patino", firstStudent.getSurname());
    }

    @Test
    void studentId() {
        Student firstStudent = new Student();
        firstStudent.setId("1");
        assertEquals("1", firstStudent.getId());
    }

    @Test
    void studentGrade() {
        Student firstStudent = new Student();
        firstStudent.setGrade(0.5f);
        assertEquals(9.5f, firstStudent.getGrade());
    }

}