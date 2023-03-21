import Core.Login.Login;
import Core.Manager.Manager;
import Core.Users.User;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String username;
    static String password;
    static User loggedInUser;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Input username:");
            username = scanner.nextLine();

            if (isValidUserName(username)) {
                System.out.println("Input password:");
                password = scanner.nextLine();

                if (isValidPassword(username, password)) {
                    login(username);
                    loggedInUser = getLoggedUser();
                    startManager(loggedInUser);
                } else {
                    System.out.println("Invalid password!");
                }
            } else {
                System.out.println("Invalid username!");
            }
        }
    }

    private static boolean isValidUserName(String username) {
        return Login.validateUserName(username);
    }

    private static boolean isValidPassword(String username, String password) {
        return Login.validatePassword(username, password);
    }

    private static void login(String username) {
        Login.login(username);
    }

    private static User getLoggedUser() {
        return Login.getLoggedUser();
    }

    private static void startManager(User loggedInUser) {
        Manager manager = new Manager(loggedInUser);
        manager.start();
    }
}
