public class Main {
    public static void main(String[] args) {

        // TODO: Create anew instance of the class "Subject" and add 5 students to it.

        Subject subject = new Subject("Math", 5);


        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("John", "Smith", "123458", 3.0f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);


        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The best student is: " + subject.getBestStudent());
        System.out.println("The worst student is: " + subject.getWorstStudent());

    }
}