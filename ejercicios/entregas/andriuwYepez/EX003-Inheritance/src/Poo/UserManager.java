package Poo;

public class UserManager extends Manager {
    public UserManager(User[] users, User verifyUser, MenuOption[] selectedOption, int maxUsers) {
        super(users, verifyUser, selectedOption, maxUsers);
    }

    public void registerUser(User user){
        this.addUser(user);
    }

    public boolean isUserAdmin(User user){
        return user.isAdmin();
    }
}
