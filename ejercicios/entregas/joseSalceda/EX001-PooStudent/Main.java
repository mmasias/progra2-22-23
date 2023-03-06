public class Main {
    public static void main(String[] args) throws Exception {
        
        Subject subject = new Subject("Programacion", 5);

        Student student1 = new Student("Jose", "Salceda", "1234", 10.0f);
        Student student2 = new Student("Luis", "Garcia", "5678", 8.5f);
        Student student3 = new Student("Maria", "Gonzalez", "9012", 7.0f);
    
        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        System.out.println("El mejor alumno es: " + subject.getBestStudent().getName() + " " + subject.getBestStudent().getSurname());
        System.out.println("El peor alumno es: " + subject.getWorstStudent().getName() + " " + subject.getWorstStudent().getSurname());
        System.out.println("La media de la clase es: " + subject.getAverageGrade());
        System.out.println("La mediana de la clase es: " + subject.getMedianGrade());

    }
}
