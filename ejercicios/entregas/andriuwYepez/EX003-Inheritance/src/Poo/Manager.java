package Poo;

public class Manager {
    private User[] users;
    private User verifyUser;
    private MenuOption[] selectedOption;
    private int maxUsers;

    public Manager(User[] users, User verifydUser, MenuOption[] selectedOption, int maxUsers) {
        this.maxUsers = maxUsers;
        this.users = new User[maxUsers];
        this.verifyUser = null;
        this.selectedOption = new MenuOption[2];
    }

    public boolean verifyUser(String userName, String password) {
        for (int i = 0; i < this.maxUsers; i++) {
            if (this.users[i].getUserName().equals(userName) && this.users[i].getPassword().equals(password)) {
                this.verifyUser = this.users[i];
                return true;
            }
        }
        return false;
    }

    public void showMenu() {
        System.out.println("Menu");
        System.out.println("1. " + this.selectedOption[0].getDescription(1));
        System.out.println("2. " + this.selectedOption[1].getDescription(2));
        System.out.println("3. Exit");
    }

    public void addUser(User user) {
        for (int i = 0; i < this.maxUsers; i++) {
            if (this.users[i] == null) {
                this.users[i] = user;
                break;
            }
        }
    }
}