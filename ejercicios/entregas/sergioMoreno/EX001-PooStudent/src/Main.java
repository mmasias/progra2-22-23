public class Main {
    public static void main(String[] args) {


        Subject subject = new Subject("Music", 7);


        Student firstStudent = new Student("Sergio", "Moreno", "567890", 9.5f);
        Student secondStudent = new Student("Juan", "Gonzalez", "126785", 3.0f);
        Student thirdStudent = new Student("Luis", "Garcia", "321456", 5.0f);

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