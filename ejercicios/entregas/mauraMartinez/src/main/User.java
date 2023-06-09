package main;

    public class User {
    private String userName;
    private String password;
    private String name;
    private Option option;

    public User(String userName, String password, String name) {
        this.userName = userName;
        this.password = password;
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

    public void setUsername(String username) {
        this.userName = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean login(String userName, String password) {
        if (this.userName.equals(userName) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public void setOptions(Option option) {
        this.option = option;
    }

    public Option getOptions() {
        return option;
    }
}

