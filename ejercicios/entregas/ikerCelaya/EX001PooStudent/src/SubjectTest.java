import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void getName(){
        Subject testSubject = new Subject("Programación II", 58);
        String expectedName = "Programación II";
        assertEquals(expectedName, "Programación II");
    }

    @Test
    void getCapacity(){
        Subject testSubject = new Subject("Programación II", 58);
        int expectedCapacity = 58;
        assertEquals(expectedCapacity, 58);
    }

    @Test
    void getIsOrdered(){

    }

    @Test
    void getPosition(){

    }

    @Test
    void getStudent(){

    }

    @Test
    void createSubject(){

    }

    @Test
    void addStudent() {
        Student testStudent = new Student("Pedro", "perez", "29", 6.5f);
        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(testStudent);

        int expectedLength = 1;
        int actualLength = subject.getPosition();

        assertEquals(expectedLength, actualLength);
    }

    @Test
    void orderStudents() {
    }

    @Test
    void getMedian() {
    }

    @Test
    void getAverage() {
    }
}