public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject("History", 4);

        Student firstStudent = new Student("Martin", "González", "733273", 4.0f);
        Student secondStudent = new Student("Saúl", "Rodriguez", "738278", 5.0f);
        Student thirdStudent = new Student("Mario", "Crus", "123458", 8.0f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        if(subject.getStudent(1) != null) {
            System.out.println("The student in the 2nd position is " + subject.getStudent(1).getName() + " " + subject.getStudent(1).getSurname());
            System.out.println("The average grade is: " + subject.getAverageGrade());
            System.out.println("The median grade is: " + subject.getMedian());
            System.out.println("The best student is: " + subject.getBestStudent());
            System.out.println("The worst student is: " + subject.getWorstStudent());
        }else {
            System.out.println("Array null");
        }
    }
}