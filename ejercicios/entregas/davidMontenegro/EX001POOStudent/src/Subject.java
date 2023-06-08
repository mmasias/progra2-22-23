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
        } else {
            System.out.println("The Class is full, you can't add more students");
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
    // Setters and getters
    public String getName() {
        return name;
    }
    public setName(String name) {
        this.name = name;
    }
    public Student[] getStudents() {
        return students;
    }
    public setStudents(Student[] students) {
        this.students = students;
    }
    public boolean isOrdered() {
        return isOrdered;
    }
    public setOrdered(boolean ordered) {
        isOrdered = ordered;
    }
    public setPosition(int position) {
        this.position = position;
    }

    public int getCapacity() {
        return capacity;
    }
    public setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /*
    * Returns the median grade of all the students in the subject.
     */
    public float getMedian() {
        // TODO: Implement this method.
        float grades = new float[capacity];
        OrderStudents();
        for (int i = 0; i < position; i++) {
            grades[i] = students[i].getGrade();
        }
        if (capacity % 2 == 0) {
            return (grades[capacity / 2] + grades[(capacity / 2) - 1]) / 2;
        } else {
            return float grades[capacity / 2];
        }

    }

    public float getAverageGrade(){
        // TODO: Implement this method.
        float sumGrades = 0;
        float grades = new float[capacity];
        for (int i = 0; i < position; i++) {
            grades[i] = students[i].getGrade();
            sumGrades = sumGrades + grades[i];
        }
        return sumGrades / position;

    }

    public int getPosition() {
        return position;
    }
    public Student getBestStudent() {
        // TODO: Implement this method.
        OrderStudents();
        return students[position - 1];
    }
    public Student getWorstStudent() {
        // TODO: Implement this method.
        OrderStudents();
        return students[0];
    }
}
