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

    public void setUserName(String userName) {

        this.userName = userName;
    }
    public void setUserPassword(String userPassword) {

        this.userPassword = userPassword;
    }
    public String getUserName() {

        return this.userName;
    }
    public String getUserPassword() {
        return this.userPassword;
    }
    public void setLogin(boolean login) {
        this.login = login;
    }
    public boolean getLogin() {
        return this.login;
    }

    public void changePassword(String newUserPassword) {
        this.userPassword = newUserPassword;
    }
    public void changeUserName(String newUserName) {
        this.userName = newUserName;
    }
    public void logout() {
        this.login = false;
    }

    public void login(String userName, String userPassword) {
        if (this.userName.equals(userName) && this.userPassword.equals(userPassword)) {
            this.login = true;
        }
    }


}

