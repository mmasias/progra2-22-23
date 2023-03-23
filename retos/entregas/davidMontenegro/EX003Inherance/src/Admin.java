package src;
public class Admin extends user{
    private boolean isAdmin;
    public boolean isAdmin(){
        return isAdmin;
    }
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
    public Admin(){
        super();
        this.isAdmin = false;
    }
}