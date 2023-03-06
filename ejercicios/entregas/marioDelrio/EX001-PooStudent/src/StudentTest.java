import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void getName() {
        Student name = new Student("Mario", "Del Rio", "1615f", 5.0f);

        assertEquals("Mario", name.getName());
    }

    @Test
    void getSurname() {
        Student surname = new Student("Alvaro", "Bellota", "0458t", 4.0f);

        assertEquals("Bellota", surname.getSurname());
    }

    @Test
    void getId() {
        Student id = new Student("Guillermo", "Gorge", "3030u", 2.0f);

        assertEquals("3030u", id.getId());
    }

    @Test
    void getGrade() {
        Student grade = new Student("Hugo", "Mellado", "0101p", 9.0f);

        assertEquals(9.0f, grade.getGrade());
    }

    @Test
    void setGrade() {
        Student ggrade = new Student("Luis", "Salamanca", "1001d", 7.0f);
        ggrade.setGrade(4.9f);
        assertEquals(4.9f, ggrade.getGrade());
    }

    @Test
    void buildStudent(){
        Student realStudent = new Student("Mario", "Del Rio", "1615f", 5.0f);
    }

}