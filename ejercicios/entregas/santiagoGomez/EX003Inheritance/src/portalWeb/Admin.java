package src.portalWeb;

public class Admin extends User{
    private boolean isAdmin;


    public Admin(boolean isAdmin,String userName, String pass, String name) {
        super(userName, pass, name);
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin(){
        return isAdmin;
    }

    public void setAdmin(String isAdmin) {
        this.isAdmin = isAdmin();
    }
}
