package main;

public class Admin extends User {
    private boolean isAdmin;
    public Admin(String userName, String password) {
        super(userName, password);
        this.isAdmin = true;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
