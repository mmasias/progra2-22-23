import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.student = new Student("Javier", "Cader", "001", 10.00f);
    }
    @org.junit.jupiter.api.Test
    void createNewStudent() {
        assertNotNull(student);
    }

    @org.junit.jupiter.api.Test
    void getStudentName() {
        assertEquals("Javier", student.getName());
    }

    @org.junit.jupiter.api.Test
    void getSurnameTest() {
        assertEquals("Cader", student.getSurname());
    }

    @org.junit.jupiter.api.Test
    void getId() { assertEquals("001", student.getId()); }

    @org.junit.jupiter.api.Test
    void getGrade() {
        assertEquals(10.00f, student.getGrade());
    }

    @org.junit.jupiter.api.Test
    void setNewGrade() { student.setGrade(9.85f); assertEquals(9.85f, student.getGrade()); }
}