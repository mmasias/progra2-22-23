import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Manager manager = new Manager();
        User user = new User("user", "password");
        Option options = new Option();
        System.out.println("Welcome!");
        System.out.println("username and password:");
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
            options.getSelectedOption();
        } else {
            System.out.println("Login failed");

        }
    
    }

}