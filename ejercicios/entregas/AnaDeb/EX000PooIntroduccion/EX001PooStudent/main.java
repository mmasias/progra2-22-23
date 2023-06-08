public class Main {

    public static void main(String[] args){

        Subject sub = new Subject("Programaci n II",6);

        Student s = new student("Manolo", "P rez", "56789890z",6f);
        sub.addStudent(a);

        s = new Student("Mar a", "Garc a", "87415268t",10f);
        sub.addStudent(a);

        s = new Student("Juan Jos ","Torres", "96354712d",7f);
        sub.addStudent(a);

        s = new Student("Laura", "Meseguer", "87415268t",4f);
        sub.addStudent(a);

        s = new Student("Luc a", "Serra", "77441166h",9.99f);
        sub.addStudent(a);

        s = new Student("Antonio", "Peris", "96358425A",4.9f);
        sub.addStudent(a);




        System.out.println("Name of the subject: " + as.getName());
        System.out.println("Average grade: " + as.AverageGrade());
        a = as.getAlumMax();
        System.out.println("Student" + a.getName() + " " +
                a.getSurnames() + " got the highest grade: " + a.getNote());
        a = as.getStudMin();
        System.out.println("Student" + a.getName() + " " +
                a.getSurnames() + " has obtained the lowest grade: " + a.getNote());

    }

}