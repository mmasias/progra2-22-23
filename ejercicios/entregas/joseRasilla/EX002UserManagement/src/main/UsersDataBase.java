package main;

import java.util.Objects;

public class UsersDataBase {
    public static User[] users = new User[0];
    public static User loggedUser;

    // Adds a new user to the users database
    public static void AddUser(String username, String password){
        users = Utilities.Expand(users, new User(username, password));
        Texts.PrintHeader(Texts.REGISTER_SUCCEED);
    }

    // Sets the user that is logged
    public static void setLoggedUser(User loggedUser) {
        UsersDataBase.loggedUser = loggedUser;
    }

    // Checks if the username is already in use
    public static Boolean AvailableUserName(String userName){
        if (!Objects.equals(userName, "") && !Objects.equals(userName, " ")){
            for (User user:users) {
                if (Objects.equals(user.getUserName(), userName)){
                    Texts.PrintHeader(Texts.ERROR_USER_UNAVAILABLE);
                    return false;
                }
            }
            return true;
        }
        Texts.PrintHeader(Texts.ERROR_USER_UNAVAILABLE);
        return false;
    }

    // Checks if the password has a correct format
    public static Boolean FormattedPassword(String password){
        switch (password){
            case "":
                return false;
            default:
                return true;
        }
    }

    // Finds the user via its username
    public static User FindUser(String userName){
        for (User user:users) {
            if (Objects.equals(user.getUserName(), userName)){
                return user;
            }
        }
        return null;
    }

    // Checks if the user exists
    public static boolean UserExists(String tryUserName){
        for (User userTested : users){
            if (Objects.equals(userTested.getUserName(), tryUserName)){
                return true;
            }
        }
        return false;
    }
}