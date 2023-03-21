package Core.Login;

import Core.Cypher.Enigma;
import DataBase.UserDataBase;
import Core.Users.User;

import java.util.Scanner;

public abstract class Login {
    private static final Scanner scanner = new Scanner(System.in);
    private static User loggedUser;
    public static void login(String username) {
        loggedUser = getValidatedUser(username);
        assert loggedUser != null;
        loggedUser.setLogin(true);
    }

    public static boolean validateUserName(String userName) {
        for (User user : UserDataBase.getUsers()) {
            if (user.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validatePassword(String username, String password) {
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
