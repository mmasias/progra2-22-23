package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void setGrade() {
        Student studentOne = new Student("John", "Doe", "123456", 2.0f);
        float gradeTest = 5.50f;
        studentOne.setGrade(gradeTest);
        assertEquals(5.50f, studentOne.getGrade());
    }

    @Test
    void getName() {
        Student studentTwo = new Student("Jane", "Smith", "123457", 2.0f);
        assertEquals("Jane", studentTwo.getName());
    }

    @Test
    void getSurname() {
        Student studentThree = new Student("James", "Bailey", "123458", 2.5f);
        assertEquals("Bailey", studentThree.getSurname());
    }

    @Test
    void getId() {
        Student studentFour = new Student("Sam", "Nailor", "123459", 2.0f);
        assertEquals("123459", studentFour.getId());
    }

    @Test
    void getGrade() {
        Student studentFive = new Student("Derek", "Neville", "123460", 1.9f);
        assertEquals(1.9f, studentFive.getGrade());
    }

    @Test
    void Student() {
        Student studentSix = new Student("Josh", "Raken", "123461", 1.5f);
        assertEquals("Josh", studentSix.getName());
        assertEquals("Raken", studentSix.getSurname());
        assertEquals("123461", studentSix.getId());
        assertEquals(1.5f, studentSix.getGrade());
    }
}