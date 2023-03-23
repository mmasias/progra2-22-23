package Core.Login;

import Core.Cypher.Enigma;
import DataBase.UserDataBase;
import Core.Users.User;

import java.util.Arrays;

public class LoginService {
    public User login(String username) {
        User loggedUser = getValidatedUser(username);
        assert loggedUser != null;
        loggedUser.setLogin(true);
        return loggedUser;
    }

    public boolean isValidUserName(String userName) {
        return Arrays.stream(UserDataBase.getUsers())
                .anyMatch(user -> user.getUsername().equals(userName));
    }

    public boolean isValidPassword(String username, String password) {
        return Arrays.stream(UserDataBase.getUsers())
                .filter(user -> user.getUsername().equals(username))
                .anyMatch(user -> user.getPassword().equals(Enigma.encrypt(password)));
    }

    private User getValidatedUser(String username) {
        return Arrays.stream(UserDataBase.getUsers())
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}