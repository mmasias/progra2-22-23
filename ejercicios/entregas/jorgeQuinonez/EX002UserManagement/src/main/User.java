package src.main;

public class User {

    private String name;
    private String user;
    private String password;
    private boolean isLogged;

    public User(String name, String user, String password) {
        this.name = name;
        this.user = user;
        this.password = password;

    }

    public User() {
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public boolean getLogin() {
        return isLogged;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(boolean isLogged) {
        this.isLogged = isLogged;
    }

}
