class Main {
    public static void main(String[] args) {

        // TODO: Create anew instance of the class "Subject" and add 5 students to it.

        Subject subject = new Subject("Math", 5);


        Student firstStudent = new Student("Iker", "Celaya", "0001", 5.0f);
        Student secondStudent = new Student("James", "Doe", "0002", 4.0f);
        Student thirdStudent = new Student("John", "Williams", "0003", 3.0f);
        Student fourthStudent = new Student("Lia", "Brown", "0004", 3.0f);
        Student fifthStudent = new Student("Sarah", "Cameron", "0005", 2.0f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);
        subject.addStudent(fourthStudent);
        subject.addStudent(fifthStudent);


        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The best student is: " + subject.getBestStudent());
        System.out.println("The worst student is: " + subject.getWorstStudent());

    }
}