package src.main;

import java.util.Scanner;

public class Manager {

    private int maxUsers;
    private User[] users;
    private String inputUser;
    private String inputPassword;

    User firstUser = new User("Jorge", "Jorge85015", "12345");
    User secondUser = new User("Tomi", "TMar1023", "100223");
    User thirdUser = new User("Pulpin", "Pulp10", "09876");

    public void setUsers() {
        this.users[0] = firstUser;
        this.users[1] = secondUser;
        this.users[2] = thirdUser;
    }

    Scanner scanner = new Scanner(System.in);

    public void login() {
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        this.inputUser = username;
        System.out.print("Insert your password: ");
        String password = scanner.nextLine();
        this.inputPassword = password;
    }

    public void validate() {
        for (int i = 0; i < this.maxUsers; i++) {
            if (this.users[i].getUser().equals(this.inputUser)
                    && this.users[i].getPassword().equals(this.inputPassword)) {
                this.users[i].setLogin(true);
                System.out.println("Login successful");
            } else {
                System.out.println("Login failed");
                break;
            }
        }
    }

    public void printMenu() {
        System.out.println("1. Show profile");
        System.out.println("2. Edit profile");
        System.out.println("3. Change password");
        System.out.println("4. Change username");
        System.out.println("5. Logout");
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.login();
        manager.validate();
        manager.printMenu();
    }
}
