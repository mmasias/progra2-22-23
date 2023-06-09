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
        if (position < capacity) {
            students[position] = student;
            position = position + 1;
            isOrdered = false;
        }
    }
    //ಠ_ಠ
    /**
     * Returns the average grade of all the students in the subject.
     * @return The average grade of all the students in the subject.
     */
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
        orderStudents();
        this.orderStudents();
        float median;
        if((position % 2) != 0 ){
            median = students[position / 2].getGrade();
            return median;
        }else{
            median = (students[position / 2].getGrade() + students[position / 2 - 1].getGrade());
            median = median/2;
            return median;
        }
    }

    public float getAverageGrade(){
        orderStudents();
        float add = 0;
        for (int i = 0; i < position; i++) {
            add = students[i].getGrade() + add;
        }
        float average = add / position;
        return average;
    }
    /* Returns the number of student of the subject

     */
    public int getPosition() {
        return position;
    }
    /* Returns the best student in the subject

     */
    public Student getBestStudent() {
        orderStudents();
        this.orderStudents();
        Student bestStudent = students[0];
        return bestStudent;
    }
    /* Returns the worst student in the subject

     */
    public Student getWorstStudent() {
        orderStudents();
        this.orderStudents();
        Student worstStudent = students[position - 1];
        return worstStudent;
    }
}