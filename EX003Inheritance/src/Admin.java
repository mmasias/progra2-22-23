public class Admin extends User {
    private boolean isAdmin;

    /**
     * Default constructor for User
     * Sets the username to "user"
     * Sets the password to "password"
     * Sets the name to "User"
     */
    public Admin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * Constructor for User
     *
     * @param userName username of the user
     * @param password password of the user
     * @param name     name of the user
     */
    public Admin(String userName, String password, String name, boolean isAdmin) {
        super(userName, password, name);
        this.isAdmin = isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
