package Test;

import org.junit.Test;
import src.Student;
import src.Subject;

import static org.junit.Assert.*;

public class SubjectTest {
    private final Subject subject = new Subject("Matemáticas", 3);

    @Test
    public void testGetName() {
        assertEquals("Matemáticas", subject.getName());
    }

    @Test
    public void testGetCapacity() {
        assertEquals(3, subject.getCapacity());
    }

    @Test
    public void testGetIsOrdered() {
        assertFalse(subject.getIsOrdered());
    }

    @Test
    public void testGetPosition() {
        assertEquals(0, subject.getPosition());
    }

    @Test
    public void testGetStudent() {
        Student student1 = new Student("Juan", "Pérez", "12345678A", 7.5f);
        Student student2 = new Student("Ana", "García", "87654321B", 8.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        assertEquals(student1, subject.getStudent(0));
        assertEquals(student2, subject.getStudent(1));
    }

    @Test
    public void testAddStudent() {
        Student student = new Student("Juan", "Pérez", "12345678A", 7.5f);
        subject.addStudent(student);
        assertEquals(1, subject.getPosition());
        assertEquals(student, subject.getStudents()[0]);
    }

    @Test
    public void testOrderStudents() {
        Student student1 = new Student("Juan", "Pérez", "12345678A", 7.5f);
        Student student2 = new Student("Ana", "García", "87654321B", 8.0f);
        Student student3 = new Student("Luis", "Fernández", "56789012C", 6.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.orderStudents();
        assertEquals(student2, subject.getStudents()[0]);
        assertEquals(student1, subject.getStudents()[1]);
        assertEquals(student3, subject.getStudents()[2]);
        assertTrue(subject.getIsOrdered());
    }

    @Test
    public void testGetBestStudent() {
        Student student1 = new Student("Juan", "Pérez", "12345678A", 7.5f);
        Student student2 = new Student("Ana", "García", "87654321B", 8.0f);
        Student student3 = new Student("Luis", "Fernández", "56789012C", 6.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        assertEquals(student2, subject.getBestStudent());
    }

    @Test
    public void testGetWorstStudent() {
        Student student1 = new Student("Juan", "Pérez", "12345678A", 7.5f);
        Student student2 = new Student("Ana", "García", "87654321B", 8.0f);
        Student student3 = new Student("Luis", "Fernández", "56789012C", 6.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        assertEquals(student3, subject.getWorstStudent());
    }

    @Test
    public void testGetAverage() {
        Student student1 = new Student("Juan", "Pérez", "12345678A", 7.5f);
        Student student2 = new Student("Ana", "García", "87654321B", 8.0f);
        Student student3 = new Student("Luis", "Fernández", "56789012C", 6.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        assertEquals(7.0f, subject.getAverage(), 0.0f);
    }

    @Test
    public void testGetMedian() {
        Student student1 = new Student("Juan", "Pérez", "12345678A", 7.5f);
        Student student2 = new Student("Ana", "García", "87654321B", 8.0f);
        Student student3 = new Student("Luis", "Fernández", "56789012C", 6.0f);
        Student student4 = new Student("Sara", "González", "34567890D", 5.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.addStudent(student4);
        assertEquals(7.5f, subject.getMedian(), 0.0f);
    }
}
