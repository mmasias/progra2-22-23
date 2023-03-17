package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Manager manager = new Manager(10);
        Option options = new Option(3);

        System.out.print("Enter username: ");
        String userName = scanner.nextLine();

        System.out.print("Enter password: ");
        String userPassword = scanner.nextLine();

        User user = manager.login(userName, userPassword);
        if (user != null) {
            System.out.println("Welcome " + user.getName());
        } else {
            System.out.println("Invalid credentials");
        }

        options.displayMenu();
        int choice = options.handleMenuChoice();

        switch (choice) {
            case 1:
                System.out.print("Enter username: ");
                String name = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                manager.addUser(name, password);
                break;
            case 2:
                manager.printUsers();
                break;
            case 3:
                System.out.print("Enter username: ");
                String username = scanner.nextLine();
                manager.deleteUser(username);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
