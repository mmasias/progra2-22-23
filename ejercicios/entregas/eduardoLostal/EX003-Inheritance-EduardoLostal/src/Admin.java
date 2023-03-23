public class Admin extends User{

    boolean isAdmin;

    public Admin(String userName, String password, String name) {
        super(userName, password, name);
        isAdmin = true;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
