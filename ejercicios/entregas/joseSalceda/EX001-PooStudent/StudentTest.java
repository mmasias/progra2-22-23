import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testConstructor() {
        String name = "Julian";
        String surname = "Alvarez";
        String id = "7220";
        float grade = 8.0f;

        Student student = new Student(name, surname, id, grade);

        Assert.assertEquals(name, student.getName());
        Assert.assertEquals(surname, student.getSurname());
        Assert.assertEquals(id, student.getId());
        Assert.assertEquals(grade, student.getGrade(), 0.0f);
    }

    @Test
    public void testGetName() {
        String name = "Julian";
        String surname = "Alvarez";
        String id = "7220";
        float grade = 3.5f;

        Student student = new Student(name, surname, id, grade);

        Assert.assertEquals(name, student.getName());
    }

    @Test
    public void testGetSurname() {
        String name = "Julian";
        String surname = "Alvarez";
        String id = "7220";
        float grade = 3.5f;

        Student student = new Student(name, surname, id, grade);

        Assert.assertEquals(surname, student.getSurname());
    }
    
    @Test
    public void testGetId() {
        String name = "Julian";
        String surname = "Alvarez";
        String id = "7220";
        float grade = 3.5f;

        Student student = new Student(name, surname, id, grade);

        Assert.assertEquals(id, student.getId());
    }

    @Test
    public void testGetGrade() {
        String name = "Julian";
        String surname = "Alvarez";
        String id = "7220";
        float grade = 3.5f;

        Student student = new Student(name, surname, id, grade);

        Assert.assertEquals(grade, student.getGrade(), 0.0f);
    }

    @Test
    public void testSetGrade() {
        String name = "Julian";
        String surname = "Alvarez";
        String id = "7220";
        float grade = 3.5f;

        Student student = new Student(name, surname, id, grade);
        student.setGrade(7.0f);

        Assert.assertEquals(7.0f, student.getGrade(), 0.0f);
    }
    

}