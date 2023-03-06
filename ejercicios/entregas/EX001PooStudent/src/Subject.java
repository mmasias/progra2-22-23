public class Subject {
    //attributes
    String name;
    Student[] students;
    boolean isOrdered;
    boolean isDisOrder;
    int position;
    int capacity;
    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
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

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }

    public boolean isDisOrder() {
        return isDisOrder;
    }

    public void setDisOrder(boolean disOrder) {
        isDisOrder = disOrder;
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

    public void addStudent(Student student){
        if(position < capacity){
            this.students[position] = student;
            position = position + 1;
        }
    }

    public void orderStudents() {
        for (int i = 0; i < position; i++) {
            for (int j = i + 1; j < position; j++) {
                if (students[i].getGrade()<students[j].getGrade()){
                    Student now = students[i];
                    students[i]= students[j];
                    students[j]=  now;
                    isOrdered = true;
                }
            }
        }
    }

    public void disOrderStudents() {
        for (int i = 0; i < position; i++) {
            for (int j = i + 1; j < position; j++) {
                if (students[i].getGrade()>students[j].getGrade()){
                    Student now = students[i];
                    students[i]= students[j];
                    students[j]=  now;
                    isDisOrder = true;
                }
            }
        }
    }

    public Student getStudent (int position){
        orderStudents();
        this.orderStudents();
        return students[position];
    }

    public String getBestStudent () {
        orderStudents();
        this.orderStudents();
        return students[0].getName() + " " + students[0].getSurname();
    }
    public String getWorstStudent() {
        disOrderStudents();
        this.disOrderStudents();
        return students[0].getName() + " " + students[0].getSurname();
    }

    public float getAverageGrade(){
        orderStudents();
        this.orderStudents();
        float additionMarks = 0;
        for (int i = 0; i < position; i++) {
            additionMarks += students[i].getGrade();
        }
        return additionMarks / position;
    }
    public float getMedian() {
        orderStudents();
        this.orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2 - 1].getGrade()+ students[position / 2].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
    }



}



