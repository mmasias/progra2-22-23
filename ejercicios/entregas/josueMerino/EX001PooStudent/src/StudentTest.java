import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

//    @BeforeEach
//    void setUp() {
//
//    }

    @Test
    void setGrade() {
        Student student = new Student("Josué", "Merino", "123456", 7.5f);
        float expectedGrade = 5.8f;
        student.setGrade(expectedGrade);
        assertEquals(expectedGrade, student.getGrade());
    }

    @Test
    void getGrade() {
        Student student = new Student("Josué", "Merino", "123456", 7.5f);
        assertEquals(7.5f, student.getGrade());
    }

    @Test
    void getName() {
        Student student = new Student("Josué", "Merino", "123456", 7.5f);
        assertEquals("Josué", student.getName());
    }

    @Test
    void getSurname() {
        Student student = new Student("Josué", "Merino", "123456", 7.5f);
        assertEquals("Merino", student.getSurname());
    }

    @Test
    void getId() {
        Student student = new Student("Josué", "Merino", "123456", 7.5f);
        assertEquals("123456", student.getId());
    }
}