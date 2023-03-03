import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    public SubjectTest(){

        Student testStudent w;
        Subject subject = new Subject("Programación II", 58);

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
        Student testStudent = new Student("Pedro", "perez", "29", 6.5f);
        Student testStudent2 = new Student("Juan", "perez", "2339", 3.5f);
        Student testStudent3 = new Student("Maria", "perez", "29555", 1.5f);

        Subject subject = new Subject("Programación II", 58);
        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        @Test
        void getAverage() {
        }
    }