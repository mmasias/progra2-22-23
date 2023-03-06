import java.util.Scanner;

public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;


    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
    }


    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position = position + 1;
            isOrdered = false;
        }
    }

    public void orderStudents() {
        if (!isOrdered) {
            for (int i = 0; i < position; i++) {
                for (int j = i + 1; j < position; j++) {
                    if (students[i].getGrade() < students[j].getGrade()) {
                        Student temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }
                }
            }
            isOrdered = true;
        }
    }

    /*
     * Returns the median grade of all the students in the subject.
     */
    public float getMedian() {
        int p=0;
        orderStudents();
        float median=0;
        if (position % 2 == 1) {
            p=(position/2);
            median=this.getStudent(p).getGrade();
            

        } else {
            p=(position/2);
            median=(this.getStudent(p).getGrade()+this.getStudent(p-1).getGrade())/2;


        }return median;
    }
    public float getAverageGrade(){

        float equanGrade=0;
        for (int i = 0; i <position ; i++) {

            equanGrade += students[i].getGrade();
        }
        return equanGrade/position;
    }

    public Student getStudent(int p) {
        Student s= null;
     if(p<position){
         s=this.students[p];
     }

      
        return s;
    }
    public Student getBestStudent() {
        orderStudents();
        return getStudent(0);


    }
        public Student getWorstStudent() {
        orderStudents();
       return  getStudent(position);

    }
}