public class Admin extends User {
    boolean isAdmin;
    Admin(String login, String password, String name) {

        super(login, password, name);
        isAdmin = true;

    }
    public boolean isAdmin(){

        return isAdmin;

    }

    void setAdmin(boolean admin) {

        isAdmin = admin;

    }

}
