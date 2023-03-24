public class User{
    private String username;
    private String password;
    private String name;

    /**
     * Default constructor
     * Sets parameters to generic text
     */
    public User() {
        this.name= "name";
        this.password= "password";
        this.username= "User";
    }
    /**
     * Constructor for User
     * @param name name of the account user
     * @param password password elected by the user
     * @param username username defined by the user
     */
    public User(String name,String password,String username) {
        this.name= name;
        this.password= password;
        this.username= User;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name= name;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password= password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}