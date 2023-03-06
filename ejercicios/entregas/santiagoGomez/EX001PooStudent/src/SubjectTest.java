package src;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SubjectTest {
    @Test
    void getName(){
        Subject subject = new Subject("Math", 5);
        assertEquals("Math", subject.getName());
    }

    @Test
    void getCapacity(){
        Subject subject = new Subject("Math", 5);
        assertEquals(5, subject.getCapacity());
    }

    @Test
    void getOrdered(){
        Subject subject = new Subject("Math", 5);
        assertEquals(false, subject.getOrdered());
    }

    @Test
    void getPosition(){
        Subject subject = new Subject("Math", 5);
        assertEquals(0, subject.getPosition());
    }

    @Test
    void Subject(){
        Subject subject = new Subject("Math", 5);
        assertEquals("Math", subject.getName());
        assertEquals(5, subject.getCapacity());
        assertEquals(false, subject.getOrdered());
        assertEquals(0, subject.getPosition());
    }

    @Test
    void addStudent(){
        Subject subject = new Subject("Math", 5);
        Student firstStudentTest = new Student("Santiago", "Gomez", "360347932", 5.0f);

        subject.addStudent(firstStudentTest);
        assertEquals(1, subject.getPosition());
    }

    @Test
    void orderedStudents(){
        Subject subject = new Subject("Math", 5);
        Student secondStudentTest = new Student("Fernando", "William", "8779592", 3.0f);
        Student thirdStudentTest = new Student("Gustavo", "Torres", "54693216", 2.1f);
        Student fourthStudentTest = new Student("Hector", "Gutierrez", "6549931", 1.3f);

        subject.addStudent(secondStudentTest);
        subject.addStudent(thirdStudentTest);
        subject.addStudent(fourthStudentTest);
        assertEquals(secondStudentTest, subject.getStudents());
    }

    @Test
    void getBestStudent(){
        Subject subject = new Subject("Math", 5);
        Student secondStudentTest = new Student("Mario", "Perez", "1234556", 2.0f);
        Student thirdStudentTest = new Student("Gustavo", "Torres", "54693216", 2.5f);
        Student fourthStudentTest = new Student("Hector", "Gutierrez", "6549931", 1.6f);

        subject.addStudent(secondStudentTest);
        subject.addStudent(thirdStudentTest);
        subject.addStudent(fourthStudentTest);
        assertEquals(secondStudentTest, subject.getBestStudent());
    }

    @Test
    void getWorstStudent(){
        Subject subject = new Subject("Math", 5);
        Student secondStudentTest = new Student("Fernando", "William", "8779592", 3.0f);
        Student thirdStudentTest = new Student("Gustavo", "Torres", "54693216", 2.1f);
        Student fourthStudentTest = new Student("Hector", "Gutierrez", "6549931", 1.3f);

        subject.addStudent(secondStudentTest);
        subject.addStudent(thirdStudentTest);
        subject.addStudent(fourthStudentTest);
        assertEquals(fourthStudentTest, subject.getStudents());
    }

    @Test
    void getAverageGrade(){
        Subject subject = new Subject("Math", 5);
        Student secondStudentTest = new Student("Fernando", "William", "8779592", 3.0f);
        Student thirdStudentTest = new Student("Gustavo", "Torres", "54693216", 2.1f);
        Student fourthStudentTest = new Student("Hector", "Gutierrez", "6549931", 1.3f);

        subject.addStudent(secondStudentTest);
        subject.addStudent(thirdStudentTest);
        subject.addStudent(fourthStudentTest);
        assertEquals(2.13333, subject.getAverageGrade());
    }

    @Test
    void getMedian(){
        Subject subject = new Subject("Math", 5);
        Student secondStudentTest = new Student("Fernando", "William", "8779592", 3.0f);
        Student thirdStudentTest = new Student("Gustavo", "Torres", "54693216", 2.1f);
        Student fourthStudentTest = new Student("Hector", "Gutierrez", "6549931", 1.3f);

        subject.addStudent(secondStudentTest);
        subject.addStudent(thirdStudentTest);
        subject.addStudent(fourthStudentTest);
        assertEquals(3.2, subject.getStudents());
    }
}
