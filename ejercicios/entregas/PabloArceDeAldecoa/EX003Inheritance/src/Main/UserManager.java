package Main;

public class UserManager extends Manager{
    public UserManager(int maxUsers) {
        super(maxUsers);
    }
    public void registerUser(User user){
        addUser(user);
    }
    public boolean isUserAdmin(admin admin){
        return admin.isAdmin();
    }
}
