package Classes;

import Classes.Menu.MenuItemImpl;
import Interfaces.MenuItem;
import Classes.Users.Admin;
import Classes.Users.Student;
import Classes.Users.Teacher;
import Classes.Users.User;

import java.util.Scanner;

public class Manager {
    private boolean runSystem;
    private User currentUser;
    private User[] users;
    private Scanner scanner = new Scanner(System.in);


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
                boolean passwordValidation = this.validatePassword(password);
                if (passwordValidation) {
                    this.currentUser = getValidatedUser(userName);
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

    public boolean validatePassword(String password) {
        for (User user: users) {
            if (user.getPassword().equals(password)) {
                return true;
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
        boolean displayOptions = true;
        int selectedOption;
        MenuItem[] options = getOptions(this.currentUser);

        while (displayOptions) {
            System.out.println("*".repeat(30));
            for (MenuItem option: options) {
                System.out.printf("%c %s %s", '>', option.getText(), System.lineSeparator());
            }
            System.out.println("Input the action you want to execute:");
            selectedOption = scanner.nextInt();
            if (selectedOption < 1 || selectedOption > options.length) {
                System.out.println("Invalid choice.");
            } else {
                options[selectedOption -1].execute();
            }
        }
    }

    public MenuItem[] getOptions(User user) {
        if (user instanceof Student) {
            return ((Student) user).getOptions();
        } else if (user instanceof Teacher) {
            return ((Teacher) user).getOptions();
        } else {
            return ((Admin) user).getOptions();
        }
    }

    public User getCurrentUser() {
        return this.currentUser;
    }
}
