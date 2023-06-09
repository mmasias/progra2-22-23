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

    public Student[] getStudents() {
        return this.students;
    }
    public void orderStudents() {
        if (!isOrdered) {
            for (int i = 0; i < capacity - 1; i++) {
                int minIndex = i;
                for (int j = i +1; j < capacity; j++) {
                    if (students[j].getGrade() < students[minIndex].getGrade()) {
                        minIndex = j;
                    }
                }
                Student temp = students[minIndex];
                students[minIndex] = students[i];
                students[i] = temp;
            }
            isOrdered = true;
        }
    }

    /*
     * Returns the median grade of all the students in the subject.
     */
    public float getMedian() {
        float[] grades = new float[capacity];

        if (!isOrdered) {
            orderStudents();
        }

        for (int i = 0; i < capacity - 1; i++) {
            grades[i] = students[i].getGrade();
        }

        if (capacity % 2 != 0) {
            return grades[capacity/2];
        } else {
            return (float) (grades[capacity/2-1] + grades[capacity/2] / 2.0);
        }
    }

    public float getAverageGrade(){
        float sumOfGrades = 0;

        for (Student student: students) {
            sumOfGrades += student.getGrade();
        }

        return sumOfGrades/capacity;
    }

    public int getPosition() {
        return position;
    }
    public Student getBestStudent() {
        if (!isOrdered) {
            orderStudents();
        }
        return students[position - 1];
    }
    public Student getWorstStudent() {
        if (!isOrdered) {
            orderStudents();
        }
        return  students[0];
    }
}