


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
        // TODO: Implement this method.
        if (!isOrdered) {
            orderStudents();
        }
        if (position % 2 == 0) {
            int index1 = position / 2 - 1;
            int index2 = position / 2;
            return (students[index1].getGrade() + students[index2].getGrade()) / 2.0f;
        } else {
            int index = position / 2;
            return students[index].getGrade();
        }

    }


    public float getAverageGrade(){
        // TODO: Implement this method.
        float sum = 0;
        for (int i = 0; i < position; i++) {
            sum += students[i].getGrade();
        }
        return sum / position;
    }

    public int getPosition() {
        return position;
    }
    public Student getBestStudent() {
        // TODO: Implement this method.

        if (!isOrdered) {
            orderStudents();
        }
        return students[0];
    }
    public Student getWorstStudent() {
        // TODO: Implement this method.

        if (!isOrdered) {
            orderStudents();
        }
        return students[position - 1];
    }

}
