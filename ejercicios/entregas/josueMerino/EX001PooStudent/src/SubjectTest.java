import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Subject subject = new Subject("Programación II", 59);
        assertEquals("Programación II", subject.getName());
    }

    @org.junit.jupiter.api.Test
    void getIsOrdered() {
        Subject subject = new Subject("Programación II", 59);
        assertEquals(false, subject.getIsOrdered());
    }

    @org.junit.jupiter.api.Test
    void getPosition() {
        Subject subject = new Subject("Programación II", 59);
        assertEquals(0, subject.getPosition());
    }

    @org.junit.jupiter.api.Test
    void getCapacity() {
        Subject subject = new Subject("Programación II", 59);
        assertEquals(59, subject.getCapacity());
    }

    @org.junit.jupiter.api.Test
    void addStudent() {
    }

    @org.junit.jupiter.api.Test
    void getStudent() {
    }

    @org.junit.jupiter.api.Test
    void orderStudents() {
    }

    @org.junit.jupiter.api.Test
    void getMedian() {
    }

    @org.junit.jupiter.api.Test
    void getAverageGrade() {
    }

    @org.junit.jupiter.api.Test
    void getBestStudent() {
    }

    @org.junit.jupiter.api.Test
    void getWorstStudent() {
    }
}