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
        else {System.out.println("The class is already at maximum capacity");}
    }

    public Student getStudent(int position){
        return students[position];
    }

    public String getName(int position){
        return students[position].getName();
    }

    public int getCapacity(int capacity){
        return capacity;
    }

    public boolean getIsOrdered(){
        return isOrdered;
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
        int posMedian1 = (position+1)/2 ;
        float median1 = students[posMedian1].getGrade();
        int posMedian2 = (position)/2 ;
        float median2 = students[posMedian2].getGrade();
        if (position % 2 == 0){
            return (median1+median2) / 2;
        }
        return median1;
    }

    public float getAverageGrade(){
        int average = 0;
        for (int i = 0; i < position; i++){
            average += students[i].getGrade();
        }
        average = average / position;
        return average;
    }

    public int getPosition() {
        return position;
    }
    public Student getBestStudent() {
        int bestStudentPos = 0;
        for (int i = 0; i < position; i++){
            if (students[i].getGrade() > students[bestStudentPos].getGrade()){
                bestStudentPos = i;
            }
        }
        return students[bestStudentPos];
    }
    public Student getWorstStudent() {
        int worstStudentPos = 0;
        for (int i = 0; i < position; i++){
            if (students[i].getGrade() < students[worstStudentPos].getGrade()){
                worstStudentPos = i;
            }
        }
        return students[worstStudentPos];
    }
}
