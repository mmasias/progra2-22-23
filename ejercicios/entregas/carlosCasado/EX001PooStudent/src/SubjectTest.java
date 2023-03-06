import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class SubjectTest {

    @Test
    @DisplayName("Test constructor of Subject class.")
    void constructorTest() {
        Subject subject = new Subject("Math", 5);
        assertEquals("Math", subject.getName());
        assertEquals(5, subject.getCapacity());
        assertEquals(0, subject.getPosition());
        assertFalse(subject.getIsOrdered());
    }

    @Test
    @DisplayName("Set/get subject name.")
    void subjectName() {
        Subject subject = new Subject();
        subject.setName("Math");
        assertEquals("Math", subject.getName());
    }

    @Test
    @DisplayName("Set/get capacity.")
    void subjectCapacity() {
        Subject subject = new Subject();
        subject.setCapacity(5);
        assertEquals(5, subject.getCapacity());
    }

    @Test
    @DisplayName("Return boolean if is ordered.")
    void subjectIsOrdered() {
        Subject subject = new Subject("Math", 5);
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("Carlos", "Smith", "123458", 3.0f);
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertFalse(subject.getIsOrdered());
        subject.orderStudents();
        assertTrue(subject.getIsOrdered());

        //Validate if it is from lowest to highest
        assertTrue(subject.getStudent(0).getGrade() < subject.getStudent(subject.getPosition() - 1).getGrade());
    }

    @Test
    @DisplayName("Get the position in array of the last student")
    void subjectPosition() {

        Subject subject = new Subject("Math", 5);
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("Carlos", "Smith", "123458", 3.0f);
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertEquals(3, subject.getPosition());

    }

    @Test
    @DisplayName("Get the position in array of the specified student")
    void subjectGetStudent() {

        Subject subject = new Subject("Math", 5);
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("Carlos", "Smith", "123458", 3.0f);
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertEquals("Jane", subject.getStudent(1).getName());

    }

    @Test
    @DisplayName("Check add student & limit")
    void subjectAddStudent() {

        Subject subject = new Subject("Math", 2);
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("Carlos", "Smith", "123458", 3.0f);
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertEquals(2, subject.getPosition());

    }

    @Test
    @DisplayName("Return best student")
    void subjectBestStudent() {

        Subject subject = new Subject("Math", 3);
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("Carlos", "Smith", "123458", 3.0f);
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertEquals("John", subject.getBestStudent().getName());

    }

    @Test
    @DisplayName("Return worst student")
    void subjectWorstStudent() {

        Subject subject = new Subject("Math", 3);
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("Carlos", "Smith", "123458", 3.0f);
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertEquals("Carlos", subject.getWorstStudent().getName());

    }

    @Test
    @DisplayName("Return avg student's grade")
    void subjectAvgGrades() {

        Subject subject = new Subject("Math", 3);
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("Carlos", "Smith", "123458", 3.0f);
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertEquals(4, subject.getAverageGrade());

    }

    @Test
    @DisplayName("Return median of student's grade")
    void subjectMedianGrades() {

        Subject subject = new Subject("Math", 3);
        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("Carlos", "Smith", "123458", 3.0f);
        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertEquals(4, subject.getMedian());

    }

}
