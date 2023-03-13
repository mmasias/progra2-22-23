package main;

import javax.swing.plaf.PanelUI;

public class Texts {

    public static String WELCOME_MSG = "Welcome user, would you like to login or register?";
    public static String[] MAIN_OPTIONS = new String[4];
    public static String LOGIN_USER = "Introduce your Username";
    public static String REGISTER_USER = "Introduce your desired Username";

    // ERROR TEXTS
    public static String ERROR_PASSWORD_BAD = "";
    public static String ERROR_USER_UNAVAILABLE = "UserName unavailable, try again.";

    public static void main(String[] args) {
        MAIN_OPTIONS[0] = "Log-In (0)";
        MAIN_OPTIONS[1] = "Register (1)";
        MAIN_OPTIONS[2] = "Forgot Password (2)";
        MAIN_OPTIONS[3] = "Exit (3)";
    }


    public static void PrintHeader(String headerText){
        System.out.println("######################################################");
        System.out.println(headerText);
        System.out.println("######################################################");
    }
    public static void PrintOptions(String[] options){
        for (String s : options) {
            System.out.println(s);
        }
        System.out.println("######################################################");
    }




}
