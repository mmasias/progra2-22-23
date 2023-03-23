
public class UserManager extends Manager{

    public UserManager() {
    }

    public UserManager(int capacity) {
        super(capacity);
    }
    public void registerUser(User user){
        super.add(user);

    }
    public boolean isUserAdmin(User user){
        boolean b= false;
        for (int i = 0; i < size; i++) {
            if (user.equals(users[i])){
                if(user instanceof Admin){
                    b=((Admin)user).isAdmin();
                }
            }
        }
        return b;
    }


}
