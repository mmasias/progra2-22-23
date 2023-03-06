package classes;

public class Student {

    // Attributes from class: Student

    private String name;
    private String surname;
    private String id;
    private float grade;

    /*
     * Creates a new student with the given name, surname, id and grade.
     * 
     * @param name The name of the student.
     * 
     * @param surname The surname of the student.
     * 
     * @param id The id of the student.
     * 
     * @param grade The grade of the student.
     */

    // Student object constructor ---------------------------------------

    public Student(String name, String surname, String id, float grade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grade = grade;
    }

    // Getters -----------------------------------

    public float getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    // Setters ------------------------------------

    public void setGrade(float newGrade) {
        newGrade = this.grade;
    }

    public void setName(String newName) {
        newName = this.name;
    }

    public void setSurname(String newSurname) {
        newSurname = this.surname;
    }

    public void setId(String newId) {
        newId = this.id;
    }
}