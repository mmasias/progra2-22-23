import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @org.junit.jupiter.api.Test
    void Subject() {
        Subject subject = new Subject("Programación II", 59);
        assertEquals("Programación II", subject.getName());
        assertEquals(59, subject.getCapacity());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Subject subject = new Subject("Programación II", 59);
        assertEquals("Programación II", subject.getName());
    }

    @org.junit.jupiter.api.Test
    void getIsOrdered() {
        Subject subject = new Subject("Programación II", 59);
        assertFalse(subject.getIsOrdered());
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
        Subject subject = new Subject("Programación II", 59);
        Student student = new Student("Josué", "Merino", "123456", 5.6f);
        subject.addStudent(student);

        assertEquals(1, subject.getPosition());
    }

    @org.junit.jupiter.api.Test
    void getStudent() {
        Subject subject = new Subject("Programación II", 59);
        Student student = new Student("Josué", "Merino", "123456", 5.6f);
        subject.addStudent(student);

        Student studentObtained = subject.getStudent(0);

        assertEquals(student, studentObtained);

    }

    @org.junit.jupiter.api.Test
    void orderStudents() {
        Subject subject = new Subject("Programación II", 59);
        Student student1 = new Student("Josué", "Merino", "123456", 5.6f);
        Student student2 = new Student("Samuel", "Merino", "123457", 8.1f);

        subject.addStudent(student2);
        subject.addStudent(student1);

        subject.orderStudents();

        assertEquals(8.1f,subject.getStudent(1).getGrade());

    }

    @org.junit.jupiter.api.Test
    void getMedian() {
        Subject subject = new Subject("Programación II", 59);
        Student student1 = new Student("Josué", "Merino", "123456", 5f);
        Student student2 = new Student("Samuel", "Merino", "123457", 8f);

        subject.addStudent(student2);
        subject.addStudent(student1);

        float medianObtained = subject.getMedian();

        assertEquals(6.5f, medianObtained);
    }

    @org.junit.jupiter.api.Test
    void getAverageGrade() {
        Subject subject = new Subject("Programación II", 59);
        Student student1 = new Student("Josué", "Merino", "123456", 5f);
        Student student2 = new Student("Samuel", "Merino", "123457", 8f);

        subject.addStudent(student2);
        subject.addStudent(student1);

        float averageObtained = subject.getAverageGrade();

        assertEquals(6.5f, averageObtained);
    }

    @org.junit.jupiter.api.Test
    void getBestStudent() {
        Subject subject = new Subject("Programación II", 59);
        Student student1 = new Student("Josué", "Merino", "123456", 5.6f);
        Student student2 = new Student("Samuel", "Merino", "123457", 8.1f);

        subject.addStudent(student2);
        subject.addStudent(student1);

        Student bestStudent = subject.getBestStudent();

        assertEquals(student2, bestStudent);
    }

    @org.junit.jupiter.api.Test
    void getWorstStudent() {
        Subject subject = new Subject("Programación II", 59);
        Student student1 = new Student("Josué", "Merino", "123456", 5.6f);
        Student student2 = new Student("Samuel", "Merino", "123457", 8.1f);

        subject.addStudent(student2);
        subject.addStudent(student1);

        Student worstStudent = subject.getWorstStudent();

        assertEquals(student1, worstStudent);
    }
}