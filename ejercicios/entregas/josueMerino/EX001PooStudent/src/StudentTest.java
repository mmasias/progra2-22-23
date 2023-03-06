import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void Student() {
        Student student = new Student("Josué", "Merino", "123456", 7.5f);
        assertEquals("Josué", student.getName());
        assertEquals("Merino", student.getSurname());
        assertEquals("123456", student.getId());
        assertEquals(7.5f, student.getGrade());
    }

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