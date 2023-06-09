package Main;

import java.util.List;

public class UserManager extends Manager {

    List users;

    public UserManager(int maxUsers){
        super(maxUsers);
    }

    public void registerUser(User user){
        super.add(user);
    }

    public boolean isUserAdmin(User user){
        return false;
    }
}
