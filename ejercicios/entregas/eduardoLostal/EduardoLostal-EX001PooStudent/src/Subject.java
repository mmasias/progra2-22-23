public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


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


    //With this method you can get the average of the grade of the students...
    public float getAverageGrade() {
        if (position == 0) {
            return 0;
        }

        float sum = 0;
        for (int i = 0; i < position; i++) {
            sum += students[i].getGrade();
        }

        return sum / position;
    }


    //With this method you can get the best student
    public Student getBestStudent() {
        if (!isOrdered) {
            orderStudents();
        }

        return students[0];
    }


    //With this method you can get the worst student
    public Student getWorstStudent() {
        if (!isOrdered) {
            orderStudents();
        }

        return students[position - 1];
    }
}