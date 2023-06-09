public class RegularUser extends User{

    boolean isAdmin;

    public RegularUser(String userName, String password, String name) {
        super(userName, password, name);

        isAdmin = false;

    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }


}
