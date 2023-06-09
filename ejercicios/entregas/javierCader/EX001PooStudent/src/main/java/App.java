public class App {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Javier", "Cader", "001", 9.56f);
        Student student1 = new Student("Pepe", "Arguello", "002", 8.0f);

        Subject subject = new Subject("Programación II", 5);
        subject.addStudent(student);
        subject.addStudent(student1);
        System.out.println(subject.getAverageGrade());
    }
}
