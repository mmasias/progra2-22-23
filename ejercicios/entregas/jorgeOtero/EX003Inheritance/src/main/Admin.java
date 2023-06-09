package main;

public class Admin extends User {
    private boolean isAdmin;
    public Admin(String userName, String password, String name) {
        super(userName, password, name);
        this.isAdmin = true;
    }
    public boolean isAdmin(){
        return isAdmin;
    }
    public void setAdmin(boolean admin){
        this.isAdmin = admin;
    }
}
