import org.junit.Test;
import org.junit.Assert;

public class StudentTest {
    @Test
    public void testStudentGetAttributes() {
        Student student = new Student("Pablo", "Perez", "123456", 10.0f);
        Assert.assertEquals("Pablo", student.getName());
        Assert.assertEquals("Perez", student.getSurname());
        Assert.assertEquals("123456", student.getId());
        Assert.assertEquals(10.0f, student.getGrade(), 0.0);
    }
    @Test
    public void testStudentSetAttributes(){
        Student student = new Student();
        student.setName("Andres");
        student.setSurname("Pepito");
        student.setId("8Y39H6");
        student.setGrade(9.0f);
        Assert.assertEquals("Andres", student.getName());
        Assert.assertEquals("Pepito", student.getSurname());
        Assert.assertEquals("8Y39H6", student.getId());
        Assert.assertEquals(9.0f, student.getGrade(), 0.0);
    }

}