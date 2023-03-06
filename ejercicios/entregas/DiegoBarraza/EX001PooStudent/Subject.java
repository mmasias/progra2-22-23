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

    public Subject() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position++;
            isOrdered = false;
        }
    }

    public Student getStudent(int position) {
        return students[position];
    }

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
    }

    /*
     * Returns the median grade of all the students in the subject.
     */

    public float getMedian() {

        if (!isOrdered) {orderStudents();}
        return (position % 2 == 0) ?
                ((students[(position / 2)].getGrade() + students[position / 2 - 1].getGrade()) / 2f) : (students[(position / 2)].getGrade());
    }

    /**
     * Returns the average grade of all the students in the subject.
     * @return The average grade of all the students in the subject.
     */

    public float getAverageGrade(){

        float avgGrade = 0f;
        for (int i = 0; i < position; i++) {
            avgGrade += students[i].getGrade();
        }
        return (avgGrade / (float) position);
    }

    public int getPosition() {
        return position;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }

    public Student getBestStudent() {
        if (!isOrdered) {orderStudents();}
        return students[(position - 1)];
    }

    public Student getWorstStudent() {
        if (!isOrdered) {orderStudents();}
        return students[0];
    }
}
