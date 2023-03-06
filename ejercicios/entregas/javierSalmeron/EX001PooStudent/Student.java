/**
 * The Student class represents a student in a school.
 */
public class Student {
    private String name;
    private String surname;
    private String id;
    private float grade;

    /**
     * Creates a new student with the given name, surname, id and grade.
     *
     * @param name    The name of the student.
     * @param surname The surname of the student.
     * @param id      The id of the student.
     * @param grade   The grade of the student.
     */
    public Student(String name, String surname, String id, float grade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grade = grade;
    }

    /**
     * Sets the grade of the student.
     *
     * @param grade The grade to set.
     */
    public void setGrade(float grade) {
        this.grade = grade;
    }

    /**
     * Returns the grade of the student.
     *
     * @return The grade of the student.
     */
    public float getGrade() {
        return grade;
    }

    /**
     * Returns the name of the student.
     *
     * @return The name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the student.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the surname of the student.
     *
     * @return The surname of the student.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the surname of the student.
     *
     * @param surname The surname to set.
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * Returns the id of the student.
     *
     * @return The id of the student.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the id of the student.
     *
     * @param id The id to set.
     */
    public void setId(String id) {
        this.id = id;
    }
}
