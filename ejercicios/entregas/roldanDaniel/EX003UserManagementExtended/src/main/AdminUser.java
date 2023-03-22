package src.main;

public class AdminUser extends User{

    private boolean isAdmin;
    private User [] allusers;
    private int capacity;

    public AdminUser(String login, String password, String name, boolean isAdmin){

        super();
        this.isAdmin=isAdmin;
        allusers= new User[10];
    }

    public void setAdmin(String login, String password, String name, boolean isAdmin){

        this.setLogin(login);
        this.setPassword(password);
        this.setName(name);
        this.isAdmin=isAdmin;

    }

    public boolean isAdmin(){
        return this.isAdmin;
    }

}
