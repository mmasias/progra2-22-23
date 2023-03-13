package main;
import java.util.Scanner;

public class Manager {
    public static void main(String[] args) {
        Texts.PrintHeader(Texts.WELCOME_MSG);
        Texts.PrintOptions(Texts.MAIN_OPTIONS);
        SelectMenuOpt();
    }

    public static void SelectMenuOpt(){
        switch (InputInt()){
            case 0:
                LogIn();
                break;
            case 1:
                Register();
                break;
            case 2:
                Forgot();
                break;
            case 3:
                break;
        }
    }

    public static void LogIn(){
        Texts.PrintHeader(Texts.LOGIN_USER);
    }

    public static void Register(){
        Texts.PrintHeader(Texts.REGISTER_USER);
        String newUserName = "";
        do {
            newUserName = InputS();
        }
        while (!UsersDataBase.AvailableUserName(newUserName));
        String newPassword = "";
        do {
            newPassword = InputS();
        }
        while (!UsersDataBase.FormatedPassword(newPassword));

        UsersDataBase.AddUser(newUserName, newPassword);

    }

    public static void Forgot(){

    }



    public static String InputS(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public static int InputInt(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }



}