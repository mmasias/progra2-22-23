package main;

public class User {
    private boolean login;
    private String name;
    private String password;

    public User(String name, String password){
        this.name=name;
        this.password=password;
        this.login=login;
    }
    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
