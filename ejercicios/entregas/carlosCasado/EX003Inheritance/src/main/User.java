package main;

public class User {

    private String userName;
    private String password;
    private String name;
    private boolean login;

    public User() {
        this.userName = "user";
        this.password = "password";
        this.name = "name";
    }

    public User(String userName, String password, String name) {
        this.userName = userName.toLowerCase();
        this.password = password;
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName.toLowerCase();
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

    public boolean login(String userName, String password) {
        login = this.userName.equals(userName) && this.password.equals(password);
        return login;
    }

}
