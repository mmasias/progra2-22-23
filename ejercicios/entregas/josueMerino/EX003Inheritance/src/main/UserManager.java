package main;

public class UserManager extends Manager {

    public UserManager()
    {
        super();
    }

    public UserManager(int maxUsers)
    {
        super(maxUsers);
    }

    public void registerUser(User user)
    {
        addUser(user);
    }

    public boolean isUserAdmin(User user)
    {
        return user.isAdmin();
    }
}
