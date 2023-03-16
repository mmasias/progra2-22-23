public class Student {
    private String name;
    private String surname;
    private String id;
    private float grade;

    public Student(String name, String surname, String id, float grade) {
        // TODO: Implement this constructor
        this.name = name;
        this.surname = surname;
        this.i = id;
        this.grade = grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public float getGrade(){
        return this.grade;
    }

    public String getName() {
        // TODO: Implement this method
        return this.name;
    }

    public void setName(String name) {
        // TODO: Implement this method
        this.name = name;
    }

    public String getSurname() {
        // TODO: Implement this method
        return this.surname;
    }

    public void setSurname(String surname) {
        // TODO: Implement this method
        this.surname = surname;
    }

    public String getId() {
        // TODO: Implement this method
        return id;
    }

    public void setId(String id) {
        // TODO: Implement this method
        this.id = id;
    }
}
