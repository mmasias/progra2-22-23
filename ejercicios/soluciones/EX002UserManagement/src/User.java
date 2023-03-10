package main;

public class User {
    private String userName;
    private String userPassword;
    public boolean login;
    public User(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.login = false;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean setLogin(boolean login) {
        this.login = login;
        return login;
    }

    public boolean getLogin() {
        return login;
    }
}