import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class subjectTest{
    Subject subject;
    Student student1;
    Student student2;
    Student student3;

    @BeforeEach
    void setUp() {
        this.student1 = new Student("David", "Montenegro", "001", 10f);
        this.student2 = new Student("Andres", "Elias", "002", 9.5f);
        this.student3 = new Student("Jorge", "Saavedra", "003", 9.8f);
        this.subject = new Subject("Programación II", 3);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
    }

    @Test
    void createSubject() {
        assertNotNull(subject);
    }
    @Test
    void addStudent() {
        assertEquals(3, subject.getPosition());
    }

    @Test
    void orderStudents() {
        var expectedArray = new Student[]{student2, student3, student1};
        subject.orderStudents();
        assertArrayEquals(expectedArray, subject.getStudents());
    }

    @Test
    void getMedian() {
        assertEquals(9.8f, subject.getMedian());
    }

    @Test
    void getAverageGrade() {
        assertEquals(9.76f, subject.getAverageGrade());
    }

    @Test
    void getBestStudent() {
        assertEquals(student1, subject.getBestStudent());
    }

    @Test
    void getWorstStudent() {
        assertEquals(student3, subject.getWorstStudent());
    }
}