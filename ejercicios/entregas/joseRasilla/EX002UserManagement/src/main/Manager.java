package main;

public class Manager {
    public static void main(String[] args) {
        Texts.PrintHeader(Texts.WELCOME_MSG);
        SelectMenuOpt();
    }

    // Selects the option in the main menu
    public static void SelectMenuOpt(){
        Texts.PrintOptions(Texts.MAIN_OPTIONS);
        switch (Utilities.InputInt()){
            case 0:
                LogIn();
                break;
            case 1:
                Register();
                break;
            case 2:
                break;
        }
    }

    // The program first asks the username to the user, checks if it exists, if so it asks for the password, if its correct it access the menu
    public static void LogIn(){
        Texts.PrintHeader(Texts.LOGIN_USER);
        String tryUserName = Utilities.InputS();

        if (UsersDataBase.UserExists(tryUserName)){
            User tryUser = UsersDataBase.FindUser(tryUserName);
            Texts.PrintHeader(Texts.LOGIN_PASSWORD);
            String tryUserPassword = Utilities.InputS();
            if (tryUser.CheckPassword(tryUserPassword)){
                Texts.PrintHeader(Texts.LOGIN_SUCCEED);
                UsersDataBase.setLoggedUser(tryUser);
                LoggedMenu();
            } else {
                SelectMenuOpt();
            }

        } else {
            Texts.PrintHeader(Texts.LOGIN_BADUSER);
            SelectMenuOpt();
        }
    }

    // Within a loop of verifications the program asks the user their desired username and password, then adds the new user to the database and returns to the main menu
    public static void Register(){
        Texts.PrintHeader(Texts.REGISTER_USER);
        String newUserName;
        do {
            newUserName = Utilities.InputS();
        }
        while (!UsersDataBase.AvailableUserName(newUserName));
        Texts.PrintHeader(Texts.REGISTER_PASSWORD);
        String newPassword;
        do {
            newPassword = Utilities.InputS();
        }
        while (!UsersDataBase.FormattedPassword(newPassword));

        UsersDataBase.AddUser(newUserName, newPassword);
        SelectMenuOpt();
    }



    // Opens page menu when logged
    public static void LoggedMenu(){
        Texts.PrintHeader(Texts.LOGIN_WELCOME(UsersDataBase.loggedUser));
        SelectLoggedOpt();
    }
    // Selects the option int the logged menu
    public static void SelectLoggedOpt(){
        Texts.PrintOptions(Texts.LOGGED_OPTIONS);
        switch (Utilities.InputInt()){
            case 0:
                Texts.PrintPosts(UsersDataBase.loggedUser);
                SelectLoggedOpt();
                break;
            case 1:
                Texts.PrintHeader(Texts.NEW_POST);
                UsersDataBase.loggedUser.AddPublication(Utilities.InputS());
                SelectLoggedOpt();
                break;
            case 2:
                ChangePassword();
                SelectLoggedOpt();
                break;
            case 3:
                SelectMenuOpt();
                break;
        }
    }

    // Asks the current password, checks if it's correct, then asks for the new and changes the password to it
    public static void ChangePassword(){
        User user = UsersDataBase.loggedUser;
        Texts.PrintHeader(Texts.LOGIN_PASSWORD);
        String tryUserPassword = Utilities.InputS();
        if (user.CheckPassword(tryUserPassword)){
            String newPassword;
            do {
                newPassword = Utilities.InputS();
            }
            while (!UsersDataBase.FormattedPassword(newPassword));
            UsersDataBase.loggedUser.ChangePassword(newPassword);
        } else {
            Texts.PrintHeader(Texts.LOGIN_BADPASS);
            SelectLoggedOpt();
        }
    }

}