import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void createStudent() {
        Student createstudent = new Student("Jose", "Rasilla", "0001", 9f);
        String expectName = "Jose";
        String expectSurname = "Rasilla";
        String expectId = "0001";
        float expectGrade = 9f;
        assertEquals(expectName, createstudent.getName());
        assertEquals(expectSurname, createstudent.getSurname());
        assertEquals(expectId, createstudent.getId());
        assertEquals(expectGrade, createstudent.getGrade());
    }

    @Test
    void getId() {
        Student testStudent = new Student("Jose", "Rasilla", "0001", 9f);
        String expectedId="0001";
        assertEquals(expectedId, testStudent.getId());
    }

    @Test
    void getName() {
        Student testStudent = new Student("Jose", "Rasilla", "0001", 9f);
        String expectedName2 = "Jose";
        assertEquals(expectedName2, testStudent.getName());
    }

    @Test
    void getSurname() {
        Student testStudent = new Student("Jose", "Rasilla", "0001", 9f);
        String expectedSurname2="Rasilla";
        assertEquals(expectedSurname2, testStudent.getSurname());
    }



    @Test
    void getGrade() {
        Student testStudent = new Student("Jose", "Rasilla", "0001", 9f);
        Float expectedGrade2= 9f;
        assertEquals(expectedGrade2, testStudent.getGrade());
    }

    @Test
    void setGrade() {
        Student testStudent = new Student("Jose", "Rasilla", "0001", 9f);
        testStudent.setGrade(10f);
        Float expectedGrade3= 10f;
        assertEquals(expectedGrade3, testStudent.getGrade());
    }
}