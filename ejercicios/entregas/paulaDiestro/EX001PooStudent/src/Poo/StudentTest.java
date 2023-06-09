package Poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testStudent(){
        Student testStudent = new Student("Paula", "Diestro", "24", 5.0f);
    }
    @Test
    void getName() {
        Student testStudent = new Student("Paula", "Diestro", "24", 5.0f);
        String expectedName = "Paula";
        assertEquals(expectedName, testStudent.getName());
    }
    @Test
    void getSurname() {
        Student testStudent = new Student("Paula", "Diestro", "24", 5.0f);
        String expectedSurname = "Diestro";
        assertEquals(expectedSurname, testStudent.getSurname());
    }
    @Test
    void getId() {
        Student testStudent = new Student("Paula", "Diestro", "24", 5.0f);
        String expectedId = "24";
        assertEquals(expectedId, testStudent.getId());
    }
    @Test
    void getGrade() {
        Student testStudent = new Student("Paula", "Diestro", "24", 5.0f);
        float expectedGrade = 5.0f;
        assertEquals(expectedGrade, testStudent.getGrade());
    }
    @Test
    void setGrade() {
        Student testStudent = new Student("Paula", "Diestro", "24", 5.0f);
        testStudent.setGrade(5.0f);
        float expectedGrade = 5.0f;
        assertEquals(expectedGrade, testStudent.getGrade());
    }
}