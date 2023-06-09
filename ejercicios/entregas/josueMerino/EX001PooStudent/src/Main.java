public class Main {
    public static void main(String[] args) {
        // Is this the best way to do it?, What if I want to add more students?
        // Although I recommend not touching this code just make sure you understand it,
        // but you can do it if you want.

        // TODO: Create anew instance of the class "Subject" and add 5 students to it.

        Subject subject = new Subject("Math", 5);

        Subject subject2 = new Subject("Programación II", 52);


        Student firstStudent = new Student("John", "Doe", "123456", 5.0f);
        Student secondStudent = new Student("Jane", "Doe", "123457", 4.0f);
        Student thirdStudent = new Student("John", "Smith", "123458", 3.0f);
        Student fourthStudent = new Student("Pérez", "Galindo", "777777", 8.5f);
        Student fifthStudent = new Student("Gabriel", "Mourinho", "1564678", 6.5f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);

        subject2.addStudent(firstStudent);
        subject2.addStudent(secondStudent);
        subject2.addStudent(thirdStudent);
        subject2.addStudent(fourthStudent);
        subject2.addStudent(fifthStudent);

        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The best student is: " + subject.getBestStudent().getName());
        System.out.println("The worst student is: " + subject.getWorstStudent().getName());

        System.out.println("Second Subject Statistics");
        System.out.println("The average grade is: " + subject2.getAverageGrade());
        System.out.println("The best student is: " + subject2.getBestStudent().getName());
        System.out.println("The worst student is: " + subject2.getWorstStudent().getName());

    }
}