package main.core;

public class Admin extends User {

    // Admins have admin privileges
    private boolean isAdmin;

    public Admin() {
        super();
        this.isAdmin = true;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
