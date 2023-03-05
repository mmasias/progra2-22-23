import org.junit.Assert;
import org.junit.Test;

public class SubjectTest {

    @Test
    public void testAddStudent() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("John", "Doe", "123456", 0.0f);
        Student student2 = new Student("Jonny", "Doa", "123457", 5.0f);
        Student student3 = new Student("Jonattan", "Doi", "123458", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        Assert.assertEquals(3, subject.getPosition());
    }

    @Test
    public void testGetAverage() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("John", "Doe", "123456", 0.0f);
        Student student2 = new Student("Jonny", "Doa", "123457", 5.0f);
        Student student3 = new Student("Jonattan", "Doi", "123458", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        double expectedAverage = (5 + 10) / 3.0;
        double actualAverage = subject.getAverage();

        Assert.assertEquals(expectedAverage, actualAverage, 0.01);
    }

    @Test
    public void testGetMedian() {
        Subject subject = new Subject("Math", 4);

        Student student1 = new Student("John", "Doe", "123456", 0.0f);
        Student student2 = new Student("Jonny", "Doa", "123457", 5.0f);
        Student student3 = new Student("Jonattan", "Doi", "123458", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        float expectedMedian = 7.5f;
        float actualMedian = subject.getMedian();

        Assert.assertEquals(expectedMedian, actualMedian, 0.01);
    }

    @Test
    public void testGetBestStudent() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("John", "Doe", "123456", 0.0f);
        Student student2 = new Student("Jonny", "Doa", "123457", 5.0f);
        Student student3 = new Student("Jonattan", "Doi", "123458", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        Student expectedBestStudent = student3;
        Student actualBestStudent = subject.getBestStudent();

        Assert.assertEquals(expectedBestStudent, actualBestStudent);
    }

    @Test
    public void testGetWorstStudent() {
        Subject subject = new Subject("Math", 3);

        Student student1 = new Student("John", "Doe", "123456", 0.0f);
        Student student2 = new Student("Jonny", "Doa", "123457", 5.0f);
        Student student3 = new Student("Jonattan", "Doi", "123458", 10.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        Student expectedWorstStudent = student1;
        Student actualWorstStudent = subject.getWorstStudent();

        Assert.assertEquals(expectedWorstStudent, actualWorstStudent);
    }
}
