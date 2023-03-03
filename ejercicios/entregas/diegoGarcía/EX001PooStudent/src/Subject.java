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
                        Student temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }
                }
            }
            isOrdered = true;
        }
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
}
