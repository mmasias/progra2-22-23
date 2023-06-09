package main;

public class Manager {

    private User[] users;
    private User authUser;
    private MenuOption selectedOption;
    private int maxUsers;
    private MenuOption[] options;
    private int userCount;

    public Manager() {
        this.maxUsers = 10;
        this.users = new User[maxUsers];
        this.authUser = null;
        this.selectedOption = null;
    }

    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        this.users = new User[maxUsers];
        this.authUser = null;
        this.selectedOption = null;
    }

    public void addUser(User newUser) {
        if (userCount < maxUsers) {
            users[userCount] = newUser;
            userCount++;
        }
    }

    public int getUsersLenght() {
        return userCount;
    }

    public boolean authenticatedUser(String userName, String password) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(userName) && user.getPassword().equals(password)) {
                authUser = user;
                System.out.println("Authenticated user");
                return true;
            }
        }
        System.out.println("Invalid username or password");
        return false;
    }

    public void showMenu() {
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i].getOption(i));
        }
    }

    public int getMax() {
        return maxUsers;
    }
}
