import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void addStudent() {
        Student testStudent = new Student("Diego", "Garcia", "30", 9.5f);
        Subject subject = new Subject("POO", 58);
        subject.addStudent(testStudent);

        int expectedLength = 1;
        int actualLength = subject.getPosition();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void orderStudents() {
    }

    @Test
    void getMedian() {
    }

    @Test
    void getAverage() {
    }
}