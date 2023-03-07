package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @Test
    void getName() {
    Subject subjectOne = new Subject("Biology", 25);
    assertEquals("Biology", subjectOne.getName());
    }

    @Test
    void getCapacity() {
        Subject subjectTwo = new Subject("Chemistry", 30);
        assertEquals(30, subjectTwo.getCapacity());
    }

    @Test
    void getIsOrdered() {
        Subject subjectThree = new Subject("Psychology", 35);
        assertEquals(false, subjectThree.getIsOrdered());
    }

    @Test
    void getPosition() {
        Subject subjectFour = new Subject("Mathematics", 40);
        assertEquals(0, subjectFour.getPosition());
    }

    @Test
    void Subject() {
        Subject subjectFive = new Subject("ED", 20);
        assertEquals("ED", subjectFive.getName());
        assertEquals(20, subjectFive.getCapacity());
        assertEquals(false, subjectFive.getIsOrdered());
        assertEquals(0, subjectFive.getPosition());
    }

    @Test
    void addStudent() {
        Subject subjectSix = new Subject("Physics", 28);
        Student studentTestOne = new Student("Jose", "Perez", "1248369", 2.0f);
        Student studentTestTwo = new Student("Maria", "Gonzalez", "1248370", 3.0f);
        Student studentTestThree = new Student("Juan", "Perez", "1248371", 4.0f);

        subjectSix.addStudent(studentTestOne);
        subjectSix.addStudent(studentTestTwo);
        assertEquals(2, subjectSix.getPosition());
    }

    @Test
    void orderStudents() {
        Subject subjectSeven = new Subject("Religion", 21);
        Student studentTestOne = new Student("Miguel", "Perez", "1248329", 2.0f);
        Student studentTestTwo = new Student("Fernando", "Gonzalez", "1248330", 3.0f);
        Student studentTestThree = new Student("Sebastian", "Perez", "1248321", 4.0f);

        subjectSeven.addStudent(studentTestOne);
        subjectSeven.addStudent(studentTestTwo);
        subjectSeven.addStudent(studentTestThree);

        assertEquals(studentTestTwo, subjectSeven.getStudents());
    }

    @Test
    void getBestStudent() {
        Subject subjectEight = new Subject("French", 20);
        Student studentTestOne = new Student("Marian", "Ibañez", "741852", 6.35f);
        Student studentTestTwo = new Student("Dorian", "Gomez", "365420", 7.9f);
        Student studentTestThree = new Student("Juan Jose", "Diaz", "987654", 3.21f);

        subjectEight.addStudent(studentTestOne);
        subjectEight.addStudent(studentTestTwo);
        subjectEight.addStudent(studentTestThree);

        assertEquals(studentTestTwo, subjectEight.getBestStudent());
    }

    @Test
    void getWorstStudent() {
        Subject subjectNine = new Subject("Literature", 20);
        Student studentTestOne = new Student("Luisa", "Ibañez", "741852", 6.35f);
        Student studentTestTwo = new Student("Samuel;", "Gomez", "365420", 7.9f);
        Student studentTestThree = new Student("Juan Jose", "Diaz", "987654", 3.21f);

        subjectNine.addStudent(studentTestOne);
        subjectNine.addStudent(studentTestTwo);
        subjectNine.addStudent(studentTestThree);

        assertEquals(studentTestThree, subjectNine.getWorstStudent());
    }

    @Test
    void getAverage() {
        Subject subjectTen = new Subject("English", 54);
        Student studentTestOne = new Student("Marta", "Cabrillo", "852074", 9.950f);
        Student studentTestTwo = new Student("Karen", "Goitia", "1235206", 6.320f);
        Student studentTestThree = new Student("Carmen", "Miora", "96547", 5.450f);

        subjectTen.addStudent(studentTestOne);
        subjectTen.addStudent(studentTestTwo);
        subjectTen.addStudent(studentTestThree);

        assertEquals(7.2400002f, subjectTen.getAverageGrade());
    }

    @Test
    void getMedian() {
        Subject subjectEleven = new Subject("German", 54);
        Student studentTestOne = new Student("Gina", "Cabrillo", "852074", 9.950f);
        Student studentTestTwo = new Student("Eneko", "Goitia", "1235206", 6.320f);
        Student studentTestThree = new Student("Sofia", "Miora", "96547", 5.450f);

        subjectEleven.addStudent(studentTestOne);
        subjectEleven.addStudent(studentTestTwo);
        subjectEleven.addStudent(studentTestThree);

        assertEquals(6.320f, subjectEleven.getMedian());
    }


}