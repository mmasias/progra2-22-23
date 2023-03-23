package src.main;

public class User {
    // Attributes
    protected String userName;
    protected String password;
    private String name;
    private Option[] options;

    // Constructor
    public User(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
    };
    public User(){
        this.userName = "";
        this.password = "";
        this.name = "";
    }

    // userName
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
        // password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
        // name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOptions(Option[] options) {
        this.options = options;
    }
}
