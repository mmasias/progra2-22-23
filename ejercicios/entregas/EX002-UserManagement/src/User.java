public class User {
    private String name;
    private String pass;
    private boolean login;

    public User(String name, String pass, boolean login) {
        this.name = name;
        this.pass = pass;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isLogin() {
        return login;
    }


    public void setLogin(boolean login) {
        this.login = login;
    }



}
