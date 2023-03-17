package Main;

public class User {
    private boolean login;
    private String password;
    private String userName;

    public User() {
        this.login = false;
        this.userName = "Diego";
        this.password = "123";
    }

    public User(String user, String password) {
        this.login = false;
        this.userName = user;
        this.password = password;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUserName(String user) {
        this.userName = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public boolean getLogin() {
        return this.login;
    }

    public boolean isLogin() {
        return this.login;
    }
}
