import java.util.ArrayList;

public class User {
    private String userName;
    private String password;
    private String name;

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

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "User: " + this.userName + " - " + this.name;
    }

    public boolean equals(Object obj) {
        if (obj instanceof User) {
            User user = (User) obj;
            return this.userName.equals(user.userName);
        }
        return false;
    }

    public int hashCode() {
        return this.userName.hashCode();
    }


}

