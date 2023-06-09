import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void addStudent() {
        Student testStudent = new Student("Pedro", "perez", "29", 6.5f);
        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(testStudent);

        int expectedLength = 1;
        int actualLength = subject.getPosition();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void getStudents() {

        Subject subject = new Subject("Math", 5);
        Student firstStudent = new Student("Jose", "Recinos", "1", 6.5f);
        Student secondStudent = new Student("Rigo", "Osorio", "2", 7.5f);
        Student thirdStudent = new Student("Sara", "Patino", "3", 8.5f);
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertEquals("Jane", subject.getStudent(1).getName());

    }

}