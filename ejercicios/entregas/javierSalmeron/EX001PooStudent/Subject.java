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
    
    public double getAverage(){
        double sum = 0.0;
        int size = students.length; 
        for (int i = 0; i < size; i++){
            sum += students[i].getGrade();
        }
        return sum / size;
    }

    public float getMedian() {
        int n = students.length;
        float median;
        if (n % 2 == 0) {
            median = (students[n / 2 - 1].getGrade() + students[n / 2].getGrade()) / 2.0f;
        } else {
            median = students[n / 2].getGrade();
        }
        return median;
    }
    
    public int getPosition() {
        return position;
    }

    public Student getBestStudent() {
        Student bestStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() > bestStudent.getGrade()) {
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }

    public Student getWorstStudent() {
        Student worstStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() < worstStudent.getGrade()) {
                worstStudent = students[i];
            }
        }
        return worstStudent;
    }
}
