import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SubjectTest {
        private Subject subject;
        private Student juan;

        @BeforeEach
        public void setUp() {
            subject = new Subject("Inglés", 3);

        }

        @Test
        public void testGetName() {
            Assertions.assertEquals("Inglés", subject.getName());
        }

        @Test
        public void testSetName() {
            subject.setName("Francés");
            Assertions.assertEquals("Francés", subject.getName());
        }

        @Test
        public void testGetStudents() {
            Assertions.assertArrayEquals(new Student[3], subject.getStudents());
        }

        @Test
        public void testSetStudents() {
            Student[] students = {juan};
            subject.setStudents(students);
            Assertions.assertArrayEquals(students, subject.getStudents());
        }

        @Test
        public void testIsOrdered() {
            Assertions.assertFalse(subject.isOrdered());
        }

        @Test
        public void testSetOrdered() {
            subject.setOrdered(true);
            Assertions.assertTrue(subject.isOrdered());
        }

        @Test
        public void testGetPosition() {
            Assertions.assertEquals(0, subject.getPosition());
        }

        @Test
        public void testSetPosition() {
            subject.setPosition(2);
            Assertions.assertEquals(2, subject.getPosition());
        }

        @Test
        public void testGetCapacity() {
            Assertions.assertEquals(3, subject.getCapacity());
        }

        @Test
        public void testSetCapacity() {
            subject.setCapacity(5);
            Assertions.assertEquals(5, subject.getCapacity());
        }


        @Test
    public void testAddStudent() {
        Subject subject = new Subject("Math", 2);
        Student student1 = new Student("John", "Doe", "123456", 9.0f);
        Student student2 = new Student("Jane", "Doe", "123457", 7.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        assertEquals(subject.getAverageGrade(), 8.0f);
    }

    @Test
    public void testGetMedian() {
        Subject subject = new Subject("Math", 3);
        Student student1 = new Student("John", "Doe", "123456", 9.0f);
        Student student2 = new Student("Jane", "Doe", "123457", 7.0f);
        Student student3 = new Student("John", "Smith", "123458", 10.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        assertEquals(subject.getMedian(), 9.0f);
    }

    @Test
    public void testGetAverageGrade() {
        Subject subject = new Subject("Math", 2);
        Student student1 = new Student("John", "Doe", "123456", 9.0f);
        Student student2 = new Student("Jane", "Doe", "123457", 7.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        assertEquals(subject.getAverageGrade(), 8.0f);
    }

    @Test
    public void testGetBestStudent() {
        Subject subject = new Subject("Math", 3);
        Student student1 = new Student("John", "Doe", "123456", 9.0f);
        Student student2 = new Student("Jane", "Doe", "123457", 7.0f);
        Student student3 = new Student("John", "Smith", "123458", 10.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        assertEquals(subject.getBestStudent(), student3);
    }

    @Test
    public void testGetWorstStudent() {
        Subject subject = new Subject("Math", 3);
        Student student1 = new Student("John", "Doe", "123456", 9.0f);
        Student student2 = new Student("Jane", "Doe", "123457", 7.0f);
        Student student3 = new Student("John", "Smith", "123458", 10.0f);
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        assertEquals(subject.getWorstStudent(), student2);
    }
}