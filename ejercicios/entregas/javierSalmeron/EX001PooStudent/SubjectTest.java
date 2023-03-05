import org.junit.Assert;
import org.junit.Test;

public class SubjectTest {

    @Test
    public void testAddStudent() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("Alice", 9);
        Student student2 = new Student("Bob", 7);
        Student student3 = new Student("Charlie", 8);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        Assert.assertEquals(3, subject.getPosition());
    }

    @Test
    public void testGetAverage() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("Alice", 9);
        Student student2 = new Student("Bob", 7);
        Student student3 = new Student("Charlie", 8);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        double expectedAverage = (9 + 7 + 8) / 3.0;
        double actualAverage = subject.getAverage();

        Assert.assertEquals(expectedAverage, actualAverage, 0.01);
    }

    @Test
    public void testGetMedian() {
        Subject subject = new Subject("Math", 4);

        Student student1 = new Student("Alice", 9);
        Student student2 = new Student("Bob", 7);
        Student student3 = new Student("Charlie", 8);
        Student student4 = new Student("David", 6);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.addStudent(student4);

        float expectedMedian = (7 + 8) / 2.0f;
        float actualMedian = subject.getMedian();

        Assert.assertEquals(expectedMedian, actualMedian, 0.01);
    }

    @Test
    public void testGetBestStudent() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("Alice", 9);
        Student student2 = new Student("Bob", 7);
        Student student3 = new Student("Charlie", 8);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        Student expectedBestStudent = student1;
        Student actualBestStudent = subject.getBestStudent();

        Assert.assertEquals(expectedBestStudent, actualBestStudent);
    }

    @Test
    public void testGetWorstStudent() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("Alice", 9);
        Student student2 = new Student("Bob", 7);
        Student student3 = new Student("Charlie", 8);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        Student expectedWorstStudent = student2;
        Student actualWorstStudent = subject.getWorstStudent();

        Assert.assertEquals(expectedWorstStudent, actualWorstStudent);
    }
}
