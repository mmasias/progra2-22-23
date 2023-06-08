import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SubjectTest {
    //Parameters
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;

    //Constructor
    public SubjectTest(String name, int capacity) {
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
    @Test
    public String getName() {
        return name;
    }
    @Test
    public int getCapacity() {
        return capacity;
    }
    @Test
    public int getPosition() {
        return position;
    }
    @Test
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
    public void setIsOrdered(boolean ordered) {
        isOrdered = ordered;
    }
    @Test
    public boolean getIsOrdered() {
        return isOrdered;
    }
    //Add a new student to the class

    @Test
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
    @Test
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
    @Test
    public float getMedian() {
        orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[position / 2 - 1].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
    }
    //Returns the average grade of the class
    @Test
    public float getAverage() {
        float sum = 0;
        for (int i = 0; i < position; i++) {
            sum += students[i].getGrade();
        }
        return sum / position;
    }

    //Returns the name and surname of the best student
    @Test
    public String getBestStudent() {
        orderStudents();
        return students[0].getName() + " " + students[0].getSurname();
    }
    //Returns the name and surname of the worst student
    @Test
    public String getWorstStudent() {
        orderStudents();
        return students[position + 1].getName() + " " + students[position + 1].getSurname();
    }
}