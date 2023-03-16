package main;

public class Texts {

    public static String WELCOME_MSG = "Welcome user, would you like to login or register?";
    public static String[] MAIN_OPTIONS = {"Log-In (0)", "Register (1)", "Exit (2)"};
    public static String[] LOGGED_OPTIONS = {"Read Posts (0)", "Write Post (1)", "Change Password (2)" , "Log-Out (3)"};


    public static String LOGIN_USER = "Introduce your Username";
    public static String LOGIN_BADUSER = "User does not exist";
    public static String LOGIN_PASSWORD = "Introduce your Password";
    public static String LOGIN_CORRECTPASSWORD = "Password correct";
    public static String LOGIN_SUCCEED = "User logged successfully";

    public static String LOGIN_BADPASS = "Incorrect password";

    public static String LOGIN_WELCOME(User user){return "Welcome " + user.getUserName();}

    public static String REGISTER_USER = "Introduce your desired Username";
    public static String REGISTER_PASSWORD = "Introduce your desired password";

    public static String REGISTER_SUCCEED = "User registered successfully";




    public static String NEW_POST = "Write your post!";


    // ERROR TEXTS
    public static String ERROR_PASSWORD_BAD = "";
    public static String ERROR_USER_UNAVAILABLE = "UserName unavailable, try again.";



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


    public static void PrintPosts(User user){
        System.out.println("######################################################");
        System.out.println(user.getUserName() + " POSTS");
        System.out.println("######################################################");
        for (String post : user.posts) {
            System.out.println("");
            System.out.println(post);
            System.out.println("");
        }
        System.out.println("######################################################");
        System.out.println("");
    }




}