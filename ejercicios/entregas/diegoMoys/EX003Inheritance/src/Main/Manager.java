package Main;

public class Manager {
    protected User[] users;
    private User authenticatedUser;
    private MenuOption[] selectedOption;
    private int maxUsers;
    protected int size;

    public Manager() {
        this.maxUsers = 10;
        this.size = 0;
        this.users = new User[maxUsers];
    }

    public Manager(int capacity) {
        this.maxUsers = capacity;
        this.size = 0;
        this.users = new User[capacity];
    }

    public void addUser(User user) {
        if (size < maxUsers) {
            users[size] = user;
            size++;
        }
    }
    public boolean authenticateUser(String userName, String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getUserName().equals(userName) && users[i].getPassword().equals(password)) {
                authenticatedUser = users[i];
                return true;
            }
        }
        System.out.println("Invalid username or password");
        return false;
    }

    public void showMenu() {
        System.out.println("Menu");
        System.out.println("1. " + this.selectedOption[0].getDescription());
        System.out.println("2. " + this.selectedOption[1].getDescription());
        System.out.println("3. Exit");
    }
}
