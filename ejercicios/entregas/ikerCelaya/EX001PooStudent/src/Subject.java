import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Subject {

    @Test
    void addStudent() {
        Student testStudent = new Student("Pedro", "perez", "29", 6.5f);
        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(testStudent);

        assertEquals(testStudent.getName(), "Pedro");

        assertArrayEquals(new Student[] testArray{);
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
}
