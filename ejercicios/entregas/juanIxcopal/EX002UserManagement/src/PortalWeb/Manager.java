package PortalWeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    private List<User> users;
    private User authenticatedUser;
    private Option menu;

    public Manager(int maxUsers, int maxOptions) {
        this.users = new ArrayList<User>();
        this.authenticatedUser = null;
        this.menu = new Option(maxOptions);
    }

    public User getAuthenticatedUser() {
        return authenticatedUser;
    }


    public void addUser(User user) {
        users.add(user);
    }

    public boolean authenticate(String login, String password) {
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                authenticatedUser = user;
                return true;
            }
        }
        return false;
    }

    public void addMenuOption(String option) {
        menu.addOption(option);
    }

    public void showMenu() {
        if (authenticatedUser != null) {
            System.out.println("Welcome " + authenticatedUser.getName());
            System.out.println("Select an option:");
            for (int i = 0; i < menu.getMaxOptions(); i++) {
                String option = menu.getOption(i);
                if (option != null) {
                    System.out.println((i+1) + ". " + option);
                }
            }
        } else {
            System.out.println("Please authenticate first");
        }
    }

    public static void main(String[] args) {
        Manager manager = new Manager(10, 5);
        manager.addUser(new User("user1", "pass1", "User 1"));
        manager.addUser(new User("user2", "pass2", "User 2"));
        manager.addMenuOption("Option 1");
        manager.addMenuOption("Option 2");
        manager.addMenuOption("Option 3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login:");
        String login = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (manager.authenticate(login, password)) {
            manager.showMenu();
            int option = scanner.nextInt();
            manager.menu.setSelectedOption(option-1);
            System.out.println("Selected option: " + manager.menu.getOption(manager.menu.getSelectedOption()));
        } else {
            System.out.println("Authentication failed");
        }
    }
}


