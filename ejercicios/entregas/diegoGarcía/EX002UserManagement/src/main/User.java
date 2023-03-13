package main;

public class User {
    private boolean login;
    private String userPassword;
    private String userName;

    public User() {
        this.login = false;
        this.userPassword = "user";
        this.userName = "user";
    }
    public User(String name, String password) {
        this.login = false;
        this.userPassword = password;
        this.userName = name;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }


    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

}
