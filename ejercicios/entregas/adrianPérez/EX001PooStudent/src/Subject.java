public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;

    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.students = new Student[capacity];
        this.isOrdered = false;
        this.position = 0;
    }

    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position++;
            isOrdered = false;
        } else {
            System.out.println("No more space for students");
        }
    }

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

    public Student getStudent(int index) {
        if (index < capacity) {
            return students[index];
        }
        else {
            return null;
        }
    }

    public Student getBestStudent() {
        Student temp = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() > temp.getGrade()) {
                temp = students[i];
            }
        }
        return temp;
    }

    public Student getWorstStudent() {
        Student temp = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() < temp.getGrade()) {
                temp = students[i];
            }
        }
        return temp;
    }

    public float getAverageGrade() {
        float sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getGrade();
        }
        return sum / students.length;
    }

    public float getMedianGrade() {
        float median = 0;
        if (students.length % 2 == 0) {
            median = (students[students.length / 2].getGrade() + students[students.length / 2 - 1].getGrade()) / 2;
        } else {
            median = students[students.length / 2].getGrade();
        }
        return median;
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
    public void setOrdered(boolean isOrdered) {
        this.isOrdered = isOrdered;
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
}
