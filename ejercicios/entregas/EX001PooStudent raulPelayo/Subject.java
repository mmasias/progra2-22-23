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

    private Student getStudent(int i) {
        Student s=null;
        if (i < position){
            s = this.students[i];
        }
        return s;

    }
    /*
     * Returns the median grade of all the students in the subject.
     */
    public float getMedian() {
        // TODO: Implement this method.
        orderStudents();
        float median = 0;
        if(position%2==1){ //impar
            int p = (position / 2);
            median = this.students[p].getGrade();

        }else { //par
            int p = (position / 2);
            int p2 = (p - 1);
            median = (this.students[p2].getGrade() + this.students[p].getGrade()) / 2;

        }

     return median;
    }



    public float getAverageGrade(){
        // TODO: Implement this method.
        float amount=0;
        for (int i=0; i< position; i++){
            Student s= getStudent(i);
            amount = amount + s.getGrade();
        }

        return amount / position;

    }

    public int getPosition() {
        return position;

    }
    public Student getBestStudent() {
        // TODO: Implement this method.

        return this.getStudent(0);

        }



    public Student getWorstStudent() {
        // TODO: Implement this method.
        return this.getStudent(position);
    }
}
