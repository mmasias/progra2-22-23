import java.util.ArrayList;

public class Admin extends User {
    private boolean isAdmin;

    public Admin(String userName, String password, String name) {
        super(userName, password, name);
        isAdmin = true;
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String isUserAdmin(User user1) {
        if (user1 instanceof Admin) {
            return "Admin";
        } else {
            return "Regular User";
        }
    }
}


