package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    @Test
    void creationTest(){
        Subject subject = new Subject("Poo", 50);
    }
    @Test
    void getPosition(){
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f );
        Subject subject = new Subject("Poo", 50);
        subject.addStudent(testStudent);
        int expectedPosition = 1;
        assertEquals(expectedPosition, subject.getPosition());
    }
    @Test
    void getName() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f);
        Subject subject = new Subject("Poo", 50);
        subject.addStudent(testStudent);

        String expectedPosition = "Poo";

        assertEquals(expectedPosition, subject.getName());
    }



    @Test
    void isOrdered() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f);
        Student testStudent2 = new Student("Mario", "Perez", "10", 6.0f);
        Subject subject = new Subject("Poo", 50);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);

        boolean expectedAnswer = false;

        assertEquals(expectedAnswer, subject.isOrdered());
    }

    @Test
    void getCapacity() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f);
        Subject subject = new Subject("Poo", 50);
        subject.addStudent(testStudent);

        int expectedCapacity = 50;

        assertEquals(expectedCapacity, subject.getCapacity());
    }

    @Test
    void getStudent() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f);
        Student testStudent2 = new Student("Mario", "Perez", "10", 6.0f);
        Student testStudent3 = new Student("Juan", "Costa", "10", 5.0f);
        Subject subject = new Subject("Poo", 50);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.addStudent(testStudent3);

        assertEquals(testStudent2, subject.getStudent(1));
    }


    @Test
    void addStudent() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f);
        Subject subject = new Subject("Poo", 50);
        subject.addStudent(testStudent);

        int expectedLength = 1;
        int actualLength = subject.getPosition();

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void orderStudents() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f);
        Student testStudent2 = new Student("Mario", "Perez", "10", 7.0f);
        Subject subject = new Subject("Poo", 50);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.orderStudents();

        Student[] actualName = subject.getStudents();

        assertEquals(testStudent2, actualName[0]);
        assertEquals(testStudent, actualName[1]);

    }

    @Test
    void getAverage() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f);
        Student testStudent2 = new Student("Mario", "Perez", "10", 9.0f);
        Subject subject = new Subject("Poo", 50);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.getAverageGrade();

        float expectedAverage = 7.5f ;
        float actualAverage = subject.getAverageGrade();

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void getBestStudent() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 8.0f);
        Student testStudent2 = new Student("Mario", "Perez", "10", 7.0f);
        Subject subject = new Subject("Poo", 50);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);

        String expectedStudent = "Cesar Garcia";

        assertEquals(expectedStudent, subject.getBestStudent());

    }

    @Test
    void getWorstStudent() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f);
        Student testStudent2 = new Student("Mario", "Perez", "10", 4.0f);
        Subject subject = new Subject("Poo", 50);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);

        String expectedStudent = "Mario Perez";

        assertEquals(expectedStudent, subject.getWorstStudent());
    }


    @Test
    void getMedian() {
        Student testStudent = new Student("Cesar", "Garcia", "15", 6.0f);
        Student testStudent2 = new Student("Mario", "Perez", "10", 6.0f);
        Student testStudent3 = new Student("Juan", "Costa", "12", 6.0f);
        Subject subject = new Subject("Poo", 50);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.addStudent(testStudent3);

        float expectedGrade = 6.0f;

        assertEquals(expectedGrade, subject.getMedian());
    }

}