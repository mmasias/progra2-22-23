package main;

public class User {

    private String userName;
    private String password;
    private String name;

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }
}
