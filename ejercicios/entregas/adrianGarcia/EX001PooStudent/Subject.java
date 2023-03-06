public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;

    public Subject(String name, int capacity) {
        this.students = new Student[capacity];
        this.isOrdered = false;
        this.position = 0;       
        this.name = name;
        this.capacity = capacity; }
    public String getName() {
        return name;   }
    public void setName(String name) {
        this.name = name;  }
    public Student[] getStudents() {
        return students;   }
    public void setStudents(Student[] students) {
        this.students = students;  }
    public boolean isIsOrdered() {
        return isOrdered;   }
    public void setIsOrdered(boolean isOrdered) {
        this.isOrdered = isOrdered;    }
    public int getPosition() {
        return position;   }
    public void setPosition(int position) {
        this.position = position;   }
    public int getCapacity() {
        return capacity;  }
    public void setCapacity(int capacity) {
        this.capacity = capacity;  }
    public void addStudent(Student student) {
        if (this.position < this.capacity) {
            this.students[this.position] = student;
            this.position++;
            this.isOrdered = false;      }   }
    public void orderStudents() {
        if (!this.isOrdered) {
            for (int i = 0; i < this.position; i++) {
                for (int j = 0; j < this.position - 1; j++) {
                    if (this.students[j].getGrade() < this.students[j + 1].getGrade()) {
                        Student aux = this.students[j];
                        this.students[j] = this.students[j + 1];
                        this.students[j + 1] = aux;                   }               }          }
            this.isOrdered = true;       }   }
    public float getMedianGrade() {
        float median = 0;
        if (this.position % 2 == 0) {
            median = (this.students[this.position / 2].getGrade() + this.students[(this.position / 2) - 1].getGrade()) / 2;
        } else {
            median = this.students[this.position / 2].getGrade();       }
        return median;  }
    public Student getBestStudent() {
        if (this.position > 0) {
            return this.students[0];
        } else {
            return null;       }    }
    public float getAverageGrade() {
        float average = 0;
        for (int i = 0; i < this.position; i++) {
            average += this.students[i].getGrade();        }
        return average / this.position;   }
    public Student getWorstStudent() {
        if (this.position > 0) {
            return this.students[this.position - 1];
        } else {
            return null;       }   }
    public Student getSpecifiedStudent(int position) {
        if (position < this.position) {
            return this.students[position];
        } else {
            return null;       }   }   }