public class Subject {
    /**
     * Creates a new subject with the given name and capacity.
     * @param name The name of the subject.
     * @param capacity The maximum number of students that can be added to the subject.
     */
    //Attributes of the class.
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
    public Subject(){
        this.name = "";
        this.capacity = 0;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[0];
    }

    //Get and Set methods for the name attribute.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Get and Set methods for the students attribute.
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    public int getPosition() {
        return position;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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


    public Student getBestStudent() {
        orderStudents();
        return students[0];
    }
    public Student getWorstStudent() {
        orderStudents();
        return students[position - 1];
    }
}