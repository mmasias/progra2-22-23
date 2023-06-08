package src.portalWeb;

public class Manager {
    private String user;
    private int UserRegistered;
    private String userAuth;
    private int UserAuth;
    private int MaxUser;

    public Manager(int maxUser){
        this.user = String.valueOf(new User(maxUser));
        this.userAuth = String.valueOf(new User(maxUser));
        this.MaxUser = maxUser;
    }

    public Manager(int maxUser, int i) {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getUserRegistered() {
        return UserRegistered;
    }

    public void setUserRegistered(int userRegistered) {
        UserRegistered = userRegistered;
    }

    public String getUserAuth() {
        return userAuth;
    }

    public void setUserAuth(int userAuth) {
        UserAuth = userAuth;
    }

    public int getMaxUser() {
        return MaxUser;
    }

    public void setMaxUser(int maxUser) {
        MaxUser = maxUser;
    }

    public boolean login(String user){

        return false;
    }

    public void register(String user){
    }

    public void addUser(User user) {
    }

    public void addOption(String s) {
    }

    public boolean userAuth(String user1, String pass1) {
        return true;
    }
}

