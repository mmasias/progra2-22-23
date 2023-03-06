import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {
    @Test
    void creationTest(){
        Subject subject = new Subject("History", 4);
    }

    @Test
    void getPosition() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Subject subject = new Subject("History", 4);
        subject.addStudent(testStudent);

        int expectedPosition = 1;

        assertEquals(expectedPosition, subject.getPosition());
    }

    @Test
    void getName() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Subject subject = new Subject("History", 4);
        subject.addStudent(testStudent);

        String expectedPosition = "History";

        assertEquals(expectedPosition, subject.getName());
    }



    @Test
    void isOrdered() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Student testStudent2 = new Student("Saúl", "Rodriguez", "738278", 5.0f);
        Subject subject = new Subject("History", 4);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);

        boolean expectedAnswer = false;

        assertEquals(expectedAnswer, subject.isOrdered());
    }

    @Test
    void getCapacity() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Subject subject = new Subject("History", 4);
        subject.addStudent(testStudent);

        int expectedCapacity = 4;

        assertEquals(expectedCapacity, subject.getCapacity());
    }

    @Test
    void getStudent() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Student testStudent2 = new Student("Saúl", "Rodriguez", "738278", 5.0f);
        Student testStudent3 = new Student("Mario", "Crus", "123458", 8.0f);
        Subject subject = new Subject("History", 4);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.addStudent(testStudent3);

        assertEquals(testStudent2, subject.getStudent(1));
    }


    @Test
    void addStudent() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Subject subject = new Subject("History", 4);
        subject.addStudent(testStudent);

        int expectedLength = 1;
        int actualLength = subject.getPosition();

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void orderStudents() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Student testStudent2 = new Student("Saúl", "Rodriguez", "738278", 5.0f);
        Subject subject = new Subject("History", 4);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.orderStudents();

        Student[] actualName = subject.getStudents();

        assertEquals(testStudent2, actualName[0]);
        assertEquals(testStudent, actualName[1]);

    }

    @Test
    void getAverage() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Student testStudent2 = new Student("Saúl", "Rodriguez", "738278", 5.0f);
        Subject subject = new Subject("History", 4);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.getAverageGrade();

        float expectedAverage = 4.5f ; // (testStudent.getGrade() + testStudent2.getGrade()) / subject.getPosition()
        float actualAverage = subject.getAverageGrade();

        assertEquals(expectedAverage, actualAverage);
    }

    @Test
    void getBestStudent() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Student testStudent2 = new Student("Saúl", "Rodriguez", "738278", 5.0f);
        Subject subject = new Subject("History", 4);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);

        String expectedStudent = "Saúl Rodriguez";

        assertEquals(expectedStudent, subject.getBestStudent());

    }

    @Test
    void getWorstStudent() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Student testStudent2 = new Student("Saúl", "Rodriguez", "738278", 5.0f);
        Subject subject = new Subject("History", 4);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);

        String expectedStudent = "Martin González";

        assertEquals(expectedStudent, subject.getWorstStudent());
    }


    @Test
    void getMedian() {
        Student testStudent = new Student("Martin", "González", "733273", 4.0f);
        Student testStudent2 = new Student("Saúl", "Rodriguez", "738278", 5.0f);
        Student testStudent3 = new Student("Mario", "Crus", "123458", 8.0f);
        Subject subject = new Subject("History", 4);

        subject.addStudent(testStudent);
        subject.addStudent(testStudent2);
        subject.addStudent(testStudent3);

        float expectedGrade = 5.0f;

        assertEquals(expectedGrade, subject.getMedian());
    }


}



