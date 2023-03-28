package main;

public class Admin extends User {

    private boolean isAdmin;

    public Admin(String userName, String password, String name, boolean isAdmin) {
        super(userName, password, name);
        this.isAdmin = isAdmin;
    }

    public Admin(String userName, String password) {
        super(userName, password);
        this.isAdmin = false;
    }

    public boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
