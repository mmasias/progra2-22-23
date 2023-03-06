import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubjectTest {

    @Test
    public void testAddStudent() {
        Subject subject = new Subject("Math", 31);
        Student student1 = new Student("David", "Garcia", "87925785", 6.5f);
        Student student2 = new Student("Javier", "Manrique", "83909", 5.5f);
        Student student3 = new Student("Kevin", "Durant", "789789", 4.5f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        assertEquals(3, subject.getPosition());
        assertEquals(student1, subject.getStudent(0));
        assertEquals(student2, subject.getStudent(1));
        assertEquals(student3, subject.getStudent(2));
    }

    @Test
    public void testGetAverageGrade() {
        Subject subject = new Subject("Math", 31);
        Student student1 = new Student("David", "Garcia", "87925785", 6.5f);
        Student student2 = new Student("Javier", "Manrique", "83909", 5.5f);
        Student student3 = new Student("Kevin", "Durant", "789789", 4.5f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        assertEquals(5.5, subject.getAverageGrade(), 0.001);
    }

    @Test
    public void testGetMedian() {
        Subject subject = new Subject("Math", 31);
        Student student1 = new Student("David", "Garcia", "87925785", 6.5f);
        Student student2 = new Student("Javier", "Manrique", "83909", 5.5f);
        Student student3 = new Student("Kevin", "Durant", "789789", 4.5f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        assertEquals(5.5, subject.getMedian(), 0.001);
    }

    @Test
    public void testGetBestStudent() {
        Subject subject = new Subject("Math", 31);
        Student student1 = new Student("David", "Garcia", "87925785", 6.5f);
        Student student2 = new Student("Javier", "Manrique", "83909", 5.5f);
        Student student3 = new Student("Kevin", "Durant", "789789", 4.5f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        assertEquals(student1, subject.getBestStudent());
    }

    @Test
    public void testGetWorstStudent() {
        Subject subject = new Subject("Math", 31);
        Student student1 = new Student("David", "Garcia", "87925785", 6.5f);
        Student student2 = new Student("Javier", "Manrique", "83909", 5.5f);
        Student student3 = new Student("Kevin", "Durant", "789789", 4.5f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        assertEquals(student3, subject.getWorstStudent());
    }
}
