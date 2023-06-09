package main;

import main.ui.ManagementSystem;

public class Main {

    static ManagementSystem managementSystem;
    public static void init() {
        System.out.println("Initializing system...");
        managementSystem = new ManagementSystem();

    }

    public static void printMainMenu() {
        System.out.println("----------------------------------");
        System.out.println("- System Login                   -");
        System.out.println("----------------------------------");

        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
    }

    public static void main(String[] args) {
        init();

        int option;

        // main.Main menu
        do {
            printMainMenu();
            option = managementSystem.askForOption();

            switch (option) {
                case 1:
                    System.out.println("Login");
                    break;
                case 2:
                    System.out.println("Register");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }


        }while (option != 3);
    }

}
