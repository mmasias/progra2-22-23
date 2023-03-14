package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<String> users;
    private String authenticatedUser;
    private Option optionMenu;
    private int maxUsers;

    public Manager() {
        this.users = new ArrayList<String>();
        this.authenticatedUser = null;
        this.optionMenu = new Option(5);
        this.maxUsers = maxUsers;
    }

    public void addUser(String user) {
        if (users.size() < maxUsers) {
            users.add(user);
        } else {
            System.out.println("Error: Reached maximum number of users.");
        }
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public boolean authenticateUser(String user) {
        if (users.contains(user)) {
            authenticatedUser = user;
            return true;
        } else {
            System.out.println("Error: Invalid user.");
            return false;
        }
    }

    public void showOptionMenu() {
        Scanner scanner = new Scanner(System.in);

        optionMenu.addOption("Option 1");
        optionMenu.addOption("Option 2");
        optionMenu.addOption("Option 3");
        optionMenu.addOption("Option 4");
        optionMenu.addOption("Exit");

        while (true) {
            System.out.println("\nWelcome, " + authenticatedUser + ".");
            System.out.println("Select an option:");

            ArrayList<String> options = optionMenu.getOptions();
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i+1) + ". " + options.get(i));
            }

            int selectedOption = scanner.nextInt();
            scanner.nextLine();

            if (selectedOption < 1 || selectedOption > options.size()) {
                System.out.println("Error: Invalid option.");
                continue;
            }

            if (selectedOption == options.size()) {
                break;
            }

            optionMenu.setSelectedOption(options.get(selectedOption-1));
            System.out.println("Selected option: " + optionMenu.getSelectedOption());
        }
    }
}
