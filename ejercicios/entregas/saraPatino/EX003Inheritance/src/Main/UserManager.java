package Main;

public class UserManager extends Manager {
    public UserManager(User[] users, User authenticatedUser, MenuOption[] selectedOption, int maxUsers) {
        super(users, authenticatedUser, selectedOption, maxUsers);
    }

    public void registerUser(User user){
        this.addUser(user);
    }

    public boolean isUserAdmin(User user){
        return user.isAdmin();
    }
}
