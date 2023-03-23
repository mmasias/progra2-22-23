package Classes.Login;

import Classes.Cypher.Enigma;
import Classes.DataBase.UserDataBase;
import Classes.Users.User;

import java.util.Scanner;

public abstract class Login {
    private static final Scanner scanner = new Scanner(System.in);
    private static User loggedUser;
    public static void login() {
        while (true) {
            System.out.println("Input username:");
            String userName = scanner.nextLine();
            boolean usernameValidation = validateUserName(userName);

            if (usernameValidation) {
                System.out.println("Input password:");
                String password = scanner.nextLine();
                boolean passwordValidation = validatePassword(userName, password);
                if (passwordValidation) {
                    loggedUser = getValidatedUser(userName);
                    assert loggedUser != null;
                    loggedUser.setLogin(true);
                    return;
                } else {
                    System.out.println("Invalid password");
                }
            } else {
                System.out.println("Invalid username");
            }
        }
    }

    private static boolean validateUserName(String userName) {
        for (User user : UserDataBase.getUsers()) {
            if (user.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    private static boolean validatePassword(String username, String password) {
        for (User user: UserDataBase.getUsers()) {
            if (user.getUsername().equals(username)) {
                if ((user.getPassword()).equals(Enigma.encrypt(password))) {
                    return true;
                }
            }
        }
        return false;
    }

    private static User getValidatedUser(String userName) {
        for (User user: UserDataBase.getUsers()) {
            if (userName.equals(user.getUsername())) {
                return  user;
            }
        }
        return null;
    }

    public static User getLoggedUser() {
        return loggedUser;
    }
}
