import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student s;
    @BeforeEach
    void setUp() {
        s=new Student("Alberto","Manzano","123459",7);
    }

    @Test
    void getName() {
        assertEquals("Alberto",s.getName());
    }

    @Test
    void getSurname() {
        assertEquals("Manzano",s.getSurname());
    }

    @Test
    void getId() {
        assertEquals("123459",s.getId());
    }

    @Test
    void getGrade() {
        assertEquals(7,s.getGrade());
    }
}