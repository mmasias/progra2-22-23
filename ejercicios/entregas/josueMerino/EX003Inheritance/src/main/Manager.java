package main;

public class Manager {
    int maxUsers;
    int size;
    User users[];

    User authenticatedUser;

    String selectedOption;

    public Manager() {
        this.maxUsers = 10;
        this.size = 0;
        this.users = new User[maxUsers];
    }

    public Manager(int maxUsers) {
        this.maxUsers = maxUsers;
        this.size = 0;
        this.users = new User[maxUsers];
    }

    public void addUser(User user) {
        if (size < maxUsers) {
            users[size] = user;
            size++;
        }
    }

    public User authenticateUser(String userName, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].login(userName, password)) {
                authenticatedUser = users[i];
                return authenticatedUser;
            }
        }
        System.out.println("Invalid username or password");
        return null;
    }

    public void showMenu()
    {

    }
}
