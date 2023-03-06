import static org.junit.jupiter.api.Assertions.*;

class SubjectTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Subject name = new Subject("math", 97);

        assertEquals("math", name.getName());
    }

    @org.junit.jupiter.api.Test
    void isOrdered() {
        Student student1 = new Student("Mario", "Del Rio", "1615f", 4.0f);
        Student student2 = new Student("Alvaro", "Bellota", "0458t", 5.0f);
        Subject subject = new Subject("math", 97);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.orderStudents();

        Student[] actualName = subject.getStudents();

        assertEquals(student2, actualName[0]);
        assertEquals(student1, actualName[1]);
    }

    @org.junit.jupiter.api.Test
    void getPosition() {
        Student student1 = new Student("Mario", "Del Rio", "1615f", 5.0f);
        Subject subject = new Subject("Math", 97);

        assertEquals(0, subject.getPosition());
    }

    @org.junit.jupiter.api.Test
    void getCapacity() {
        Subject subject1 = new Subject("BD", 65);

        assertEquals(65, subject1.getCapacity());
    }

    @org.junit.jupiter.api.Test
    void getStudent() {
        Student student1 = new Student("Mario", "Del Rio", "1615f", 5.0f);
        Subject subject = new Subject("Math", 97);

        subject.addStudent(student1);

        assertEquals(student1, subject.getStudent(0));
    }
    @org.junit.jupiter.api.Test
    void addStudent() {
        Student student = new Student("Mario", "Del Rio", "1615f", 5.0f);
        Student student2 = new Student("Alvaro", "Bellota", "0458t", 7.0f);
        Subject subject1 = new Subject("math", 54);
        subject1.addStudent(student);
        subject1.addStudent(student);

        assertEquals(2, subject1.getPosition());
    }

    @org.junit.jupiter.api.Test
    void orderStudents() {
        Student student = new Student("Mario", "Del Rio", "1615f", 5.0f);
        Student student2 = new Student("Alvaro", "Bellota", "0458t", 7.0f);
        Subject subject1 = new Subject("math", 54);

        subject1.addStudent(student);
        subject1.addStudent(student2);
        subject1.orderStudents();

        Student[] position = subject1.getStudents();

        assertEquals(student2, position[0]);
        assertEquals(student, position[1]);
    }


    @org.junit.jupiter.api.Test
    void getBestStudent() {
        Student student = new Student("Mario", "Del Rio", "1615f", 5.0f);
        Student student2 = new Student("Alvaro", "Bellota", "0458t", 7.0f);
        Subject subject1 = new Subject("math", 54);

        subject1.addStudent(student);
        subject1.addStudent(student2);
        subject1.orderStudents();

        assertEquals("Alvaro Bellota"+ " - " +7.0, subject1.getBestStudent());

    }

    @org.junit.jupiter.api.Test
    void getWorstStudent() {
        Student student = new Student("Mario", "Del Rio", "1615f", 5.0f);
        Student student2 = new Student("Alvaro", "Bellota", "0458t", 7.0f);
        Subject subject1 = new Subject("math", 54);

        subject1.addStudent(student);
        subject1.addStudent(student2);
        subject1.orderStudents();

        assertEquals("Mario Del Rio"+ " - " +5.0, subject1.getWorstStudent());
    }

    @org.junit.jupiter.api.Test
    void getAverage() {


        Student student = new Student("Mario", "Del Rio", "1615f", 5.0f);
        Student student2 = new Student("Pedro", "Garcia", "8465f", 7.0f);

        Subject subject1 = new Subject("math", 54);

        subject1.addStudent(student);
        subject1.addStudent(student2);




        assertEquals(6, subject1.getAverage());
    }


    @org.junit.jupiter.api.Test
    void getMedian() {
        Student student = new Student("Mario", "Del Rio", "1615f", 5.0f);
        Student student2 = new Student("Pedro", "Garcia", "8465j", 7.0f);
        Student student3 = new Student("Paco", "Perez", "5165r", 3.0f);
        Student student4 = new Student("Sandra", "Aguirre", "6436y", 9.0f);
        Subject subject1 = new Subject("math", 54);

        subject1.addStudent(student);
        subject1.addStudent(student2);
        subject1.addStudent(student3);
        subject1.addStudent(student4);

        assertEquals(6, subject1.getMedian());
    }

    void buildString(){
        Subject Subject = new Subject("coding", 97);
    }
}