package main;

public class Manager {
    public static User[] users;
    public static User authenticatedUser;
    public MenuOption selectedOption;
    public static int maxUsers;
    public static int size;

    public Manager() {
        this.maxUsers = 10;
        this.users = new User[maxUsers];
        size = 0;
    }
    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        this.users = new User[maxUsers];
        size = 0;
    }

    public static void addUser(User newUser){
        if (size<maxUsers){
            users[size] = newUser;
            size++;
        }
    }

    public static boolean authenticateUser(String username, String password){
        for (User u : users){
            if (u != null){
                if (u.getUserName().equals(username)){
                    if (u.tryPassword(password)){
                        authenticatedUser = u;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static User getAuthenticatedUser() {
        return authenticatedUser;
    }

    public void showMenu(){

    }
}
