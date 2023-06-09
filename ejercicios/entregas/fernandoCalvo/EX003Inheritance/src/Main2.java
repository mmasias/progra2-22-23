import java.util.Scanner;

public class Main2 {

    static String name;
    static String login;
    static String password;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Manager manager = new Manager();

        createUser();

        Admin admin1 = new Admin(name,login,password);

        manager.addUser(admin1);

        createUser();

        RegularUser regUser1 = new RegularUser(name,login,password);

        manager.addUser(regUser1);

        login();

        manager.authenticateUser(login,password);

    }
    static void createUser(){

        System.out.println("\nCreate User");
        System.out.println("------------");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Login: ");
        login = sc.nextLine();
        System.out.print("Password: ");
        password = sc.nextLine();

    }

    static void login(){


        System.out.println("\n--- WEB PORTAL ---");
        System.out.print("Login: ");
        login = sc.next();
        System.out.print("Password: ");
        password = sc.next();

    }


}