package src;

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
        orderStudents();
        if (position%2 == 0){
            return (students[position/2].getGrade() + students[(position/2) - 1].getGrade())/2;
        } else{
            return students[position/2].getGrade();
        }
    }

    public float getAverageGrade(){
        float add = 0;
        for (int i = 0; i < position; i = i+1){
            add = add + students[i].getGrade();
        }
        return add/position;
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
        return students[position-1];
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean getOrdered() {
        return this.isOrdered;
    }

    public Student[] getStudents() {
        return this.students;
    }
}