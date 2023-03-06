import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void getName(){
        Subject testSubject = new Subject("Programación II", 58);
        String expectedName = "Programación II";
        assertEquals(expectedName, "Programación II");
    }

    @Test
    void getCapacity(){
        Subject testSubject = new Subject("Programación II", 58);
        int expectedCapacity = 58;
        assertEquals(expectedCapacity, 58);
    }

    @Test
    void getIsOrdered(){
        Student testStudent = new Student("Iker", "Celaya", "10", 6.0f);
        Student testStudent2 = new Student("Marcos", "Sánchez", "11", 9.0f);
        Subject subject = new Subject("POO", 58);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.orderStudents();
        Student[] expected = new Student[58];
        expected[0] = testStudent2;
        expected[1] = testStudent;

        boolean equals = Arrays.equals(expected, subject.getStudent());

        assertEquals(true, equals);
    }

    @Test
    void getPosition(){
        Student testStudent = new Student("Iker", "Celaya", "10", 6.0f);
        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(testStudent);

        int expectedPosition = 1;

        assertEquals(expectedPosition, subject.getPosition());
    }

    @Test
    void getStudent(){
        Student testStudent = new Student("Iker", "Celaya", "10", 6.0f);
        Subject subject = new Subject("Programación II", 58);

        subject.addStudent(testStudent);

        assertEquals(testStudent, subject.getStudent());
    }

    @Test
    void addStudent() {
        Student testStudent = new Student("Iker", "Celaya", "10", 6.0f);
        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(testStudent);

        int expectedLength = 1;
        int actualLength = subject.getPosition();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void orderStudents() {
            Student testStudent = new Student("Iker", "Celaya", "10", 6.0f);
            Student testStudent2 = new Student("Marcos", "Sánchez", "11", 9.0f);
            Subject subject = new Subject("Programación II", 58);

            subject.addStudent(testStudent);
            subject.addStudent(testStudent2);
            subject.orderStudents();

            Student[] currentName = subject.getStudent();

            assertEquals(testStudent2, currentName[0]);
            assertEquals(testStudent, currentName[1]);
    }

    @Test
    void getMedian() {
        Student testStudent = new Student("Iker", "Celaya", "10", 6.0f);
        Student testStudent2 = new Student("Marcos", "Sánchez", "11", 9.0f);
        Student testStudent3 = new Student("Daniel", "Pérez", "12", 4.0f);
        Subject subject = new Subject("Programación II", 58);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.addStudent(testStudent3);

        float expectedGrade = 6.0f;

        assertEquals(expectedGrade, subject.getMedian());
    }

    @Test
    void getAverage() {
        Student testStudent = new Student("Iker", "Celaya", "10", 6.0f);
        Student testStudent2 = new Student("Marcos", "Sánchez", "11", 9.0f);
        Subject subject = new Subject("POO", 58);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.getAverageGrade();

        float expectedAverage = 7.5f ;
        float actualAverage = subject.getAverageGrade();

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void getBestStudent() {
        Student testStudent = new Student("Iker", "Celaya", "10", 6.0f);
        Student testStudent2 = new Student("Marcos", "Sánchez", "11", 9.0f);
        Subject subject = new Subject("POO", 58);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);

        String expectedStudent = "Marcos Sánchez";

        assertEquals(expectedStudent, subject.getBestStudent());
    }

    @Test
    void getWorstStudent() {
        Student testStudent = new Student("Iker", "Celaya", "10", 6.0f);
        Student testStudent2 = new Student("Marcos", "Sánchez", "11", 9.0f);
        Subject subject = new Subject("POO", 58);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);

        String expectedStudent = "Iker Celaya";

        assertEquals(expectedStudent, subject.getWorstStudent());
    }
}