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
        //Initialization of the attributes with the parameters
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    public float getGrade() {
        return grade;
        //Returns the attribute grade
    }
    public String getName() {
    	return name;
        //Returns the attribute name
    }

    public void setName(String name) {
    	this.name = name;
        //Sets the attribute name with the parameter
    }

    public String getSurname() {
    	return surname;
        //Returns the attribute surname
    }

    public void setSurname(String surname) {
    	this.surname = surname;
    	//Sets the attribute surname with the parameter
    }

    public String getId() {
    	return id;
    	//Returns the attribute id

    }

    public void setId(String id) {
    	this.id = id;
    	//Sets the attribute id with the parameter
    }
}
