package main;

import org.w3c.dom.Text;

public class UsersDataBase {

    public static User[] users;
    public static void AddUser(String username, String password){
        Expand(users, new User(username, password));
    }



    // FIND TOOLS
    public static Boolean AvailableUserName(String userName){
        if (userName != "" && userName != " "){
            for (User user:users) {
                if (user.getUserName() == userName){
                    return true;
                }
            }
        }
        Texts.PrintHeader(Texts.ERROR_USER_UNAVAILABLE);
        return false;
    }
    public static Boolean FormatedPassword(String password){
        switch (password){
            case "":
                return false;
            default:
                return true;
        }
    }
    public static User FindUser(String userName){
        for (User user:users) {
            if (user.getUserName() == userName){
                return user;
            }
        }
        return null;
    }



    // ARRAY TOOLS
    public static void Expand(User[] toExpand) {
        int newLength = toExpand.length + 1;
        User[] expanded = new User[newLength];
        expanded = FillArray(expanded, toExpand);
    }
    public static void Expand(User[] toExpand, User toAdd) {
        int newLength = toExpand.length + 1;
        User[] expanded = new User[newLength];
        expanded = FillArray(expanded, toExpand);
        expanded[newLength - 1] = toAdd;
    }
    public static User[] FillArray(User[] toFill, User[] content) {
        for (int i = 0; i < content.length; i++) {
            toFill[i] = content[i];
        }
        return toFill;
    }

}
