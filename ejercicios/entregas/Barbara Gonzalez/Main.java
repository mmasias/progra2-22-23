public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject("Math", 5);
        Student student1 = new Student("John", "Doe", "123456", 8.5f);
        Student student2 = new Student("Jane", "Smith", "123457", 9.5f);
        Student student3 = new Student("Juan", "Cobo", "123458", 7.5f);
        Student student4 = new Student("Eustaquio", "Rodriguez", "123459", 6.5f);
        Student student5 = new Student("Ermenegildo", "Hernandez", "123460", 5.5f);
        Student student6 = new Student("JUAN Carlos", "Perez", "123461", 4.5f);

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
