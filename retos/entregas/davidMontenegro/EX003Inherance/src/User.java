package src;
public class User{
    private String name;
    private String password;
    private String userName;

    private Options options;
    public User(String name, String password, String userName){
        this.name = "user";
        this.password = "password";
        this.name = "User";
    }
    public User(String name, String password, String userName){
        this.name = name;
        this.password = password;
        this.userName = userName;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getUserName(){
        return userName;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setOptions(Options options) {
        this.options = options;
    }
    public Options getOptions() {
        return options;
    }
    public boolean login(String userName, String password){
        if(this.userName.equals(userName) && this.password.equals(password)){
            return true;
        }
        return false;
    }
}