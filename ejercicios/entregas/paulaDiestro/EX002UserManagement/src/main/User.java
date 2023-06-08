package main;

public class User {
    private String userName;
    private String userPassword;
    private boolean login;

    public User(String userName, String userPassword, boolean login){
        userName = "Paula";
        userPassword = "abcde";
        login = false;
    }

    public String getUserName() {
        return userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public boolean isLogin() {
        return login;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public void setLogin(boolean login) {
        this.login = login;
    }
}
