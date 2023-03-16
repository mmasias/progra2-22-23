public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;

    /**
     * Creates a new subject with the given name and capacity.
     * @param name The name of the subject.
     * @param capacity The maximum number of students that can be added to the subject.
     */
    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
    }

    public void addStudent(Student student) {
        if (position <= capacity) {
            students[position] = student;
            position++;
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

    public float getMedian() {
        orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[position / 2 - 1].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
    }

    public Student getStudent(int position){
        return students[position];
    }

    public Student getBestStudent(){
        orderStudents();
        return students[0];
    }

    public Student getWorstStudent(){
        orderStudents();
        return students[position];
    }

    public float getAverageGrade(){
        float totalGrades = 0;
        for (Student s : students) {
            totalGrades += s.getGrade();
        }
        float average = totalGrades/position;
        return average;
    }

}
