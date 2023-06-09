public class SubjectTest {

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