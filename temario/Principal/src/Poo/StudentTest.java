
package Poo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {
    @Test
    void getName() {
        Student student = new Student();
        assertEquals("John", student.getName());
    }

    @Test
    void validateName() {
        Student student = new Student();
        student.setName("Jane");
        assertEquals("Jane", student.getName());
    }
}