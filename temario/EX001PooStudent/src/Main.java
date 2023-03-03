public class Main {
    public static void main(String[] args) {

        // TODO: Create anew instance of the class "Subject" and add 5 students to it.

        Subject subject = new Subject("Math", 5);

        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The best student is: " + subject.getBestStudent());
        System.out.println("The worst student is: " + subject.getWorstStudent());

    }
}