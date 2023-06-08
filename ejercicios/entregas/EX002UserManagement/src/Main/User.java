package Main;

public class User {
    private String userName;
    private String userPassword;
    public String Name;

    public boolean login;
    public User(){
        userName = "user";
        userPassword = "user";
        login =false;
    }

    public User(String userName, String userPassword, String name, boolean login) {
        this.userName = userName;
        this.userPassword = userPassword;
        Name = name;
        this.login = login;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
}


