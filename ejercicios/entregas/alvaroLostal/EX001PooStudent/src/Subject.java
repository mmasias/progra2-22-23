public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;

    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
    }

    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addStudent(Student student){
        if(position < capacity){
            students[position] = student;
            position++;
            isOrdered = false;
        }

    }

    public void orderStudents(){
        if(!isOrdered){
            for (int i = 0; i < position; i++){
                for (int j = i+1; j< position; j++){
                    if (students[i].getGrade() < students[j].getGrade()) {
                        Student temporal = students[i];
                        students[i] = students[j];
                        students[j] = temporal;
                    }
                }
            }
            isOrdered = true;
        }
    }

    public Student getStudent(int position){
        orderStudents();
        this.orderStudents();
        return students[position];
    }

    public float getAverageGrade(){
        orderStudents();
        this.orderStudents();
        float sum = 0;
        for (int i = 0; i < position; i++) {
            sum += students[i].getGrade();
        }
        return sum / position;
    }

    public String getBestStudent() {
        orderStudents();
        this.orderStudents();
        return students[0].getName() + " " + students[0].getSurname();
    }

    public String getWorstStudent() {
        orderStudents();
        this.orderStudents();
        return students[position - 1].getName() + " " + students[position - 1].getSurname();
    }

    public float getMedian() {
        orderStudents();
        this.orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[position / 2 - 1].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
    }
}