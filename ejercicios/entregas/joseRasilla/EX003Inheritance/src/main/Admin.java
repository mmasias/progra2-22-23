package main;

public class Admin extends User {
    private boolean isAdmin;

    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Admin(String userName, String _password, String completeName) {
        super(userName, _password, completeName);
        this.isAdmin = true;
    }


}
