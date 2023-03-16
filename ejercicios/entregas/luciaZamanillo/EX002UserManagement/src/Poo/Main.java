package Poo;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static void main (String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner pwd = new Scanner(System.in);

        Manager mainManager = new Manager();
        Option options = new Option();

        options.addOptions();

        System.out.println("Welcome! In order to access your account, you need to login first. ");
        System.out.println("Enter your user name please: ");
        String username = name.nextLine();

        System.out.println("Enter your password please: ");
        String password = pwd.nextLine();

        User userLogin = new User(password, username);
        mainManager.addUser(userLogin);
        if (mainManager.userValidation(userLogin) == true) {
            userLogin.setLogin(true);
            System.out.println("Welcome " + userLogin.getUserName());
            System.out.println("Here is your list of options: " + Arrays.toString(options.getOptionList()));

            System.out.println("Do you want to add a new option? (answer with YES / NO) ");
            Scanner scanAnswer = new Scanner(System.in);
            String answer = scanAnswer.nextLine();
            if (answer.equals("YES")) {
                System.out.println ("Enter the option you want to add: ");
                Scanner scanNewOption = new Scanner(System.in);
                String newOption = scanNewOption.nextLine();
                options.addOption(newOption);
                System.out.println("Option added successfully");
            }

        }
        else {
            System.out.println("Error, you need to be signed in first....");

        }





    }
}
