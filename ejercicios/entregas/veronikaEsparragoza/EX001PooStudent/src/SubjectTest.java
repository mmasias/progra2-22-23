import org.junit.Test;
import org.junit.Assert;

public class SubjectTest {
    public SubjectTest(){
        Student student = new Student("Pedro", "perez", "795HF6F", 6.5f);
        Subject subject = new Subject("Programación II", 58);
    }
    @Test
    public void testSubjectGetAttributes() {
        Subject subject = new Subject("Programación II", 58);

        Assert.assertEquals("Programación II", subject.getName());
        Assert.assertEquals(58, subject.getCapacity());
        Assert.assertEquals(0, subject.getPosition());
        Assert.assertEquals(false, subject.isOrdered());
        Assert.assertEquals(new Student[58], subject.getStudents());
    }
    @Test
    public void testSubjectSetAttributes(){
        Subject subject = new Subject();
        subject.setName("Base de datos II");
        subject.setCapacity(70);
        subject.setPosition(8);
        subject.setOrdered(true);
        subject.setStudents(new Student[37]);

        Assert.assertEquals("Base de datos II", subject.getName());
        Assert.assertEquals(70, subject.getCapacity());
        Assert.assertEquals(8, subject.getPosition());
        Assert.assertEquals(true, subject.isOrdered());
        Assert.assertEquals(new Student[37], subject.getStudents());
    }

    @Test
    public void addStudent() {
        Student student = new Student("Pedro", "perez", "29", 6.5f);
        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(student);
        int expectedLength = 1;
        int actualLength = subject.getPosition();
        Assert.assertEquals(expectedLength, actualLength);
    }

    @Test
    public void orderStudents() {
        Student student = new Student("Pedro", "perez", "795HF6F", 6.5f);
        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(student);
        subject.orderStudents();
        boolean expected = true;
        boolean actual = subject.isOrdered();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMedian() {
        Student student = new Student("Pedro", "perez", "795HF6F", 6.5f);
        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(student);
        subject.orderStudents();
        float expected = 6.5f;
        float actual = subject.getMedian();
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void getAverage() {
        Student student = new Student("Pedro", "perez", "795HF6F", 6.5f);
        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(student);
        subject.orderStudents();
        float expected = 6.5f;
        float actual = subject.getAverageGrade();
        Assert.assertEquals(expected, actual, 0.0);
    }
}