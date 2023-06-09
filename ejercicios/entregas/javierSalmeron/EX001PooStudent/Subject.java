/**
 * A class representing a subject, which contains a list of students and their
 * grades.
 */
public class Subject {
    /** The name of the subject. */
    private String name;

    /** An array of students in the subject. */
    private Student[] students;

    /** A flag indicating whether the students are currently ordered by grade. */
    private boolean isOrdered;

    /** The number of students currently in the subject. */
    private int position;

    /** The maximum number of students that can be in the subject. */
    private int capacity;

    /**
     * Creates a new subject with the given name and capacity.
     *
     * @param name     the name of the subject
     * @param capacity the maximum number of students that can be in the subject
     */

    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
    }

    /**
     * Adds a student to the subject.
     *
     * @param student the student to add
     */
    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position = position + 1;
            isOrdered = false;
        }
    }

    /**
     * Orders the students in the subject by grade, from highest to lowest.
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

    /**
     * Calculates the average grade of all the students in the subject.
     *
     * @return the average grade
     */
    public double getAverage(){
        double sum = 0.0;
        int size = students.length; 
        for (int i = 0; i < size; i++){
            sum += students[i].getGrade();
        }
        return sum / size;
    }

    /**
     * Calculates the median grade of all the students in the subject.
     *
     * @return the median grade
     */

    public float getMedian() {
        if (!isOrdered) {
            orderStudents();
        }
        int n = position;
        if (n % 2 == 0) {
            return (students[n / 2 - 1].getGrade() + students[n / 2].getGrade()) / 2.0f;
        } else {
            return students[n / 2].getGrade();
        }
    }
    
    /**
     * Returns the number of students currently in the subject.
     *
     * @return the number of students
     */
    public int getPosition() {
        return position;
    }

    /**
     * Returns the student with the highest grade in the subject.
     *
     * @return the student with the highest grade
     */
    public Student getBestStudent() {
        Student bestStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() > bestStudent.getGrade()) {
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }

    /**
     * Gets the student with the lowest grade.
     *
     * @return the student with the lowest grade
     */
    public Student getWorstStudent() {
        Student worstStudent = students[0];
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() < worstStudent.getGrade()) {
                worstStudent = students[i];
            }
        }
        return worstStudent;
    }

    /**
     * Gets the student at the specified position.
     *
     * @param index the position of the student to retrieve
     * @return the student at the specified position
     */
    public String getStudent(int index) {
        if (index >= 0 && index < position) {
            return students[index].toString();
        } else {
            return "Invalid student position!";
        }
    }
    
}
