package main;

public class UserManager extends Manager {

    public UserManager(int capacity) {
        super(capacity);
    }

    public boolean registerUser(User user) {
       return createUser(user);
    }

    public boolean isUserAdmin(User user) {
        boolean adminState = false;
        if (user instanceof Admin) adminState = ((Admin)user).getAdmin();
        return adminState;
    }

}
