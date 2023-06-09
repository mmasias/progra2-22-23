public class Admin extends User {
    private boolean isAdmin;
    public Admin(String username, String password, String name, boolean isAdmin){
        super(username, password, name);
        this.isAdmin = isAdmin;    }
    public boolean isAdmin() {
        return isAdmin; }
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;}}