package Main;

import java.util.Scanner;


public class Manager {
    public static void main(String[] args) {
        System.out.println("How many users do you want to create?");

        int maxUsers = maxUsers();

        User[] users = new User[maxUsers];
        boolean auth = false;
        String[] options = { "1. Logout", "2. View Main.Options", "3. View Users", "4. Add Main.User" };

        signUp(users, maxUsers);
        auth = signIn(users, auth);

        if(auth) {
            showOptions(options);
        }
    }

    private static String scannerString() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        return string;
    }

    private static int maxUsers() {
        Scanner scanner = new Scanner(System.in);
        int maxUsers = scanner.nextInt();
        return maxUsers;
    }

    public static void signUp(User[] users, int maxUsers) {
        for (int i = 0; i < maxUsers; i++) {
            System.out.println("Enter the user name:");
            String userName = scannerString();
            System.out.println("Enter the password:");
            String pwd = scannerString();
            User user = new User(userName, pwd);
            addUsers(user, users, maxUsers);
        }
    }

    public static Boolean signIn(User[] users, boolean auth) {
        System.out.println("Enter the user name:");
        String userName = scannerString();
        System.out.println("Enter the password:");
        String pwd = scannerString();

        return auth(userName, pwd, users, auth);
    }

    public static boolean auth(String user, String pwd, User[] users, boolean auth) {
        int aux = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getUserName().equals(user) && users[i].getPassword().equals(pwd)) {
                    System.out.println("Welcome " + users[i].getUserName());
                    users[i].setLogin(true);
                    auth = true;
                    return auth;
                }
            }
        }
        if (!users[aux].getUserName().equals(user) && !users[aux].getPassword().equals(pwd)) {
            System.out.println("Main.User or password incorrect");
            signIn(users, auth);
        }
        return auth;
    }

    public static void addUsers(User user, User[] users, int maxUsers) {
        if (maxUsers <= 10 ) {
            for (int i = 0; i < maxUsers; i++) {
                if (users[i] == null) {
                    users[i] = user;
                    break;
                }
            }
        } else {
            System.out.println("You can't create more than 10 users");
        }
    }

    public static void showOptions(String[] options) {
        for (int i = 0; i < options.length; i++) {
            if (options[i] != null) {
                System.out.println(options[i]);
            }
        }
    }
}
