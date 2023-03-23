package src.main;

public class Admin extends User{
    // Attributes
    private boolean isAdmin;

    // Constructor
    public Admin(String userName, String password, String name, boolean isAdmin) {
        super(userName, password, name);
        this.isAdmin = isAdmin;
    }
    public boolean isAdmin() {
        return isAdmin;
    }
    public boolean getAdmin(User user) {
        return isAdmin;
    }
    public void setAdmin() {
        this.isAdmin = true;
    }
}
