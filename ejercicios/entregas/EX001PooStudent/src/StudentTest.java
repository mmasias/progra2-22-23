import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void creationTest(){
        Student testStudent = new Student("Thomas", "Brown", "123455", 2.0f);
    }
    @Test
    void getName() {
        Student testStudent = new Student("Thomas", "Brown", "123455", 2.0f);

        String expectedName = "Thomas";

        assertEquals(expectedName, testStudent.getName());
    }

    @Test
    void getSurname() {
        Student testStudent = new Student("Thomas", "Brown", "123455", 2.0f);

        String expectedSurname = "Brown";

        assertEquals(expectedSurname, testStudent.getSurname());
    }
    @Test
    void getId() {
        Student testStudent = new Student("Thomas", "Brown", "123455", 2.0f);

        String expectedId = "123455";

        assertEquals(expectedId, testStudent.getId());

    }

    @Test
    void getGrade() {
        Student testStudent = new Student("Thomas", "Brown", "123455", 2.0f);

        float expectedGrade = 2.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

    @Test
    void setGrade() {
        Student testStudent = new Student("Thomas", "Brown", "123455", 2.0f);

        testStudent.setGrade(2.0f);
        float expectedGrade = 2.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

}
