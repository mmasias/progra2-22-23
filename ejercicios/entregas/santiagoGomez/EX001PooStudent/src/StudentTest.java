package src;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    void setGrade() {
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        float testGrade = 5.0f;
        firstStudent.setGrade(testGrade);
        assertEquals(5.0f,firstStudent.getGrade());
    }

    @Test
    void getName(){
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        assertEquals("John", firstStudent.getName());
    }

    @Test
    void getSurname(){
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        assertEquals("Doe", firstStudent.getSurname());
    }

    @Test
    void getId(){
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        assertEquals("123456", firstStudent.getId());
    }

    @Test
    void getGrade(){
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        assertEquals(5.0, firstStudent.getGrade());
    }

    @Test
    void Student(){
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        assertEquals("John", firstStudent.getName());
        assertEquals("Doe", firstStudent.getSurname());
        assertEquals("123456", firstStudent.getId());
        assertEquals(5.0f, firstStudent.getGrade());
    }

}
