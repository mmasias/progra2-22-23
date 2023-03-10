public class User {
    private String name;
    private String password;
    private boolean isLogged;

    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
        this.isLogged = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogged() {
        return isLogged;
    }

    public void setLogged(boolean logged) {
        isLogged = logged;
    }
}
