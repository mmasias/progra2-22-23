import org.junit.Test;
public class StudentTest {
    private String id;
    private float grade;
    private String name;
    private String surname;


    @Test public StudentTest(String id, float grade, String name, String surname) {
        this.id = id;
        this.grade = grade;
        this.name = name;
        this.surname = surname;}
    @Test 
    public String getId() {
    return id; }
    public void setId(String id) {
    this.id = id;   }
    @Test
    public float getGrade() {
    return grade;   }    
    @Test       
    public void setGrade(float grade) {
    this.grade = grade; }
    @Test  
    public String getName() {
    return name;}
    public void setName(String name) {
    this.name = name;}
    @Test    
    public String getSurname() {
    return surname; }
    public void setSurname(String surname) {
    this.surname = surname; } }