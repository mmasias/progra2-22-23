package main;

public class Manager {
    static User[] users;
    static User authenticatedUser;
    static int maxUsers;
    static int size;

    public Manager() {
        this.maxUsers = 10;
        this.size = 0;
        users = new User[maxUsers];
    }

    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        this.size = 0;
        users = new User[maxUsers];
    }
    public static void addUsers(User user) {
        if (size < maxUsers) {
            users[size] = user;
            size++;
        }
    }

    public static boolean authenticateUser(String username, String password, User user) {
        if (user.getUserName() == username){
            if(user.tryPassword(password)){
                authenticatedUser = user;
                return true;
            }
        }else{
            System.out.println("Invalid username or password");
            return false;
        }
        return false;
    }

    public static User getAuthenticatedUser() {
        return authenticatedUser;
    }



}
