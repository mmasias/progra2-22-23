public class Student{

    //Atributos
    private String name;
    private String surname;
    private String id;
    private float grade;

    //Constructor

    public Student(){

    }

    public Student(String name, String surname, String id, float grade){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.grade = grade;
    }

    //Metodos
    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getId(){
        return id;
    }

    public float getGrade(){
        return grade;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setGrade(float grade){
        this.grade = grade;
    }
}