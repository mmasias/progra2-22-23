public class Student {
    private String name;
    private String surname;
    private String id;
    private float grade;

    public Student(String name, String surname, String id, float grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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