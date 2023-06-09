package main.core;

public class UserManager extends Manager {
    public UserManager() {
        super();
    }

    public void registerUser(User user) {
        add(user);
        if (user instanceof Admin) {
            ((Admin) user).setAdmin(true);
        }
    }

    public boolean userPrivileges(User user) {
        if (((Admin) user).isAdmin() == true) {
            return true;
        }
        return false;

    }

}
