public class Student {
    private String name;
    private String surname;
    private String id;
    private float grade;

    public Student(String name, String surname, String id, float grade) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

    public float getGrade() {
        return grade;
    }

}
