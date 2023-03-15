package Classes;

import Classes.Menu.Options;
import Utils.Interfaces.MenuItem;
import Classes.Users.User;

import java.util.Scanner;

public class Manager {
    private boolean runSystem;
    private User currentUser;
    private final User[] users;
    private final Scanner scanner = new Scanner(System.in);
    private final Options options = new Options(this);

    public Manager(User[] users) {
        this.users = users;
        this.runSystem = true;
        this.login();
    }

    public void login() {
        while (runSystem) {
            System.out.println("Input username:");
            String userName = scanner.nextLine();
            boolean usernameValidation = this.validateUserName(userName);

            if (usernameValidation) {
                System.out.println("Input password:");
                String password = scanner.nextLine();
                boolean passwordValidation = this.validatePassword(userName, password);
                if (passwordValidation) {
                    this.currentUser = getValidatedUser(userName);
                    this.currentUser.setLogin(true);
                    this.displayOptions();
                } else {
                    System.out.println("Invalid password");
                }
            } else {
                System.out.println("Invalid username");
            }
        }
    }

    public boolean validateUserName(String userName) {
        for (User user : users) {
            if (user.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public boolean validatePassword(String username, String password) {
        for (User user: users) {
            if (user.getUsername().equals(username)) {
                if (user.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    public User getValidatedUser(String userName) {
        for (User user: users) {
            if (userName.equals(user.getUsername())) {
                return  user;
            }
        }
        return users[0];
    }

    public void displayOptions() {
        int selectedOption;
        MenuItem[] optionsMenu = this.options.getSelectedUserOptions();

        if (optionsMenu == null) {
            throw new IllegalStateException("Invalid Options");
        }

        while (this.currentUser.isLogin()) {
            System.out.println("*".repeat(30));
            for (MenuItem option: optionsMenu) {
                System.out.printf("%c %s %s", '>', option.getText(), System.lineSeparator());
            }
            System.out.println("Input the action you want to execute:");
            selectedOption = scanner.nextInt();
            if (selectedOption < 1 || selectedOption > optionsMenu.length) {
                System.out.println("Invalid choice.");
            } else {
                optionsMenu[selectedOption -1].execute();
            }
        }
    }

    public User getCurrentUser() {
        return this.currentUser;
    }

    public User[] getAllUsers() {
        return this.users;
    }

    public void setRunSystem(boolean runSystem) {
        this.runSystem = runSystem;
    }
}
