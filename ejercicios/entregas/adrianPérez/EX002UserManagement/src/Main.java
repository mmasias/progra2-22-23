import mypackage.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Options options = new Options();
        Manager manager = new Manager();
        User user = new User("UNDEFINED", "UNDEFINED");

        boolean continueApp = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the best (useless) app ever!");

        while (continueApp) {
            while (manager.getIsLogged() == false && continueApp) {
                System.out.println("Do you want to log in or register?\n1. Log in\n2. Register\n3. Exit");
                int selectedOption = sc.nextInt();
                switch (selectedOption) {
                    case 1:
                        System.out.println("Enter username: ");
                        String username = sc.next();
                        System.out.println("Enter password: ");
                        String password = sc.next();
                        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
                            System.out.println("Logging successful!\nREDIRECTING...");
                            manager.setIsLogged(true);
                        }
                        else {
                            System.out.println("Wrong username or password!");
                        }
                        break;
                    case 2:
                        System.out.println("Enter username: ");
                        username = sc.next();
                        System.out.println("Enter password: ");
                        password = sc.next();
                        user.setUsername(username);
                        user.setPassword(password);
                        System.out.println("Registration successful!");
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        continueApp = false;
                        break;
                }
            }
    
            
            while (options.getIsLogged() == true && continueApp) {
                System.out.println("What do you want to do?\n1. Echo message\n2. Log out");
                int selectedOption = sc.nextInt();
    
                switch(selectedOption) {
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
