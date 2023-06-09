package main;

import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Option options = new Option();
        Manager manager = new Manager();
        User user = new User("admin", "admin");
        System.out.println("Welcome to the program");
        System.out.println("Please login");
        System.out.println("Username: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.println("Password: ");
        String userPassword = scanner.nextLine();
        options.setUser(user);
        if(userName.equals(user.getUserName()) && userPassword.equals(user.getUserPassword())){
            System.out.println("Login successful");
            System.out.println("Welcome " + user.getUserName());
            options.showOptions();
            options.selectedOption();
        } else {
            System.out.println("Login failed");
            System.out.println("You want to create a new account? (y/n)");
            Scanner scanner1 = new Scanner(System.in);
            String answer = scanner1.nextLine();
            if(answer.equals("y")){
                manager.addUser();
                System.out.println("Account created");
                System.out.println("You want to login? (y/n)");
                Scanner scanner2 = new Scanner(System.in);
                String answer2 = scanner2.nextLine();
                if(answer2.equals("y")){
                    manager.logIn();
                    options.showOptions();
                    options.selectedOption();
                } else {
                    System.out.println("Goodbye");
                }
            } else {
                System.out.println("Goodbye");
            }

        }



    }

    }
