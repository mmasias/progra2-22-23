package Main;

public class User {

    private String name;
    private String password;
    private String userName;



    /**
     * Default constructor for User
     * Sets the username to "user"
     * Sets the password to "password"
     * Sets the name to "User"
     */
    public User() {
        this.userName = "user";
        this.password = "password";
        this.name = "User";
    }

    /**
     * Constructor for User
     *
     * @param userName username of the user
     * @param password password of the user
     */
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.name = name;
    }


    public void setName(String Name) {
        this.name = name;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public String getUserName() {
        return userName;
    }

    public String getPassword(){
        return password;
    }


    public boolean login(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)&& this.name.equals(name)) {
            return true;
        }
        return false;
    }

}
