package main;

public class Admin extends User {
    private boolean isAdmin;


    public Admin(String username, String password, String name) {
        super(username, password, name);
        this.isAdmin = true;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }





}
