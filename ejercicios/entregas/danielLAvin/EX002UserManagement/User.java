package Codigo;

public class User {
    private String password;
    private String name;
    private boolean login;

    public User(String password, String name, boolean login) {
        this.password = password;
        this.name = name;
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
}
