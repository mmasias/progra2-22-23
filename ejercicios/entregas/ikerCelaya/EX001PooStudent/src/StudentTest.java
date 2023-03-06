import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void createStudent() {
        Student createstudent = new Student("Sarah", "Cameron", "0002", 5.5f);
        String expectedName = "Sarah";
        String expectedSurname = "Cameron";
        String expectedId = "0002";
        float expectedGrade = 5.5f;
        assertEquals(expectedName, createstudent.getName());
        assertEquals(expectedSurname, createstudent.getSurname());
        assertEquals(expectedId, createstudent.getId());
        assertEquals(expectedGrade, createstudent.getGrade());
    }

    @Test
    void getName() {
        Student testStudent2 = new Student("John", "Smith", "0001", 6.5f);
        String expectedName2 = "John";
        assertEquals(expectedName2, testStudent2.getName());
    }

    @Test
    void getSurname() {
        Student testStudent2 = new Student("John", "Smith", "0001", 6.5f);
        String expectedSurname2="Smith";
        assertEquals(expectedSurname2, testStudent2.getSurname());
    }

    @Test
    void getId() {
        Student testStudent2 = new Student("John", "Smith", "0001", 6.5f);
        String expectedId="0001";
        assertEquals(expectedId, testStudent2.getId());
    }

    @Test
    void getGrade() {
        Student testStudent2 = new Student("John", "Smith", "0001", 6.5f);
        Float expectedGrade2= 6.5f;
        assertEquals(expectedGrade2, testStudent2.getGrade());
    }

    @Test
    void setGrade() {
        Student testStudent2 = new Student("John", "Smith", "0001",6.5f);
        //Float testGrade = new Student.setGrade(7.5f);
        testStudent2.setGrade(7.5f);
        Float expectedGrade3= 7.5f;
        assertEquals(expectedGrade3, testStudent2.getGrade());
    }
}