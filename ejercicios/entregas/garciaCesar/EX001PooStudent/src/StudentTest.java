package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    void creationTest(){
        Student testStudent = new Student("Cesar", "Garcia", "25", 5.0f);
    }
    @Test
    void getName() {
        Student testStudent = new Student("Cesar", "Garcia", "25", 5.0f);

        String expectedName = "Cesar";

        assertEquals(expectedName, testStudent.getName());
    }
    @Test
    void getSurname() {
        Student testStudent = new Student("Cesar", "Garcia", "25", 5.0f);

        String expectedSurname = "Garcia";

        assertEquals(expectedSurname, testStudent.getSurname());
    }
    @Test
    void getId() {
        Student testStudent = new Student("Cesar", "Garcia", "25", 5.0f);

        String expectedId = "25";

        assertEquals(expectedId, testStudent.getId());

    }

    @Test
    void getGrade() {
        Student testStudent = new Student("Cesar", "Garcia", "25", 5.0f);

        float expectedGrade = 5.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

    @Test
    void setGrade() {
        Student testStudent = new Student("Cesar", "Garcia", "25", 5.0f);

        testStudent.setGrade(9.0f);
        float expectedGrade = 9.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }


}
