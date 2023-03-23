package Main;

public class admin extends User{
    private boolean isAdmin;
    public admin (boolean isAdmin, String login, String name, String password){
        super(login,name,password);
        this.isAdmin = isAdmin;
    }
    public boolean isAdmin(){
        return isAdmin;
    }
    public void setAdmin(boolean isAdmin){
        this.isAdmin = isAdmin;
    }
}
