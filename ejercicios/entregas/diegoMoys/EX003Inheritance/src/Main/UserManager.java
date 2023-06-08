package Main;

public class UserManager extends Manager{

    public UserManager(int capacity) {
        super(capacity);
    }
    public void registerUser(User user){
        super.addUser(user);
    }

    public boolean isUserAdmin(User user){

        for (int i = 0; i < size; i++) {
            if (user.equals(users[i])){
                if(((Admin)user).isAdmin()){
                    return true;
                }
            }
        }
        return false;
    }
}
