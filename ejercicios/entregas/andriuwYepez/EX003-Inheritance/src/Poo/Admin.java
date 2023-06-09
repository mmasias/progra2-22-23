package Poo;

public class Admin extends User {
    private boolean isAdmin;

    public Admin(String userName, String password, String name) {
        super(userName, password, name);
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

}