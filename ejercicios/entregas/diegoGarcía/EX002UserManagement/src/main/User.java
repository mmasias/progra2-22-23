
package main;

public class User {
    private boolean login = false;
    private String userPassword;
    private String userName;

    public User() {
        this.userPassword = "user";
        this.userName = "user";
    }

    public User(String name, String password) {
        this.userPassword = password;
        this.userName = name;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isLogin() {
        return this.login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
}

