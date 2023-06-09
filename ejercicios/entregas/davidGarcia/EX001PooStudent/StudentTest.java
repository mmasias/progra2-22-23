import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s= new Student("David","Garcia","51111",10);

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void setGrade() {
        s.setGrade(8);
        assertEquals(8,s.getGrade());
    }

    @org.junit.jupiter.api.Test
    void getGrade() {
        assertEquals(10,s.getGrade());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("David",s.getName());
    }

    @org.junit.jupiter.api.Test
    void getSurname() {
        assertEquals("Garcia",s.getSurname());
    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertEquals("51111",s.getId());
    }
}