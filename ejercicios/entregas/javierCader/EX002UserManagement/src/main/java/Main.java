import Classes.Login.Login;
import Classes.Manager.Manager;
import Classes.Users.User;

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
            if (Login.validateUserName(username)) {
                password = scanner.nextLine();
                if (Login.validatePassword(username, password)) {
                    Login.login(username);
                    loggedInUser = Login.getLoggedUser();
                    new Manager(loggedInUser);
                } else {
                    System.out.println("Invalid password!");
                }
            } else {
                System.out.println("Invalid username!");
            }
        }
    }
}
