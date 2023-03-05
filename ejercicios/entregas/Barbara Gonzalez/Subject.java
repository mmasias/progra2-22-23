

public class Subject {
    //Atributos
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


    //Metodos
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

    public boolean getisOrdered() {
        return isOrdered;
    }

    public void setisOrdered(boolean isOrdered) {
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

    //añade un alumno a la asignatura
    public void addStudent(Student student){
        if (position < capacity) {
            students[position] = student;
            position++;
            isOrdered = false;
        }else{
            System.out.println("The class is full so the student can't be added");
        }
    }

    //ordena los alumnos por nota
    public void orderStudent(){
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

   //devuelve el alumno con la mejor nota
    public String getBestStudent(){
        orderStudents();
        return students[0].getName() + " " + students[0].getSurname();
    }

   //devuelve el alumno con la peor nota
    public String getWorstStudent(){
        orderStudents();
        return students[position - 1].getName() + " " + students[position - 1].getSurname();
    }

   //devuelve la nota media de la asignatura
    public float getAverage(){
        float sum = 0;
        for (int i = 0; i < position; i++) {
            sum += students[i].getGrade();
        }
        return sum / position;
    }

   //devuelve la nota mediana de la asignatura
   public float getMedian(){
    orderStudents();
        if (position % 2 == 0) {
            return (students[position / 2].getGrade() + students[position / 2 - 1].getGrade()) / 2;
        } else {
            return students[position / 2].getGrade();
        }
   }
}
