public class Main {
    public static void main(String[] args) {


        Subject subject = new Subject("Math", 5);


        Student firstStudent = new Student("Diego", "Garcia", "123456", 9.5f);
        Student secondStudent = new Student("Pepe", "Gutierrez", "123457", 3.0f);
        Student thirdStudent = new Student("Pablo", "Rodriguez", "123458", 5.0f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        System.out.println("The student in the 2nd position is " + subject.getStudent(1).getName() + " " + subject.getStudent(1).getSurname() );
        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The median grade is: " + subject.getMedian());
        System.out.println("The best student is: " + subject.getBestStudent());
        System.out.println("The worst student is: " + subject.getWorstStudent());


    }


}