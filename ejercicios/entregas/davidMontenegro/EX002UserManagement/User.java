public class User {
    private String name;
    private boolean login;

    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public static void SetPassword(String password) {
        this.password = password;
    }
    public static void SetLogin( boolean login) {
        this.login = login;
    }
    public static void SetName(String name) {
        this.name = name;
    }

    public static String GetPassword() {
        return this.password;
    }
    public static boolean GetLogin() {
        return this.login;
    }
    public static String GetName() {
        return this.name;
    }
}