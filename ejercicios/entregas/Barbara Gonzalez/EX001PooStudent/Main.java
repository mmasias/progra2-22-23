public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject("Math", 5);
        Student student1 = new Student("Marcos", "Fernandez", "123456", 5.5f);
        Student student2 = new Student("John", "Smith", "123477", 7.3f);
        Student student3 = new Student("Mike", "Sanchez", "123666", 5.5f);
        Student student4 = new Student("Laura", "Rodriguez", "123987", 9.5f);
        Student student5 = new Student("Mario", "Hernandez", "123654", 2.5f);
        Student student6 = new Student("Jose", "Perez", "987654", 1.5f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.addStudent(student4);
        subject.addStudent(student5);
        subject.addStudent(student6);

        System.out.println("The average grade is: " + subject.getAverage());
        System.out.println("The best student is: " + subject.getBestStudent());
        System.out.println("The worst student is: " + subject.getWorstStudent());
        System.out.println("The median grade is: " + subject.getMedian());
    }
}
