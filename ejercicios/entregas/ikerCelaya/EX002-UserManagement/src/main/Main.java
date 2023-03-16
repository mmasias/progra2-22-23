package main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Option options = new Option();
        Manager manager = new Manager();
        User user = new User("UNDEFINED", "UNDEFINED");

        boolean isConnected = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to ikerCelaya´s portal!");

        while (isConnected) {
            while (manager.getIsLogged() == false && isConnected) {
                System.out.println("Choose an option:\n1. Log in\n2. Register\n3. Exit");
                int currentOption = sc.nextInt();
                switch (currentOption) {
                    case 1 -> {
                        System.out.println("Enter username: ");
                        String username = sc.next();
                        System.out.println("Enter password: ");
                        String password = sc.next();
                        if (username.equals(user.getName()) && password.equals(user.getPassword())) {
                            System.out.println("Logging successful!");
                            manager.setIsLogged(true);
                        } else {
                            System.out.println("Try again, please");
                        }
                    }
                    case 2 -> {
                        System.out.println("Enter username: ");
                        user.name = sc.next();
                        System.out.println("Enter password: ");
                        user.password = sc.next();
                        user.setName(user.name);
                        user.setPassword(user.password);
                        System.out.println("Registration successful!");
                    }
                    case 3 -> {
                        System.out.println("Exiting...");
                        isConnected = false;
                    }
                }
            }


            while (options.getIsLogged() == true && isConnected) {
                System.out.println("What do you want to do?\n1. Echo message\n2. Log out");
                int currentOption = sc.nextInt();

                switch(currentOption) {
                    case 1:
                        System.out.println("Enter message:");
                        String message = sc.next();
                        options.echoMessage(message);
                        break;
                    case 2:
                        options.setIsLogged(false);
                        break;
                }
            }
        }
    }
}