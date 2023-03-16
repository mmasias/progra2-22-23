import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    @Test
    void getName(){
        Subject testSubject = new Subject("Coding2", 70);
        String expectedName = "Coding2";
        assertEquals(expectedName, testSubject.getName());
    }

    @Test
    void getCapacity(){
        Subject testSubject = new Subject("Coding2", 70);
        int expectedCapacity = 70;
        assertEquals(expectedCapacity, testSubject.getCapacity());
    }

    @Test
    void getIsOrdered(){
        Student student1 = new Student("Jose", "Rasilla", "001", 10f);
        Student student2 = new Student("Diego", "Garcia", "002", 9.0f);
        Subject subject1 = new Subject("Coding2", 70);

        subject1.addStudent(student1);
        subject1.addStudent(student2);
        subject1.orderStudents();
        Student[] expected = new Student[70];
        expected[0] = student1;
        expected[1] = student2;

        boolean equals = Arrays.equals(expected, subject1.getStudents());
        assertEquals(true, equals);
    }

    @Test
    void getPosition(){
        Student student1 = new Student("Jose", "Rasilla", "001", 10f);
        Subject subject1 = new Subject("Coding2", 70);
        subject1.addStudent(student1);

        int expectedPosition = 1;

        assertEquals(expectedPosition, subject1.getPosition());
    }

    @Test
    void getStudent(){
        Student student1 = new Student("Jose", "Rasilla", "001", 10f);
        Subject subject1 = new Subject("Coding2", 70);
        subject1.addStudent(student1);

        assertEquals(student1, subject1.getStudent(0));
    }

    @Test
    void addStudent() {
        Student student1 = new Student("Jose", "Rasilla", "001", 10f);
        Subject subject1 = new Subject("Coding2", 70);
        subject1.addStudent(student1);

        int expectedLength = 1;
        int actualLength = subject1.getPosition();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void orderStudents() {
        Student student1 = new Student("Jose", "Rasilla", "001", 10f);
        Student student2 = new Student("Diego", "Garcia", "002", 8f);
        Subject subject1 = new Subject("Coding2", 70);

        subject1.addStudent(student1);
        subject1.addStudent(student2);
        subject1.orderStudents();

        Student[] testStudents = subject1.getStudents();

        assertEquals(student1, testStudents[0]);
        assertEquals(student2, testStudents[1]);
    }

    @Test
    void getMedian() {
        Student student1 = new Student("Jose", "Rasilla", "001", 9f);
        Student student2 = new Student("Diego", "Garcia", "002", 6f);
        Student student3 = new Student("Daniel", "Puente", "003", 4f);
        Subject subject1 = new Subject("Coding2", 70);

        subject1.addStudent(student1);
        subject1.addStudent(student2);
        subject1.addStudent(student3);

        float expectedMedian = 6f;

        assertEquals(expectedMedian, subject1.getMedian());
    }

    @Test
    void getAverage() {
        Student student1 = new Student("Jose", "Rasilla", "001", 10f);
        Student student2 = new Student("Diego", "Garcia", "002", 6f);
        Subject subject1 = new Subject("Coding2", 70);

        subject1.addStudent(student1);
        subject1.addStudent(student2);
        float expectedAverage = 8f ;

        float average = subject1.getAverageGrade();


        assertEquals(expectedAverage, average);
    }

    @Test
    void getBestStudent() {
        Student student1 = new Student("Jose", "Rasilla", "001", 10f);
        Student student2 = new Student("Diego", "Garcia", "002", 6f);
        Subject subject1 = new Subject("Coding2", 70);

        subject1.addStudent(student1);
        subject1.addStudent(student2);

        Student expectedStudent = student1;

        assertEquals(expectedStudent, subject1.getBestStudent());
    }

    @Test
    void getWorstStudent() {
        Student student1 = new Student("Jose", "Rasilla", "001", 10f);
        Student student2 = new Student("Diego", "Garcia", "002", 6f);
        Subject subject1 = new Subject("Coding2", 70);

        subject1.addStudent(student1);
        subject1.addStudent(student2);

        Student expectedStudent = student2;
        Student worstStudent = subject1.getWorstStudent();

        assertEquals(expectedStudent, worstStudent);
    }
}