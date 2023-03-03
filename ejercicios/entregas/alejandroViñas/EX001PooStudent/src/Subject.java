
public class Subject {
    //Parameters
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;

   //Constructor
    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
    }

    //get and set methods
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getNumberOfStudents() {
        return position;
    }
    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    //Add a new student to the class

    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position++;
            isOrdered = false;
        }else{
            System.out.println("The class is full so the student can't be added");
        }
    }
    //Orders the students by grade from best to worst

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
    //Returns the median grade of the class

    public float getMedian() {
        orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[position / 2 - 1].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
    }
    //Returns the average grade of the class
    public float getAverage() {
        float sum = 0;
        for (int i = 0; i < position; i++) {
            sum += students[i].getGrade();
        }
        return sum / position;
    }

    //Returns the name and surname of the best student

    public String getBestStudent() {
        orderStudents();
        return students[0].getName() + " " + students[0].getSurname();
    }
    //Returns the name and surname of the worst student

    public String getWorstStudent() {
        orderStudents();
        return students[position - 1].getName() + " " + students[position - 1].getSurname();
    }
}
