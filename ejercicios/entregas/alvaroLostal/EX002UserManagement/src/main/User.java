package main;

public class User {
    private String userName;
    private String userPassword;
    public boolean login;
    public User() {
        userName = "user";
        userPassword = "user";
        login = false;
        
    }

    public User(String userName, String userPassword, boolean login) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.login = login;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public User[] String;
}