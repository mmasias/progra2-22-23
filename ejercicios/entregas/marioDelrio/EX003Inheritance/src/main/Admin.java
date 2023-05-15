package main;

public class Admin extends User {
    private boolean admin;

    public Admin(String userName, String password, String name, boolean admin) {
        super(userName, password, name);
        this.admin = admin;
    }

    public Admin(boolean admin) {
        super("delRio", "potatoe", "Mario");
        this.admin = admin;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


}
