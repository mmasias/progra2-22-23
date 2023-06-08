public class UserManager extends Manager {
    public UserManager(int maxUsers) {
        super(maxUsers);
    }

    public void registerUser(User user) {
        addUser(user);
    }

    public boolean isUserAdmin(User user) {
        if (user instanceof Admin) {
            return ((Admin) user).isAdmin();
        } else {
            return false;
        }
    }
}