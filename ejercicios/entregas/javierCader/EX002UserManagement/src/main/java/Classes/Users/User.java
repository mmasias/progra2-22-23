package Classes.Users;

public abstract class User {
    protected String username;
    protected String password;
    protected boolean login;

    public User(String username, String password, boolean login) {
        this.username = username;
        this.password = password;
        this.login = login;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLogin() {
        return login;
    }
}
