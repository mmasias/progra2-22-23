package src.main;

public class UserManager extends Manager {
    public UserManager(User[] users, User authenticatedUser, int selectedOption, int maxUsers) {
        super(users, authenticatedUser, selectedOption, maxUsers);
    }

    public void registerUser(User user) {
        addUser(user);
    }
    public boolean isUserAdmin(User user) {
        return false;
    }
}
