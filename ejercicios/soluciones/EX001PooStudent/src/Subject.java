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
        if (!isOrdered) this.orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[(position / 2) - 1].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
    }

    public float getAverageGrade(){
        float sum = 0;
        for (int i = 0; i < position; i++) {
            sum = sum + students[i].getGrade();
        }
        return sum / position;
    }

    public int getPosition() {
        return position;
    }
    /**
     * Returns the best student in the subject based on their grade.
     * @return Student  And instance of a Student with the best grade.
     */
    public Student getBestStudent() {
        if (!isOrdered) this.orderStudents();
        return students[0];

    }

    /**
     * Returns the worst student in the subject based on their grade.
     * @return Student  And instance of a Student with the worst grade.
     */
    public Student getWorstStudent() {
        if (!isOrdered) this.orderStudents();
        return students[position - 1];
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setIsOrdered(boolean isOrdered) {
        this.isOrdered = isOrdered;
    }


}
