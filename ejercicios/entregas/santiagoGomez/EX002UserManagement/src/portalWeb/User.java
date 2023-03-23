package src.portalWeb;

public class User {
    private String login;
    private String pass;
    private String name;

    public User(String login, String pass, String name){
        this.login = login;
        this.pass = pass;
        this.name = name;
    }

    public User(int maxUser) {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
