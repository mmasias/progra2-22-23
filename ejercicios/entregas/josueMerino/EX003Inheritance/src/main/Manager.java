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

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getAuthenticatedUser() {
        return authenticatedUser;
    }

    public void setAuthenticatedUser(User authenticatedUser) {
        this.authenticatedUser = authenticatedUser;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
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
        System.out.println("Bienvenido a su menú");

        this.authenticatedUser.getOptions().print();
    }
}
