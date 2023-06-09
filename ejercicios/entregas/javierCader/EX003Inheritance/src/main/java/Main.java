import Core.Login.LoginService;
import Core.Manager.Manager;
import Core.Users.User;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        User loggedInUser;

        while (true) {
            System.out.println("Input username:");
            String username = scanner.nextLine();

            if (loginService.isValidUserName(username)) {
                System.out.println("Input password:");
                String password = scanner.nextLine();

                if (loginService.isValidPassword(username, password)) {
                    loggedInUser = loginService.login(username);
                    startManager(loggedInUser);
                } else {
                    System.out.println("Invalid password!");
                }
            } else {
                System.out.println("Invalid username!");
            }
        }
    }

    private static void startManager(User loggedInUser) {
        Manager manager = new Manager(loggedInUser);
        manager.start();
    }
}