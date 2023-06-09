package Poo;

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
     * Adds the given student to the Subject.
     * @param student The student that wants to be added.
     */
    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position++;
            isOrdered = false;
        }
    }

    /**
     * Orders the students by their grade, from best to worst.
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
     * Calculates the median grade of the subject.
     * @return The median grade of the subject.
     */
    public float getMedian() {
        orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[position / 2 - 1].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
    }

    /**
     * Calculates the average grade of the subject.
     * @return The average grade of the subject.
     */
    public float getAverageGrade() {
        float gradesAddition = 0;
        orderStudents();
        for (int i = 0; i < position; i++) {
            gradesAddition = gradesAddition + students[i].getGrade();
        }

        return gradesAddition / position;
    }

    public int getPosition() {
        return position;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }

    public Student getStudent(int index) {
        return students[index];
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
