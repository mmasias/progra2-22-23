import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    @DisplayName("Test constructor of Student class.")
    void constructorTest() {
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        assertEquals("John", firstStudent.getName());
        assertEquals("Doe", firstStudent.getSurname());
        assertEquals("123456", firstStudent.getId());
        assertEquals(5.0f, firstStudent.getGrade());
    }

    @Test
    @DisplayName("set/get name")
    void studentName() {
        Student firstStudent = new Student();
        firstStudent.setName("John");
        assertEquals("John", firstStudent.getName());
    }

    @Test
    @DisplayName("set/get surname")
    void studentSurname() {
        Student firstStudent = new Student();
        firstStudent.setSurname("Doe");
        assertEquals("Doe", firstStudent.getSurname());
    }

    @Test
    @DisplayName("set/get id")
    void studentId() {
        Student firstStudent = new Student();
        firstStudent.setId("123456");
        assertEquals("123456", firstStudent.getId());
    }

    @Test
    @DisplayName("set/get grade")
    void studentGrade() {
        Student firstStudent = new Student();
        firstStudent.setGrade(4.5f);
        assertEquals(4.5f, firstStudent.getGrade());
    }

}
