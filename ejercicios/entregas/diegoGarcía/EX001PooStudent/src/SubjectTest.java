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
        Student testStudent = new Student("Diego", "Garcia", "30", 6.0f);
        Student testStudent2 = new Student("Pablo", "Garcia", "31", 9.0f);
        Subject subject = new Subject("POO", 58);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.orderStudents();

        Student[] actualName = subject.getStudents();

        assertEquals(testStudent2, actualName[0]);
        assertEquals(testStudent, actualName[1]);

    }

    @Test
    void getAverage() {
        Student testStudent = new Student("Diego", "Garcia", "30", 9.0f);
        Student testStudent2 = new Student("Pablo", "Garcia", "31", 6.0f);
        Subject subject = new Subject("POO", 58);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.getAverageGrade();

        float expectedAverage = 7.5f ; // (testStudent.getGrade() + testStudent2.getGrade()) / subject.getPosition()
        float actualAverage = subject.getAverageGrade();

        assertEquals(expectedAverage, actualAverage);
    }
}