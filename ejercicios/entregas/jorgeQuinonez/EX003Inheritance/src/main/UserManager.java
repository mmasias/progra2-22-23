package main;

public class UserManager extends Manager {

    public UserManager() {
        super();
    }

    public void registerUser(User user) {
        addUser(user);
    }

    public boolean isUszrAdmin(User user) {
        if (((Admin) user).getAdmin() == true) {
            return true;
        }
        return false;
    }
}
