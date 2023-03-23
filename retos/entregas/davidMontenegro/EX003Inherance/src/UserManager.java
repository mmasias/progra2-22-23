package src;
public class UserManager extends Manager {
    public UserManager() {
        super();
    }
    public void registerUser(User user){
        add(user);
        if(user instanceof Admin){
            ((Admin) user).setAdmin(true);
            System.out.println("Admin registered");
        }
    }
    public boolean isUserAbmin(User user){
        if(user instanceof Admin){
            return ((Admin) user).isAdmin();
        }
        return false;
    }

}