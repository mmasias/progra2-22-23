package main;

public class UserManager extends Manager {
    public void registerUser(User user){
       super.add(user);
    }
    public static boolean isUserAdmin(User user){
        boolean userAdmin = false;
        if (((Admin)user).isAdmin() == true) {
            userAdmin = true;
        }
        return userAdmin;
    }
}
