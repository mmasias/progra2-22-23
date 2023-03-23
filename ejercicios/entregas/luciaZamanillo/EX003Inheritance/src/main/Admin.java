package main;

public class Admin extends User {
    // shows if the user is admin or not.
    private boolean isAdmin;

    public Admin() {
        super();
        this.isAdmin = false;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}
