import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void creationTest(){
        Student testStudent = new Student("John", "Doe", "12345", 10.0f);
    }
    @Test
    void getName() {
        Student testStudent = new Student("John", "Doe", "v", 10.0f);

        String expectedName = "John";

        assertEquals(expectedName, testStudent.getName());
    }

    @Test
    void getSurname() {
        Student testStudent = new Student("John", "Doe", "12345", 10.0f);

        String expectedSurname = "Doe";

        assertEquals(expectedSurname, testStudent.getSurname());
    }
    @Test
    void getId() {
        Student testStudent = new Student("John", "Doe", "12345", 10.0f);

        String expectedId = "12345";

        assertEquals(expectedId, testStudent.getId());

    }

    @Test
    void getGrade() {
        Student testStudent = new Student("John", "Doe", "12345", 10.0f);

        float expectedGrade = 10.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

    @Test
    void setGrade() {
        Student testStudent = new Student("John", "Doe", "12345", 10.0f);

        testStudent.setGrade(10.0f);
        float expectedGrade = 10.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }
}