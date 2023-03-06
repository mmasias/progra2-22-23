public class Main {
    public static void main(String[] args) {
 
        Subject subject = new Subject("Math", 5);

        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 1.0f);
        Student thirdStudent = new Student("Jorge", "Fink", "123458", 4.5f);
        Student forthStudent = new Student("Steve", "Fonk", "123459", 8.0f);
        Student fifthStudent = new Student("John", "Smith", "123460", 7.5f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);
        subject.addStudent(forthStudent);
        subject.addStudent(fifthStudent);

        System.out.println("Second student name: " + secondStudent.getName());
        System.out.println("Second student surname: " + secondStudent.getSurname());
        System.out.println("Second student id: " + secondStudent.getId());
        System.out.println("Second student grade: " + secondStudent.getGrade());

        // ISSUE: Code returns the memory address of the student object instead of the actual strudent string
        System.out.println("The student in the third position is: " + subject.getStudent(2));

        System.out.println("The average grade is: " + subject.getAverage());
        System.out.println("The median grade is: " + subject.getMedian());
        System.out.println("The best student is: " + subject.getBestStudent().getName());
        System.out.println("The worst student is: " + subject.getWorstStudent().getName());

    }
}