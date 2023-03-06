import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class StudentTest {
    @beforeEach
    void setUp() {
        this.student = new student("David", "Montenegro", "001", 10.00f);
    }

    @test
    void createNewStudent(){
        assertNotNull(student);
    }

    @test
    void getName(){
        assertEquals("David", student.getName());
    }
    @test
    void getSurname(){
        assertEquals("Montenegro",student.getSurname());
    }

    @test
    void getId(){
        assertEquals("001",student.getId());
    }
    @test
    void getGrade() {
        assertEquals(10.00f, student.getGrade());
    }

    @test
    void setGrade() {
        student.setGrade(8.00f);
        assertEquals(8.00f, student.getGrade());
    }
}


