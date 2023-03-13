package Classes.Users;

import Classes.Menu.Options;

public class User {
    protected Options GeneralOptions  = new Options();
    protected String username;
    protected String password;
    protected boolean login;

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
