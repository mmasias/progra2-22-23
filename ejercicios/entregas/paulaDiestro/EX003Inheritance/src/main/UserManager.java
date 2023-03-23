package main;

import java.util.List;

public class UserManager extends Manager {
    private List users;

    public UserManager(int maxUsers) {
        super(maxUsers);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public boolean isUserAdmin(User user) {
        return false;
    }
}

