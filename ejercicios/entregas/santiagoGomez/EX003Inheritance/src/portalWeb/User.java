package src.portalWeb;

public class User {
    protected String userName;
    protected String pass;
    protected String name;

    public User(String userName, String pass, String name){
        this.userName = userName;
        this.pass = pass;
        this.name = name;
    }

    public User(int maxUser) {
    }

    public static String getUserName() {
        return getUserName();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static String getPass() {
        return getPass();
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public static String getName() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }
}
