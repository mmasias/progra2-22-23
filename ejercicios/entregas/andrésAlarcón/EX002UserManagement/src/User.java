public class User {

    String userName;
    String password;
    boolean login;

    public User() {
        this.userName = "admin";
        this.password = "admin";
        this.login = false;
    }
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.login = false;
    }
    private void setUserName(String userName) {
        userName = this.userName;
    }
    private void setUserPassword(String password) {
        password = this.password;
    }
    public void setLogin(boolean login) {
        this.login = login;
    }
    public String getUserName() {
        return userName;
    }
    public String getUserPassword() {
        return password;
    }
    public boolean getLogin() {
        return login;
    }

}
