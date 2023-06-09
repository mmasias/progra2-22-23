public class App {
    public static void main(String[] args) throws Exception {
        Subject subject = new Subject("Programacion", 30);

        Student student1 = new Student("Adrian", "Pérez", "1234", 10.0f);
        Student student2 = new Student("Jose", "Gomez", "5778", 8.0f);
        Student student3 = new Student("Luna", "Arandano", "9212", 4.0f);

        subject.addStudent(student1);
        subject.addStudent(student2);
        subject.addStudent(student3);

        System.out.println("El mejor alumno es: " + subject.getBestStudent().getName() + " " + subject.getBestStudent().getSurname());
        System.out.println("El peor alumno es: " + subject.getWorstStudent().getName() + " " + subject.getWorstStudent().getSurname());
        System.out.println("La media de la clase es: " + subject.getAverageGrade());
        System.out.println("La mediana de la clase es: " + subject.getMedianGrade());
    }
}
