public class Main {
    public static void main(String[] args) {

        // TODO: Create anew instance of the class "Subject" and add 5 students to it.

        Subject subject = new Subject("Math", 5);
        subject.addStudent(new Student("a","w","1",4));
        subject.addStudent(new Student("b","x","2",8));
        subject.addStudent(new Student("c","y","3",7));
        subject.addStudent(new Student("d","z","4",10));
        subject.addStudent(new Student("e","v","5",2));

        System.out.println("The average grade is: " + subject.getAverage());
        System.out.println("The best student is: " + subject.getBestStudent().getName());
        System.out.println("The worst student is: " + subject.getWorstStudent().getName());

    }
}