package main;

import java.util.Scanner;
public class Manager {

    public static void main(String[] args) {
        System.out.println("How many users do you want to create? ");
        int maxUsers = scannerData();

        User[] usersList = new User[maxUsers];
        Option optionList = new Option (new String[] {"Change password", "Change user", "Show users"});

        register(maxUsers, usersList);

        signIn(usersList, optionList);

    }

    public static String scannerText(){ //read de text from the user
        Scanner scanner= new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    public static int scannerData(){ //read de data from the user
        Scanner scanner= new Scanner(System.in);
        int data = scanner.nextInt();
        return data;
    }

    public static void addUsers(User user, int maxUsers,User[] usersList){ //add the users to the list
        if(maxUsers<=10){
            for (int i = 0; i < maxUsers; i++) {
                if (usersList[i] == null) {
                    usersList[i] = user;
                    break;
                }
            }
        }
    }

    public static void register(int maxUsers,User[] usersList){ //insert users and passwords
        for (int i = 0; i < maxUsers; i++){
            System.out.println("REGISTER");

            System.out.print("Name user: ");
            String name = scannerText();

            System.out.print("Password: ");
            String password = scannerText();

            User user=new User(name,password);

            addUsers(user,maxUsers,usersList);
        }
    }

    public static boolean enter(User[] usersList){ //checked in users
        System.out.println("ENTER");
        System.out.print("Name user: ");
        String name = scannerText();
        System.out.print("Password: ");
        String password = scannerText();
        System.out.println(" ");
        return check(name,password,usersList);
    }

    public  static boolean check(String name,String password,User[] usersList){ //checks de name and password are correct
        for (int i = 0; i < usersList.length; i++) {
            if (usersList[i] != null) {
                if (usersList[i].getName().equals(name) && usersList[i].getPassword().equals(password)) {
                    System.out.println("Welcome " + usersList[i].getName() + "\n");
                    usersList[i].setLogin(true);
                    return usersList[i].isLogin();
                }
            }
        }
        return false;
    }

    public  static void signIn(User[] usersList, Option optionList){ //checks if the user is correct
        if(enter(usersList)){
            optionList.displayOption();
            chooseOption(optionList, usersList);

        }else{
            System.out.println("Wrong password or user name try again \n" );
        }
    }
    public static void chooseOption(Option optionList, User[] usersList){  //choose the option
        System.out.print("\n Choose an option: ");
        switch (scannerData()){

            case 1:
                System.out.println(" ");
                System.out.println("Change password");
                System.out.println(" ");
                optionList.changePassword(usersList);
                break;
            case 2:
                System.out.println(" ");
                System.out.println("Change name");
                System.out.println(" ");
                optionList.changeUser(usersList, false, optionList);
                break;
            case 3:
                System.out.println(" ");
                System.out.println("Show users");
                System.out.println(" ");
                optionList.showUsers(usersList);
                break;
            default:
                System.out.println(" ");
                System.out.println("Wrong option");
                System.out.println(" ");
                break;
        }

    }

}

