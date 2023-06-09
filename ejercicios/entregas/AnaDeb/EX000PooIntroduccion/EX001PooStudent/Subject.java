public class Subject {

    private String name;
    private student[] students;
    private boolean tidy = false;
    private int position;
    private int nStudent;

    /*
     * Builder Subject
     * @params name, nAl
     *
     */
    Subject(String nam, int nStu){
        name = nam;
        position = 0;
        nStudent = nStu;
        student = new Student[nStudents];
    }
    /* Method to add students
     * @param al (student object)
     */
    public void addStudent(Student St){
        if (position<nStudent)
            students[position] = st;
        position++;
    }


    //     sort function
    //     Leave the student with the lowest grade in first position and the student with the highest grade in the last position


    private void tidy(){

        if (tidy == false){

            tidy = true;
            Student aux;
            int N = student.length;

            for (int i=0;i<(N-2);i++)
                for (int j=(N-1);j>i;j--)
                    if (students[j].getNote()<students[j-1].getNote()){
                        aux = students[j-1];
                        students[j-1] = students[j];
                        students[j] = aux;
                    }
        }
    }

    public float median(){
        tidy();
        return students[Math.round(students.length/2)].getNote();
    }



    public float AverageGrade(){


        float aux = 0;

        for (Student student : this.students) {

            aux = (aux + student.getNote());

        }

        return aux / nStudent;


    }

    /*
     *  Getters of Subject.
     */

    public String getName() {
        return name;
    }

    public Student getStudMax(){
        tidy();
        return students[students.length - 1];
    }

    public Student getStudMin(){
        tidy();
        return students[0];
    }

}