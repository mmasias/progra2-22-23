package main;

public class User {
    private String name;
    private String password;
    private String userName;
    private Option options;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // As example, we will return the password as a hash
    public String getPassword() {
        return Integer.toString(this.password.hashCode());
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

    public String toString() {
        return "{" + this.name + ", " + this.userName + "}";
    }

    public boolean login(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public void setOptions(Option options) {
        this.options = options;
    }

    public Option getOptions() {
        return options;
    }
}
