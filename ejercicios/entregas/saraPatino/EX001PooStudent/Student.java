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
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return this.surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public float getGrade() {
    return this.grade;
  }

  public void setGrade(float grade) {
    this.grade = grade;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

}