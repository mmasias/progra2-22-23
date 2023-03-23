package main;

public class User {

    private String userName;
    private String password;
    private String name;
    static Option options;

    public User() {
        this.userName = "user";
        this.password = "password";
        this.name = "User";
    }

    public User(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Option getOptions() {
        return options;
    }

    public boolean tryPassword(String passwordTried){
        return(passwordTried == password);
    }

    public void setOptions(Option options) {
        User.options = options;
    }
}
