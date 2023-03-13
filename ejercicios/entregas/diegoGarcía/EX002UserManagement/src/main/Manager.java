package main;
import java.util.Scanner;
public class Manager {


    public static void main(String[] args) {
        System.out.println("How many users do you want to create? ");
        int maxNumberOfUsers = scannerInt();

        User[] userList = new User[maxNumberOfUsers];
        boolean authenticated = false;
        String[] optionList = {"Change password", "Change user", "Exit"};

        signUp(maxNumberOfUsers, userList);
        authenticated = signIn(userList, authenticated);

        if(authenticated){
            showOptions(optionList);
        }



    }

    public static String scannerString(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    public static int scannerInt(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void signUp(int maxNumberOfUsers, User[] userList){
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

    public static Boolean signIn(User[] userList, boolean authenticated){
        System.out.println("SIGN IN");
        System.out.print("User name: ");
        String userName = scannerString();
        System.out.print("Password: ");
        String userPassword = scannerString();



        return authentication(userName, userPassword, userList, authenticated);
    }

    public static boolean authentication(String userName, String userPassword, User[] userList, boolean authenticated){
        int auxUser = 0;
        for (int i = 0; i < userList.length; i++) {
            if (userList[i] != null) {
                if (userList[i].getUserName().equals(userName) && userList[i].getUserPassword().equals(userPassword)) {
                    System.out.println("Welcome " + userList[i].getUserName());
                    authenticated = true;
                    userList[i].setLogin(true);
                    auxUser = i;
                    break;
                }

            }

        }

        if(!userList[auxUser].getUserName().equals(userName) || !userList[auxUser].getUserPassword().equals(userPassword)){
            System.out.println("Wrong password or user name try again \n" );
            signIn(userList, authenticated);
        }

        return authenticated;
    }

    public static void addUser(User user, int maxNumberOfUsers, User[] userList) {
        if(maxNumberOfUsers <= 10) {
            for (int i = 0; i < maxNumberOfUsers; i++) {
                if (userList[i] == null) {
                    userList[i] = user;
                    break;
                }
            }
        }
    }

    public static void showOptions(String[] optionList) {
        for (int i = 0; i < optionList.length; i++) {
            if (optionList[i] != null) {
                System.out.println((i+1) + ". " + optionList[i]);
            }
        }
    }
/**
    public void addOption(String option) {
        for (int i = 0; i < optionList.length; i++) {
            if (optionList[i] == null) {
                optionList[i] = option;
                break;
            }
        }
    }



    public void showUsers() {
        for (int i = 0; i < userList.length; i++) {
            if (userList[i] != null) {
                System.out.println(userList[i].getUserName());
            }
        }
    }
**/


}
