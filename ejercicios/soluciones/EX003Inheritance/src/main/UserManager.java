package main;
public class UserManager extends Manager {
    public UserManager() {
        super();
    }

    public void registerUser(User user) {
        this.addUser(user);
    }

    public boolean isUserAdmin(User user) {
        return user.getClass().equals(Admin.class);
    }
}
