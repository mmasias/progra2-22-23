import java.util.Scanner;
public class Main {
    private static UserManager manager = new UserManager();
    private static Option authOptions = new Option(new String[] { "Log in", "Exit", "Create Account"});
    private static Option mainOptions = new Option(new String[] { "First Option", "Second Option", "Log out", "Modify Account" });
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        manager.addUser("firstUser", "firstPassword");
        manager.addUser("secondUser", "secondPassword");
        boolean isLoggedIn = false;
        boolean appRunning = true;

        while (appRunning) {
            String username = "";
            String password = "";
            String newPassword = "";

            if (!isLoggedIn) {
                authOptions.display();
                switch(authOptions.read()){
                    case 1:
                        System.out.print("Put your username: ");
                        username = scanner.nextLine();
                        System.out.print("Put your password: ");
                        password = scanner.nextLine();
                        isLoggedIn = manager.authenticate(username, password);
                        if (!isLoggedIn) { 
                            System.out.println("Wrong");                      }
                        break;
                    case 2: 
                        System.out.print("Put your username: ");
                        username = scanner.nextLine();
                        System.out.print("Put your password: ");
                        password = scanner.nextLine();
                        manager.createAccount(username, password);
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Wrong");
                        break;               }
            } else {
                mainOptions.display();
                switch(mainOptions.read()){
                    case 1:
                        System.out.println("Option 1");
                        break;
                    case 2:
                        System.out.println("Option 2");
                        break;
                    case 3:
                        System.out.print("Put your sername: ");
                        username = scanner.nextLine();
                        System.out.print("Put your old password: ");
                        password = scanner.nextLine();
                        System.out.print("Put your new password: ");
                        newPassword = scanner.nextLine();
                        manager.modifyAccount(username, password, newPassword);
                        break;
                    case 4:
                        isLoggedIn = false;
                        break;
                    default:
                        System.out.println("Wrong");
                        break;               }          }      }
        scanner.close();
        authOptions.closeScanner();
        mainOptions.closeScanner();
    }}