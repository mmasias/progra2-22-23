package Poo;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject("Poo", 50);


        Student firstStudent = new Student("Paula", "Diestro", "24", 5.0f);
        Student secondStudent = new Student("Noemi", "Laguillo", "17", 4.0f);
        Student thirdStudent = new Student("Cristina", "Cobo", "36", 3.0f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);


        System.out.println("The average grade is: " + subject.getAverage());
        System.out.println("The best student is: " + subject.getBestStudent());
        System.out.println("The worst student is: " + subject.getWorstStudent());

    }
}