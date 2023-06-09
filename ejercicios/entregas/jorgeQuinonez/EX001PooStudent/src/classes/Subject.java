package classes;

public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;

    /**
     * Creates a new subject with the given name and capacity.
     * 
     * @param name     The name of the subject.
     * @param capacity The maximum number of students that can be added to the
     *                 subject.
     */

    // subject constructor ---------------------------
    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
    }

    // Add student method -------------------------------------------------------
    // The method sets the student in the first position available in the subject
    // After insert the student, it reduce the capacity by one.
    // It does it until there's no more space/capacity on it.
    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position = position + 1;
            isOrdered = false;
        }
    }

    // ಠ_ಠ
    /**
     * Returns the average grade of all the students in the subject.
     * 
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
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[position / 2].getGrade()) / 2;
        } else {
            return (students[position / 2].getGrade()) / 2;
        }
    }

    public float getAverageGrade() {
        float gradeSum = 0;
        for (int i = 0; i < position; i++) {
            gradeSum = gradeSum + students[i].getGrade();
        }
        return gradeSum / position;
    }

    public int getPosition() {
        return position;
    }

    public Student getBestStudent() {
        orderStudents();
        return students[0];
    }

    public Student getWorstStudent() {
        orderStudents();
        return students[position - 1];
    }
}
