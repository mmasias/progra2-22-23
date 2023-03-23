package src.portalWeb;

public class Manager {
    private int maxUser;
    private String user;
    protected User[] User;
    private int UserRegistered;
    private String userAuth;
    private src.portalWeb.User UserAuth;
    private int MaxUser;

    public void addOption(String s) {
    }
    public void addUser(User user) {
        for (int i = 0; i < maxUser; i = i +1){
            if (User[i] == null) {
                User[i] = user;
            }
        }
    }

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

    public void setUserAuth(src.portalWeb.User userAuth) {
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

    public boolean userAuthenticated(String userName, String pass) {
        for (int i = 0; i < maxUser; i = i +1){
            if ((User[i] != null) && (User[i].getUserName().equals(userName)) && (User[i].getPass().equals(pass))){
                UserAuth = User[i];
                return true;
            }
        }
        return false;
    }

    public void Menu() {

    }
}

