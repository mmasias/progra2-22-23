import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    Subject subject;
    Student firstStudent;
    Student secondStudent;
    Student thirdStudent;
    @BeforeEach
    void setUp() {
        subject = new Subject("Math", 10);

        firstStudent = new Student("John", "Doe", "123456789", 6);
        secondStudent = new Student("Jane", "Doe", "987654321", 10);
        thirdStudent = new Student("Jack", "Doe", "123456789", 5);

    }
    @Test
    void addStudent() {
        subject.addStudent(secondStudent);

        int expectedPosition = 1;
        int actualPosition = subject.getPosition();

        assertEquals(expectedPosition, actualPosition);
    }

    @Test
    void orderStudents() {

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        subject.orderStudents();

        String expectedStudentId = secondStudent.getId();
        String actualStudentId = subject.getStudents()[0].getId();

        assertEquals(expectedStudentId, actualStudentId);
    }

    @Test
    void getMedian() {

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        float expectedMedian = 6;
        float actualMedian = subject.getMedian();

        assertEquals(expectedMedian, actualMedian);

    }

    @Test
    void getAverageGrade() {
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        float expectedAverage = 7;
        float actualAverage = subject.getAverageGrade();

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void getPosition() {
        subject = new Subject("Math", 10);
        int expectedPosition = 0;
        int actualPosition = subject.getPosition();

        assertEquals(expectedPosition, actualPosition);

    }

    @Test
    void getBestStudent() {

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        String expectedStudentId = secondStudent.getId();
        String actualStudentId = subject.getBestStudent().getId();

        assertEquals(expectedStudentId, actualStudentId);
    }

    @Test
    void getWorstStudent() {

            subject.addStudent(firstStudent);
            subject.addStudent(secondStudent);
            subject.addStudent(thirdStudent);

            String expectedStudentId = thirdStudent.getId();
            String actualStudentId = subject.getWorstStudent().getId();

            assertEquals(expectedStudentId, actualStudentId);
    }

    @Test
    void getName() {
        subject = new Subject("Math", 10);
        String expectedName = "Math";
        String actualName = subject.getName();

        assertEquals(expectedName, actualName);
    }

    @Test
    void getStudents() {
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);

        String expectedStudentIdFirstPosition = firstStudent.getId();
        String actualStudentIdFirstPosition = subject.getStudents()[0].getId();

        assertEquals(expectedStudentIdFirstPosition, actualStudentIdFirstPosition);

    }

    @Test
    void getCapacity() {

        int expectedCapacity = 10;
        int actualCapacity = subject.getCapacity();

        assertEquals(expectedCapacity, actualCapacity);

    }
}