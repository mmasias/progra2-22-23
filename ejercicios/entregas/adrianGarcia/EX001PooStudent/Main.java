public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject("Math", 5);
        Student student1 = new Student("Gerardo", "Diego", "894", 5.5f);
        Student student2 = new Student("Nicolas", "Gomez", "457", 3.5f);
        Student student3 = new Student("Pablo", "Ruiz", "659", 7.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        System.out.println("The best student is: " + subject.getBestStudent().getName() + " " + subject.getBestStudent().getSurname());
        System.out.println("The worst student is: " + subject.getWorstStudent().getName() + " " + subject.getWorstStudent().getSurname());
        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The median grade is: " + subject.getMedianGrade());

    }
}
