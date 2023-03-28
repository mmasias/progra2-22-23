package main;

public class User {

    protected String userName;
    protected String password;
    protected String name;

    public User(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
        this.name = name;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }

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
        return Integer.toString(this.password.hashCode()); // Hashing the password : int -> converting to String
    }

    public String getName() {
        return this.name;
    }

}
