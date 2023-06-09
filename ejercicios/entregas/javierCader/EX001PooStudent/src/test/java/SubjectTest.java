import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    Subject subject;
    Student student1;
    Student student2;
    Student student3;

    @BeforeEach
    void setUp() {
        this.student1 = new Student("Javier", "Cader", "001", 10f);
        this.student2 = new Student("Enrique", "Suay", "002", 9.5f);
        this.student3 = new Student("Jose", "Perez", "003", 6.89f);
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
        var expectedArray = new Student[]{student3, student2, student1};
        subject.orderStudents();
        assertArrayEquals(expectedArray, subject.getStudents());
    }

    @Test
    void getMedian() {
        assertEquals(9.5f, subject.getMedian());
    }

    @Test
    void getAverageGrade() {
        assertEquals(8.796666f, subject.getAverageGrade());
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