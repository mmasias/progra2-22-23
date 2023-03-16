package Poo;

public class User {
    private boolean login;
    private String password;
    private String userName;

    /**
     * Creates a new user.
     * @param password The password of the user.
     * @param userName The name of the user.
     */
    public User (String password, String userName) {
        this.password = password;
        this.userName = userName;
        login = false;
    }

    public boolean getLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
