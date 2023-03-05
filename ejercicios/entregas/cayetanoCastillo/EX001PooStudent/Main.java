package clase;



public class Main {
    public static void main(String[] args) {

        // TODO: Create anew instance of the class "Subject" and add 5 students to it.

      /*  Subject subject = new Subject("Math", 5);


        
        Student student1 = new Student("Carlos", "Perez", "1", 6 );
        Student student2 = new Student("Alberto", "Cass", "2", 2 );
        Student student3 = new Student("Eduardo", "Guzman", "3", 9 );
        Student student4 = new Student("Saul", "Fill", "4", 4 );
        Student student5 = new Student("Manolo", "King", "5", 7 );
        
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);
        subject.addStudent(student4);
        subject.addStudent(student5);
        
        
        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The best student is: " + subject.getBestStudent());
        System.out.println("The worst student is: " + subject.getWorstStudent());*/
        
        Subject subject = new Subject("Math", 5);


        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("John", "Smith", "123458", 3.0f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);


        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The best student is: " + subject.getBestStudent().getName());
        System.out.println("The worst student is: " + subject.getWorstStudent().getName());


        
    }
}
