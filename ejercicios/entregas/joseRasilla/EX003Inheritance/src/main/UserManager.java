package main;

public class UserManager extends Manager{
    public static void registerUser(User user) {
        addUser(user);
    }

    public static boolean isUserAdmin(User user) {
        return (user instanceof Admin);
    }
}