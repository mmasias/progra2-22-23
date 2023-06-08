package main;

public class Admin extends User {

    private boolean isAdmin;

    public Admin(String userName, String password, String name) {
        super(userName, password, name);
        isAdmin = true;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean getAdmin() {
        return isAdmin;
    }

}
