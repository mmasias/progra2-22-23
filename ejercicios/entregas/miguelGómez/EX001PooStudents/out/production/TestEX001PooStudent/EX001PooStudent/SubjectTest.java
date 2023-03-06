package EX001PooStudent;
import org.testng.annotations.Test;

public class SubjectTest{
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
    public SubjectTest(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
    }

    @Test
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Test
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    @Test
    public boolean getisOrdered() {
        return isOrdered;
    }

    public void setisOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    @Test
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

    /*
     * Returns the median grade of all the students in the subject.
     */
    @Test
    public float getMedian() {
        orderStudents();
        if (position % 2 == 0){
            return ((students[position/2].getGrade() + students[position/2+1].getGrade())/2);
        }else{
            return (students[position/2]).getGrade();
        }
    }

    @Test
    public float getAverageGrade(){
        orderStudents();
        float sum= 0;
        for(int i= 0;i < position;i++){
            sum += students[i].getGrade();

        }
        return sum/ position;
    }
    @Test
    public int getPosition() {
        return position;
    }
    @Test
    public String getBestStudent() {
        orderStudents();
        return students[0].getName() + " " + students[0].getSurname();
    }
    @Test
    public String getWorstStudent() {
        orderStudents();
        return students[position-1].getName() + " " + students[position-1].getSurname();
    }
}


