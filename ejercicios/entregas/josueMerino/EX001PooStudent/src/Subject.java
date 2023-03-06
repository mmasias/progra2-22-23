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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public boolean getIsOrdered() {
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
     * Add a student increasing the subject position
     * */
    public void addStudent(Student student) {
        if (this.position < this.capacity) {
            students[this.position] = student;
            this.position = this.position + 1;
            this.isOrdered = false;
        }
    }

    /**
     * Get Student by his index
     * @return The student in the index position
     * */
    public Student getStudent(int index)
    {
        return this.students[index];
    }

    /**
     * Order students by their grades
     * */
    public void orderStudents() {
        if (!isOrdered) {
            for (int i = 0; i < position; i++) {
                for (int j = i + 1; j < position; j++) {
                    if (students[i].getGrade() > students[j].getGrade()) {
                        Student temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }
                }
            }
            isOrdered = true;
        }
        this.setStudents(this.students);
    }

    /**
     * Returns the median grade of all the students in the subject.
     * @return the median grade of all the students in the subject.
     */
    public float getMedian() {
        this.orderStudents();
        Student[] students = this.getStudents();
        int totalStudents = this.position;

        if( (totalStudents % 2) == 0 )
        {
            int centralPosition = totalStudents / 2;
            return (students[centralPosition].getGrade() + students[centralPosition - 1].getGrade())/ 2;
        }
        else {
            int centralPosition = (int) Math.ceil(totalStudents / 2d);
            return students[centralPosition - 1].getGrade();
        }

    }

    /**
     * Returns the average grade of all the students in the subject.
     * @return The average grade of all the students in the subject.
     */
    public float getAverageGrade(){
        Student[] students = this.getStudents();
        int totalStudents = this.position;
        float gradesSum = 0f;

        for (int i = 0; i < totalStudents; i++) {
            gradesSum += students[i].getGrade();
        }



        return gradesSum / totalStudents;
    }


    /**
     * Return the student with the major grade
     * @return the student with the major grade
     * */
    public Student getBestStudent() {
        this.orderStudents();

        return this.students[this.position - 1];
    }

    /**
     * Return the student with the worst grade
     * @return the student with the worst grade
     * */
    public Student getWorstStudent() {
        this.orderStudents();
        return this.students[0];
    }
}
