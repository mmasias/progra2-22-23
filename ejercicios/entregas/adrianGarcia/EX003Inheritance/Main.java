import java.util.Scanner;
public class Main {
    private static UserManager manager = new UserManager();
    private static Option authOptions = new Option(new String[] { "LogIn", "CreateAccount", "Exit" });
    private static Option mainOptions = new Option(
            new String[] { "FirstOption", "SecondOption", "ModifyAccount", "LogOut" });
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        manager.addUser(new RegularUser("1User", "1Password", "1 User"));
        manager.addUser(new RegularUser("2User", "2Password", "2 User"));
        manager.addUser(new Admin("admin", "adminPassword", "adminUser", true));
        boolean isLoggedIn = false;
        boolean appRunning = true;
        while (appRunning) {
            String username = "";
            String password = "";
            String newPassword = "";
            if (!isLoggedIn) { 
                authOptions.display();
                switch (authOptions.read()) {
                    case 1: 
                        System.out.print("Username: ");
                        username = scanner.nextLine();
                        System.out.print("Password: ");
                        password = scanner.nextLine();
                        isLoggedIn = manager.authenticateUser(username, password);
                        if (!isLoggedIn) { 
                            System.out.println("Failed");                       }
                        break;
                    case 2: 
                        System.out.print("Username: ");
                        username = scanner.nextLine();
                        System.out.print("Password: ");
                        password = scanner.nextLine();
                        manager.registerUser(new RegularUser(username, password, "NewUser"));
                        break;
                    case 3: 
                        return;
                    default:
                        System.out.println("Failed");
                        break;               }
            } else { 
                mainOptions.display();
                switch (mainOptions.read()) {
                    case 1: 
                        System.out.println("1Option");
                        break;
                    case 2: 
                        System.out.println("2Option");
                        break;
                    case 3:
                        System.out.print("Username: ");
                        username = scanner.nextLine();
                        System.out.print("OldPassword: ");
                        password = scanner.nextLine();
                        System.out.print("NewPassword: ");
                        newPassword = scanner.nextLine();
                        manager.modifyAccount(username, password, newPassword);
                        break;
                    case 4:
                        isLoggedIn = false;
                        break;
                    default:
                        System.out.println("Failed");
                        break;               }            }        }
        scanner.close();
        authOptions.closeScanner();
        mainOptions.closeScanner();    }}