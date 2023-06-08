package src;

public class Student {
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

    public void setGrade(float grade){
        this.grade = grade;
    }

    public float getGrade() {
        return this.grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }


}