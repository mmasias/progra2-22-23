import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {
    @Test
    void testConstructor(){
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);

        assertEquals("Jorge", firstStudent.getName());
        assertEquals("Otero", firstStudent.getSurname());
        assertEquals("30", firstStudent.getId());
        assertEquals(9, firstStudent.getGrade(), 0);

    }
    @Test
    void testSetAndGetGrade(){
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);
        firstStudent.setGrade(5.0f);
        assertEquals(5, firstStudent.getGrade());
    }
    @Test
    void testSetAndGetName(){
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);
        firstStudent.setName("Pedro");
        assertEquals("Pedro", firstStudent.getName());
    }
    @Test
    void testSetAndGetSurname(){
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);
        firstStudent.setSurname("González");
        assertEquals("González", firstStudent.getSurname());
    }
    @Test
    void testSetAndGetId(){
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);
        firstStudent.setId("80");
        assertEquals("80", firstStudent.getId());
    }

}
