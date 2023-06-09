import main.Manager;
import main.Option;
import main.RegularUser;
import main.User;

import java.util.Scanner;

/**
 * Commit: feature(solution): Solution for the exercise
 * EX003Inheritance giving a Main implementation and validating the
 * solution with tests.
 * - EX003Inheritance: Solution for the exercise EX003Inheritance
 * - WashingMachine: Project base for Friday 24 lecture
 */
public class Main {
    static Manager manager;
    static Scanner standardInput;

    static void init() {
        System.out.println("Initializing the Bank App...");
        manager = new Manager();
        standardInput = new Scanner(System.in);

        // We add default user to the manager
        Option optionRegularUser = new Option();
        optionRegularUser.addOption("Payments");
        optionRegularUser.addOption("Transfers");
        optionRegularUser.addOption("Graphs");

        User userRegular = new RegularUser("user", "user");
        userRegular.setOptions(optionRegularUser);

        manager.addUser(userRegular);

    }
    static void showMenu() {
        System.out.println("Please, select an option:");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Show my options");
        System.out.println("4. Exit");
        System.out.println("------------------------------------");
        System.out.println("Your option: ");
    }
    public static void main(String[] args) {

        User user1 = new User("user1", "123");
        User user2 = new User("user1", "123");

        if (user1.toString().equals(user2.toString())){

        }
        int inputSelection = 0;
        init();
        System.out.println("------ Welcome to the Bank App! -------");
        do {
            showMenu();
            inputSelection = standardInput.nextInt();
            switch (inputSelection) {
                case 1:
                    System.out.println("Please, enter your username: ");
                    String username = standardInput.next();
                    System.out.println("Please, enter your password: ");
                    String password = standardInput.next();
                    if (manager.authenticateUser(username, password)) {
                        System.out.println("Welcome " + username + "!");
                        // We set the options of the user that is logged in
                        manager.setSelectedOption(
                                manager.getAuthenticatedUser().getOptions()
                        );
                    } else {
                        System.err.println("Invalid username or password!");
                    }
                    break;
                case 2:
                   // TODO: Implement the register method here
                    break;
                case 3:
                    if (manager.getAuthenticatedUser() != null) {
                        manager.showMenu();
                    } else {
                        System.err.println("You must login first!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Bank App!");
                    break;
                default:
                    System.err.println("Invalid option!");
                    break;
            }
        }while (inputSelection != 4);
    }
}