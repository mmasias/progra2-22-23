import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student raul;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        raul = new Student("Raúl", "Pelayo", "123455", 10);
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Assertions.assertEquals("Raúl", raul.getName());
    }

    @org.junit.jupiter.api.Test
    void getSurname() {
        Assertions.assertEquals("Pelayo", raul.getSurname());
    }

    @org.junit.jupiter.api.Test
    void getId() {
    }

    @org.junit.jupiter.api.Test
    void getGrade() {
    }

    @org.junit.jupiter.api.Test
    void setGrade() {
        raul.setGrade(6);

        Assertions.assertEquals(6, raul.getGrade());
    }
}
