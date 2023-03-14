package main;

import java.util.Scanner;
public class Manager {


    public static void main(String[] args) {
        System.out.println("How many users do you want to create? ");
        int maxNumberOfUsers = scannerInt();

        User[] userList = new User[maxNumberOfUsers];
        boolean authenticated = false;
        Option optionList = new Option (new String[] {"Change password", "Change user", "Show users"});

        signUp(maxNumberOfUsers, userList);

        logIn(userList, authenticated, optionList);



    }

    public static String scannerString(){   //reed the input from the user
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    public static int scannerInt(){  //reed the input from the user
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void addUser(User user, int maxNumberOfUsers, User[] userList) {  //add the user to the user list
        if(maxNumberOfUsers <= 10) {
            for (int i = 0; i < maxNumberOfUsers; i++) {
                if (userList[i] == null) {
                    userList[i] = user;
                    break;
                }
            }
        }
    }

    public static void signUp(int maxNumberOfUsers, User[] userList){   //create the users with a name and a password
        for (int i = 0; i < maxNumberOfUsers; i++) {
            System.out.println("SIGN UP");

            System.out.print("User name: ");
            String userName = scannerString();

            System.out.print("Password: ");
            String userPassword = scannerString();

            User user = new User(userName, userPassword);
            addUser(user, maxNumberOfUsers, userList);
        }
    }

    public static Boolean signIn(User[] userList, boolean authenticated ){  //introduce the username and the password to the authentication method
        System.out.println("SIGN IN");
        System.out.print("User name: ");
        String userName = scannerString();
        System.out.print("Password: ");
        String userPassword = scannerString();
        System.out.println("\n");


        return authentication(userName, userPassword, userList, authenticated);
    }

    public static boolean authentication(String userName, String userPassword, User[] userList, boolean authenticated){ //check if the username and the password are correct
        for (int i = 0; i < userList.length; i++) {
            if (userList[i] != null) {
                if (userList[i].getUserName().equals(userName) && userList[i].getUserPassword().equals(userPassword)) {
                    System.out.println("Welcome " + userList[i].getUserName() + "\n");
                    authenticated = true;
                    userList[i].setLogin(true);
                    break;
                }

            }

        }

        return authenticated;
    }

    public static void logIn(User[] userList, boolean authenticated, Option optionList){    //check if the user is authenticated
        if(signIn(userList, authenticated)){
            optionList.showOptions();
            optionChoose(optionList, userList);

        }else{
            System.out.println("Wrong password or user name try again \n" );
        }
    }

    public static void optionChoose(Option optionList, User[] userList){  //choose the option and execute it
        System.out.print("\n Choose an option: ");
        switch (scannerInt()){

            case 1:
                System.out.println("\n Change password");
                System.out.println("----------------");
                optionList.changePassword(userList);
                break;
            case 2:
                System.out.println("\n Change user");
                System.out.println("----------------");
                optionList.changeUser(userList, false, optionList);
                break;
            case 3:
                System.out.println("\n Show users");
                System.out.println("----------------");
                optionList.showUsers(userList);
                break;
            default:
                System.out.println("Wrong option");
                System.out.println("----------------");
                break;
        }

    }

}
