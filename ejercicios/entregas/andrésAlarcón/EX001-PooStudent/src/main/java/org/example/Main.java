package org.example;

public class Main {
    public static void main(String[] args) {
        // Is this the best way to do it?, What if I want to add more students?
        // Although I recommend not touching this code just make sure you understand it,
        // but you can do it if you want.

        // TODO: Create anew instance of the class "Subject" and add 5 students to it.

        Subject subject = new Subject("Math", 5);


        Student firstStudent = new Student("John", "Doe", "123456", 2.0f);
        Student secondStudent = new Student("Jane", "Smith", "123457", 2.0f);
        Student thirdStudent = new Student("James", "Bailey", "123458", 2.5f);
        Student fourthStudent = new Student("Sam", "Nailor", "123459", 2.0f);
        Student fifthStudent = new Student("Derek", "Neville", "123460", 1.9f);
        Student sixthStudent = new Student("Josh", "Raken", "123461", 1.5f);

        subject.addStudent(firstStudent);
        subject.addStudent(secondStudent);
        subject.addStudent(thirdStudent);
        subject.addStudent(fourthStudent);
        subject.addStudent(fifthStudent);
        subject.addStudent(sixthStudent);


        System.out.println("The average grade is: " + subject.getAverageGrade());
        System.out.println("The best student is: " + subject.getBestStudent().getName());
        System.out.println("The worst student is: " + subject.getWorstStudent().getName());

    }
}