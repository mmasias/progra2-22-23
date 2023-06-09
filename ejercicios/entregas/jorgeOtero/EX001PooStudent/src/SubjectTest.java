import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubjectTest {


    @Test
    void testAddStudent(){
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);
        Student secondStudent = new Student("Pedro", "Saenz", "31", 6.0f);
        Subject subject = new Subject("Math", 2);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);

        assertEquals(2, subject.getPosition());
    }
    @Test
    void testGetMedian(){
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);
        Student secondStudent = new Student("Pedro", "Saenz", "31", 6.0f);
        Student thirdStudent = new Student("Jelena", "Saiz", "60", 7.0f);
        Subject subject = new Subject("Math", 3);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        assertEquals(7.0, subject.getMedian());

    }
    @Test
    void testGetAverageGrade(){
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);
        Student secondStudent = new Student("Pedro", "Saenz", "31", 6.0f);
        Subject subject = new Subject("Math", 2);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);

        assertEquals(7.5, subject.getAverageGrade());
    }
    @Test
    void TestGetBestStudent() {
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);
        Student secondStudent = new Student("Pedro", "Saenz", "31", 6.0f);
        Subject subject = new Subject("Math", 2);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);

        assertEquals(firstStudent, subject.getBestStudent());
    }
    @Test
    void testGetWorstStudent() {
        Student firstStudent = new Student("Jorge", "Otero", "30", 9.0f);
        Student secondStudent = new Student("Pedro", "Saenz", "31", 6.0f);
        Subject subject = new Subject("Math", 2);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        assertEquals(secondStudent, subject.getWorstStudent());

    }



}
