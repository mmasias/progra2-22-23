public class Student {
    private String id;
    private float grade;
    private String name;
    private String surname;


    public Student(String id, String grade, String name, float surname) {
        this.id = id;
        this.grade = grade;
        this.name = name;
        this.surname = surname; }
    public String getId() {
        return id;    }
    public void setId(String id) {
        this.id = id;    }
    public String getName() {
        return name;   }
    public void setName(String name) {
        this.name = name;    }
    public String getSurname() {
        return surname;   }
    public void setSurname(String surname) {
        this.surname = surname;    }
    public float getGrade() {
        return grade;   }
    public void setGrade(float grade) {
        this.grade = grade; }  }