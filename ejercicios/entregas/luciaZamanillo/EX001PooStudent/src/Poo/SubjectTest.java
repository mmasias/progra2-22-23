package Poo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void getName() {
        Subject subjectOne = new Subject("History", 24);
        assertEquals("History", subjectOne.getName());
    }

    @Test
    void getCapacity() {
        Subject subjectTwo = new Subject("Maths", 18);
        assertEquals(18, subjectTwo.getCapacity());
    }

    @Test
    void getIsOrdered() {
        Subject subjectThree = new Subject("Chemistry", 20);
        assertEquals(false, subjectThree.getIsOrdered());
    }

    @Test
    void getPosition() {
        Subject subjectFour = new Subject("Biology", 5);
        assertEquals(0, subjectFour.getPosition());
    }

    @Test
    void Subject() {
        Subject subjectSix = new Subject("Philosophy", 36);
        assertEquals("Philosophy", subjectSix.getName());
        assertEquals(36, subjectSix.getCapacity());
        assertEquals(0, subjectSix.getPosition());
        assertEquals(false, subjectSix.getIsOrdered());
    }

    @Test
    void addStudent() {
        Subject subjectSeven = new Subject("Programming", 45);
        Student studentTest1 = new Student("George", "Roland", "987654", 2.6f);
        Student studentTest2 = new Student("Maria", "Gonzalez", "123456", 8.7f);

        subjectSeven.addStudent(studentTest1);
        subjectSeven.addStudent(studentTest2);
        assertEquals(2, subjectSeven.getPosition());
    }

    @Test
    void orderStudents() {
        Subject subjectEight = new Subject("Literature", 41);
        Student studentTest1 = new Student("Jack", "Jones", "123569", 4.5f);
        Student studentTest2 = new Student("Elia", "Gutierrez", "52697", 9.32f);
        Student studentTest3 = new Student("Mario", "Lhang", "85201", 8.7f);

        subjectEight.addStudent(studentTest1);
        subjectEight.addStudent(studentTest2);
        subjectEight.addStudent(studentTest3);

        subjectEight.orderStudents();
        assertEquals(studentTest2, subjectEight.getStudent(0));
    }

    @Test
    void getBestStudent() {
        Subject subjectNine = new Subject("French", 20);
        Student studentTest1 = new Student("Marian", "Ibañez", "741852", 6.35f);
        Student studentTest2 = new Student("Dorian", "Gomez", "365420", 7.9f);
        Student studentTest3 = new Student("Juan Jose", "Diaz", "987654", 3.21f);

        subjectNine.addStudent(studentTest1);
        subjectNine.addStudent(studentTest2);
        subjectNine.addStudent(studentTest3);

        assertEquals(studentTest2, subjectNine.getBestStudent());
    }

    @Test
    void getWorstStudent() {
        Subject subjectTen = new Subject("French Literature", 20);
        Student studentTest1 = new Student("Marian", "Ibañez", "741852", 6.35f);
        Student studentTest2 = new Student("Dorian", "Gomez", "365420", 7.9f);
        Student studentTest3 = new Student("Juan Jose", "Diaz", "987654", 3.21f);

        subjectTen.addStudent(studentTest1);
        subjectTen.addStudent(studentTest2);
        subjectTen.addStudent(studentTest3);

        assertEquals(studentTest3, subjectTen.getWorstStudent());
    }

    @Test
    void getAverage() {
        Subject subjectEleven = new Subject("English", 54);
        Student studentTest1 = new Student("Marta", "Cabrillo", "852074", 9.950f);
        Student studentTest2 = new Student("Eneko", "Goitia", "1235206", 6.320f);
        Student studentTest3 = new Student("Carmen", "Miora", "96547", 5.450f);

        subjectEleven.addStudent(studentTest1);
        subjectEleven.addStudent(studentTest2);
        subjectEleven.addStudent(studentTest3);

        assertEquals(7.2400002f, subjectEleven.getAverageGrade());
    }

    @Test
    void getMedian() {
        Subject subjectTwelve = new Subject("English Literature", 54);
        Student studentTest1 = new Student("Marta", "Cabrillo", "852074", 9.950f);
        Student studentTest2 = new Student("Eneko", "Goitia", "1235206", 6.320f);
        Student studentTest3 = new Student("Carmen", "Miora", "96547", 5.450f);

        subjectTwelve.addStudent(studentTest1);
        subjectTwelve.addStudent(studentTest2);
        subjectTwelve.addStudent(studentTest3);

        assertEquals(6.320f, subjectTwelve.getMedian());
    }





}