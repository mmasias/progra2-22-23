mport org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void creationTest(){
        Student testStudent = new Student("Jack","Caster","1234890",8.0f);
    }
    @Test
    void getName() {
        Student testStudent = new Student("Jack","Caster","1234890",8.0f);

        String expectedName = "Jack";

        assertEquals(expectedName, testStudent.getName());
    }

    @Test
    void getSurname() {
        Student testStudent = new Student("Jack","Caster","1234890",8.0f);

        String expectedSurname = "Caster";

        assertEquals(expectedSurname, testStudent.getSurname());
    }
    @Test
    void getId() {
        Student testStudent = new Student("Jack","Caster","1234890",8.0f);

        String expectedId = "1234890";

        assertEquals(expectedId, testStudent.getId());

    }

    @Test
    void getGrade() {
        Student testStudent = new Student("Jack","Caster","1234890",8.0f);

        float expectedGrade = 8.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

    @Test
    void setGrade() {
        Student testStudent = new Student("Jack","Caster","1234890",8.0f);

        testStudent.setGrade(8.0f);
        float expectedGrade = 8.0f;

        assertEquals(expectedGrade, testStudent.getGrade());
    }

}
