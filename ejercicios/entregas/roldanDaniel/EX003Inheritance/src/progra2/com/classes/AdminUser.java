package progra2.com.classes;

public class AdminUser extends RegularUser{


    private boolean isAdmin;


    public AdminUser(boolean isAdmin){

        super();
        this.isAdmin=isAdmin;


    }

    public AdminUser(String userName, String password, String name, boolean isAdmin) {
        super(userName, password, name);
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
