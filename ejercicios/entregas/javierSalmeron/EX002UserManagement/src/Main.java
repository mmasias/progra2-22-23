import java.util.Scanner;

public class Main {

    private static UserManager manager = new UserManager();
    private static Option authOptions = new Option(new String[] { "Log in", "Create Account", "Exit" });
    private static Option mainOptions = new Option(new String[] { "Option 1", "Option 2", "Modify Account", "Log out" });
    
    public static void main(String[] args) {
        Scanner scanner;
        
        scanner = new Scanner(System.in);

        manager.addUser("usr1", "pwd1");
        manager.addUser("usr2", "pwd2");

        boolean isLoggedIn = false;
        boolean appRunning = true;

        while (appRunning) {
            String username = "";
            String password = "";
            String newPassword = "";

            if (!isLoggedIn) { // Auth Options
                authOptions.display();

                switch(authOptions.read()){
                    case 1: // Login
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        password = scanner.nextLine();

                        isLoggedIn = manager.authenticate(username, password);
                        if (!isLoggedIn) { // Failed Auth
                            System.out.println("Authentication failed!");
                        }
                        break;

                    case 2: // Logon
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        password = scanner.nextLine();

                        manager.createAccount(username, password);
                        break;
                    
                    case 3: // Exit
                        return;

                    default:
                        System.out.println("Invalid option.");
                        break;

                }
                
            } else { // Main Options
                mainOptions.display();

                switch(mainOptions.read()){
                    case 1: // Option 1
                        System.out.println("You've selected the option 1");
                        break;

                    case 2: // Option 2
                        System.out.println("You've selected the option 2");
                        break;

                    case 3: // Modify account
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter old password: ");
                        password = scanner.nextLine();
                        System.out.print("Enter new password: ");
                        newPassword = scanner.nextLine();

                        manager.modifyAccount(username, password, newPassword);
                        break;

                    case 4: // Logout
                        isLoggedIn = false;
                        break;

                    default:
                        System.out.println("Invalid option.");
                        break;

                }

            }

        }

        scanner.close();
        authOptions.closeScanner();
        mainOptions.closeScanner();
        
    }
    
}
