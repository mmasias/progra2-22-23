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
        float median =0;
        int contador=0;

        if (!isOrdered){
            orderStudents();
        }

        for (int i =0;i<students.length;i++){
            if (students[i]!=null)   {
                contador++;
            }
        }
        if (contador%2==0) {
            int mediana;
            mediana = students.length/2;
            float median1=students[mediana-1].getGrade();
            float median2=students[mediana].getGrade();
            median = (median1+median2)/2;
        } else{
            int mediana;
            mediana = students.length/2;
            median=students[mediana-1].getGrade();
        }

        return median;
    }

    public float getAverageGrade(){
        int contador=0;
        float media = 0;

        for (int x =0;x<students.length;x++){
            if (students[x]!=null)   {
                contador++;
            }
        }

        for (int i = 0; i < contador; i++) {
            media += students[i].getGrade();
        }
        media = (media / contador);
        return media;
    }


    public int getPosition() {
        return position;
    }
    public Student getBestStudent() {
        if (!isOrdered){
            orderStudents();
        }

        return students[0];
    }
    public Student getWorstStudent() {
        orderStudents();
        int contador=0;

        for (int x =0;x<students.length;x++){
            if (students[x]!=null)   {
                contador++;
            }
        }

        return students[contador-1];
    }

    public Student[] getStudents() {
        return students;
    }
}