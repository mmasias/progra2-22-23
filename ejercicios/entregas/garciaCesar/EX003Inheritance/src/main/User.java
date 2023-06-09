package src.main;
public class User {
    private String userName;
    private String password;
    private String name;
    private String options;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return Integer.toString(this.password.hashCode());
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
    public String toString() {
        return "User [name=" + name +  ", username=" + userName + "]";
    }
    public boolean login(String username, String password) {
        if (this.userName.equals(username) && this.password.equals(password)) {
            return true;
        }
        return false;
    }
    public void setOptions(String options) {
        this.options = options;
    }
    public Option getOptions() {
        return options[];
    }
}

