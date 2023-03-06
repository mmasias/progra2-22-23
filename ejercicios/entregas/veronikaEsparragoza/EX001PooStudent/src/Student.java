public class Student {
    //Attributes of the class.
    private String name;
    private String surname;
    private String id;
    private float grade;

    /*
     * Creates a new student with the given name, surname, id and grade.
     * @param name The name of the student.
     * @param surname The surname of the student.
     * @param id The id of the student.
     * @param grade The grade of the student.
     */
    public Student(String name, String surname, String id, float grade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grade = grade;
    }

    public Student(){
        this.name = "";
        this.surname = "";
        this.id = "";
        this.grade = 0;
    }

    //Get and Set methods for the id attribute.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Get and Set methods for the name attribute.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Get and Set methods for the surname attribute.
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //Get and Set methods for the grade attribute.
    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}