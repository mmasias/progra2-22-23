package main;

public class User {
    private String userName;
    private String userPassword;
    public boolean login;

    public User() {
        userName = "admin";
        userPassword = "admin";
        login = false;
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
public void login(String userName, String userPassword) {
        if (userName.equals(this.userName) && userPassword.equals(this.userPassword)) {
            this.login = true;
        } else {
            this.login = false;
        }
    }
}