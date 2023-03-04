import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void creationTest(){
        Student testStudent = new Student("Diego", "Garcia", "30", 9.0f);
    }
    @Test
    void getName() {
        Student testStudent = new Student("Diego", "Garcia", "30", 9.0f);

        String expectedName = "Diego";

        assertEquals(expectedName, testStudent.getName());
    }

    @Test
    void getSurname() {
        Student testStudent = new Student("Diego", "Garcia", "30", 9.0f);

        String expectedSurname = "Garcia";

        assertEquals(expectedSurname, testStudent.getSurname());
    }
    @Test
    void getId() {
        Student testStudent = new Student("Diego", "Garcia", "30", 9.0f);

        String expectedId = "30";

        assertEquals(expectedId, testStudent.getId());

    }

    @Test
    void getGrade() {
        Student testStudent = new Student("Diego", "Garcia", "30", 9.0f);

        float expectedGrade = 9.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

    @Test
    void setGrade() {
        Student testStudent = new Student("Diego", "Garcia", "30", 9.0f);

        testStudent.setGrade(6.5f);
        float expectedGrade = 6.5f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

}