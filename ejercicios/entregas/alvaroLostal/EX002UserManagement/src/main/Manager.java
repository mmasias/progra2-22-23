package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<User> users;
    private User authenticatedUser;
    private Option optionMenu;
    private int maxUsers;

    public Manager(int maxUsers) {
        this.users = new ArrayList<>();
        this.authenticatedUser = null;
        this.optionMenu = new Option(5);
        this.maxUsers = maxUsers;
    }

    public void addUser(String userName, String userPassword) {
        if (users.size() < maxUsers) {
            User newUser = new User(userName, userPassword);
            users.add(newUser);
            System.out.println("User " + userName + " has been added successfully.");
        } else {
            System.out.println("Error: Reached maximum number of users.");
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public boolean authenticateUser(String userName, String userPassword) {
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getUserPassword().equals(userPassword)) {
                authenticatedUser = user;
                authenticatedUser.login();
                System.out.println("User " + userName + " has been authenticated successfully.");
                return true;
            }
        }
        System.out.println("Error: Invalid user or password.");
        return false;
    }


    public void showOptionMenu() {
        Scanner scanner = new Scanner(System.in);

        if (authenticatedUser == null) {
            System.out.println("Error: No user authenticated.");
            return;
        }

        optionMenu.addOption("Option 1");
        optionMenu.addOption("Option 2");
        optionMenu.addOption("Option 3");
        optionMenu.addOption("Option 4");
        optionMenu.addOption("Exit");

        while (true) {
            System.out.println("\nWelcome, " + authenticatedUser.getUserName() + ".");
            System.out.println("Select an option:");

            ArrayList<String> options = optionMenu.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i+1) + ". " + options.get(i));
            }

            int selectedOption;
            try {
                selectedOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid option.");
                continue;
            }

            if (selectedOption < 1 || selectedOption > options.size()) {
                System.out.println("Error: Invalid option.");
                continue;
            }

            if (selectedOption == options.size()) {
                authenticatedUser.setLogin(false);
                break;
            }

            optionMenu.setSelectedOption(options.get(selectedOption-1));
            System.out.println("Selected option: " + optionMenu.getSelectedOption());
        }
    }
}
