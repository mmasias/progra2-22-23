package org.example;
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

    /**
     * Adds a new student to the subject.
     * @param student The student to be added.
     */

    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position = position + 1;
            isOrdered = false;
        }
    }

    /**
     * Orders the students in the subject by grade.
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
        orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[(position / 2) - 1].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
    }

    /*
     * Returns the average grade of all the students in the subject.
     */
    public float getAverageGrade(){
        // TODO: Implement this method.
        float sum = 0;
        for (int i = 0; i < position; i++) {
            sum = sum + students[i].getGrade();
        }
        return sum / position;
    }

    /*
     * Returns the position of the student in the array.
     */
    public int getPosition() {
        return position;
    }

    /*
     * Returns the capacity of subject.
     */
    public int getCapacity() {
        return capacity;
    }

    /*
     * Returns the name of subject.
     */
    public String getName() {
        return name;
    }

    /*
     * Returns the isOrdered of subject.
     */
    public boolean getIsOrdered() {
        return isOrdered;
    }

    /*
     * Returns the students of subject.
     */
    public Student[] getStudents() {
        return students;
    }

    /*
     * Returns the best student in the subject.
     */
    public Student getBestStudent() {
        // TODO: Implement this method.
        orderStudents();
        return students[0];

    }

    /*
     * Returns the worst student in the subject.
     */
    public Student getWorstStudent() {
        // TODO: Implement this method.
        orderStudents();
        return students[position-1];
    }
}