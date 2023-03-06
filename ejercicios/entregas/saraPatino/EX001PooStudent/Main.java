public class Main {
  public static void main(String[] args) {
    Subject subject = new Subject("Programación II", 58);

    Student firstStudent = new Student("Jose", "Recinos", "1", 6.5f);
    Student secondStudent = new Student("Rigo", "Osorio", "2", 7.5f);
    Student thirdStudent = new Student("Sara", "Patino", "3", 8.5f);

    subject.addStudent(firstStudent);
    subject.addStudent(secondStudent);
    subject.addStudent(thirdStudent);

    System.out.println("The best student is: " + subject.getBestStudent());
    System.out.println("The worst student is: " + subject.getWorstStudent());
    System.out.println("The average is: " + subject.getAverage());
    System.out.println("The median is: " + subject.getMedian());

    System.out.println("The first student is: " + subject.getStudent(0).getName());
    System.out.println("The last student is: " + subject.getStudent(4).getName());
    System.out.println("The average grade is: " + subject.getAverageGrade());
    System.out.println("The best student is: " + subject.getBestStudent().getName());
    System.out.println("The worst student is: " + subject.getWorstStudent().getName());
    
  }
}