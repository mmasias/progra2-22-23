package src.main;

public class Manager {
    // Attributes
    private User[] users;
    private User authenticatedUser;
    private int selectedOption;
    private int maxUsers;

    // Constructor
    public Manager(User[] users, User authenticatedUser, int selectedOption, int maxUsers) {
        this.users = users;
        this.authenticatedUser = authenticatedUser;
        this.selectedOption = 0;
        this.maxUsers = maxUsers;
    }

    public Manager() {
        this.users = new User[] {};
        this.authenticatedUser = null;
        this.selectedOption = 0;
        this.maxUsers = 0;
    }

    // users
    public void addUser(User user) {
        if (selectedOption < maxUsers) {
            users[selectedOption] = user;
            selectedOption++;
        }
    }

    public boolean authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                authenticatedUser = user;
                return true;
            }
        }
        return false;
    }

    public User authenticatedUser(String username, String password) {
        for (User user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                authenticatedUser = user;
                return user;
            }
        }
        return null;
    }

    public User[] getUsers() {
        return users;
    }
}
