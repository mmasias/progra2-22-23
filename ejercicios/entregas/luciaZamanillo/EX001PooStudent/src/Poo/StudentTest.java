package Poo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    @Test
    void getName() {
        Student studentOne = new Student("James", "Nolan", "564123", 6.3f);
        assertEquals("James", studentOne.getName());
    }

    @Test
    void getSurname() {
        Student studentTwo = new Student("Mary", "Mills", "987654", 4.2f);
        assertEquals("Mills", studentTwo.getSurname());
    }

    @Test
    void getId() {
        Student studentThree = new Student("David", "Lopez", "741852", 9.3f);
        assertEquals("741852", studentThree.getId());
    }

    @Test
    void getGrade() {
        Student studentFour = new Student("Killian", "Jones", "654123", 5.1f);
        assertEquals(5.1f, studentFour.getGrade());
    }

    @Test
    void setGrade() {
        Student studentFive = new Student("Gemma", "Swan", "9431267", 8.02f);
        float gradeTest = 8.52f;
        studentFive.setGrade(gradeTest);
        assertEquals(8.52f, studentFive.getGrade());
    }

    @Test
    void Student() {
        Student studentSix = new Student("Oscar", "Suarez", "134679", 3.24f);
        assertEquals("Oscar", studentSix.getName());
        assertEquals("Suarez", studentSix.getSurname());
        assertEquals("134679", studentSix.getId());
        assertEquals(3.24f, studentSix.getGrade());
    }
}
