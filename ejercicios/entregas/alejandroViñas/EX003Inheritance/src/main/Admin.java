package main;

public class Admin extends User{

    private boolean isAdmin;
    public void isAdmin() {
        if (this.isAdmin) {
            System.out.println("You are an admin");
        } else {
            System.out.println("You are not an admin");
        }
    }
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    public boolean getAdmin() {
        return this.isAdmin;
    }
    public Admin(String userName, String userPassword, boolean isAdmin) {
        super(userName, userPassword);
        this.isAdmin = isAdmin;
    }


}
