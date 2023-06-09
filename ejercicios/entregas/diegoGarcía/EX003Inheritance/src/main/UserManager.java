package main;



public class UserManager extends Manager{

    public static void registerUser(User user) {
        if(authenticateUser(user.getUserName(), user.getPassword(), user)){
            addUsers(user);
        }
    }

    public static boolean isUserAdmin(User user) {
        if(user instanceof Admin){
            return true;
        }
        return false;
    }
}