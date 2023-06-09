import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void creationTest(){
        Student testStudent = new Student("Sergio", "Moreno", "30", 9.0f);
    }
    @Test
    void getName() {
        Student testStudent = new Student("Sergio", "Moreno", "30", 9.0f);

        String expectedName = "Sergio";

        assertEquals(expectedName, testStudent.getName());
    }

    @Test
    void getSurname() {
        Student testStudent = new Student("Sergio", "Moreno", "30", 9.0f);

        String expectedSurname = "Moreno";

        assertEquals(expectedSurname, testStudent.getSurname());
    }
    @Test
    void getId() {
        Student testStudent = new Student("Sergio", "Moreno", "30", 9.0f);

        String expectedId = "30";

        assertEquals(expectedId, testStudent.getId());

    }

    @Test
    void getGrade() {
        Student testStudent = new Student("Sergio", "Moreno", "30", 9.0f);

        float expectedGrade = 9.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

    @Test
    void setGrade() {
        Student testStudent = new Student("Sergio", "Moreno", "30", 9.0f);

        testStudent.setGrade(6.5f);
        float expectedGrade = 6.5f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

}