import java.util.Scanner;

public class Option {

    private String username;
    private String password;
    private String passwordConfirm;
    boolean exit = false;
    Manager data = new Manager(5);
    Scanner entry = new Scanner(System.in);


public Option() {

}

public void menuPrimary() {
    System.out.println("Welcome to the System!");

    do {

        System.out.println("#".repeat(24) + "\n- [R] Register\n- [L] Login\n- [E] Exit\n" + "#".repeat(24));
        String response = entry.nextLine().toLowerCase();
        if (response.equals("e")) {
            exit = true;
        } else {
            selectedOption(response);
        }

    } while (!exit);
}

public void menuLogged(User user) {
    System.out.println("Welcome " + user.getUserName() + "!");
    do {
        System.out.println("#".repeat(24) + "\n- [U] Change Username\n- [P] Change Password");
        if (user.getUserType().equals("admin")) {
            System.out.println("- [L] List All users\n- [C] Change Capacity");
        }
        System.out.println("- [E] Log Out\n" + "#".repeat(24));
        String response = entry.nextLine().toLowerCase();
            selectedOptionLogged(response, user);
    } while (!exit);
}

public void selectedOption(String option) {
    switch (option) {
        case "r" -> registerOption();
        case "l" -> loginOption();
        default -> System.out.println("Invalid option!");
    }
}

public void selectedOptionLogged(String option, User user) {

    boolean isAdmin = user.getUserType().equals("admin");
    String text = (isAdmin)
            ? ""
            : "Invalid option!";

    switch (option) {
        case "u" -> changeUserOption(user);
        case "e" -> logOutOption(user);
        case "p" -> changePassOption(user);
        default -> System.out.println(text);
    }

    if (isAdmin) {
        switch (option) {
            case "l" -> listAllUsers();
            case "c" -> changeCapacityOption();
            default -> System.out.println("Invalid option!");
        }
    }

}

public void listAllUsers() {
System.out.println("User list:\n" + data.usersAll());
}

public void changeCapacityOption() {
    System.out.println("Enter the new capacity:");
    data.setCapacity(entry.nextInt());
}

public void logOutOption(User user) {
    user.setLogin(false);
    System.out.println("Goodbye " + user.getUserName() + "!");
    menuPrimary();
}

public void changeUserOption(User user) {

    boolean ifCan;

    do {
        System.out.println("Enter the new username:");
        username = entry.nextLine();
        if (username.isBlank()) System.out.println("Please enter a user!");
        if (!(data.canChangeUser(user, username))) {
            System.out.println("Please, enter other username!");
            ifCan = false;
        } else {
            ifCan = true;
        }
    } while (!ifCan);

    System.out.println("Username changed successfully!");
    menuLogged(user);
}

public void changePassOption(User user) {

    boolean doubleCheck = true;

    do {
        System.out.println("Enter the new password:");
        password = entry.nextLine();
        if (password.isBlank()) {
            System.out.println("Please enter a password!");
        } else if (user.getUserPassword().equals(password)) {
            System.out.println("The password cannot be the same as old one!");
        } else {
            System.out.println("Repeat the password to confirm!");
            passwordConfirm = entry.nextLine();
            if (!(password.equals(passwordConfirm))) {
                System.out.println("Error! Different password, please re-type!");
            } else {
                doubleCheck = false;
            }
        }

    } while (doubleCheck);

    user.setUserPassword(password);
    System.out.println("Password changed successfully!");
    menuLogged(user);
}

public void loginOption() {
    boolean itsBad;

        System.out.println("Username:");
        username = entry.nextLine();
        System.out.println("Password:");
        password = entry.nextLine();
        itsBad = data.authUser(username, password);

        if (itsBad) {
            System.out.println("Bad username or password! Please re-check!");
        } else {
            itsBad = !(data.getUsers(data.getUserPosition(username)).getLogin());
            if (itsBad) {
                System.out.println("You're logged successfully!");
                menuLogged(data.getUsers(data.getUserPosition(username)));
            }
        }
}

public void registerOption() {
    checkEnteredUser();

    do {
        System.out.println("Now type a password!");
        password = entry.nextLine();
        System.out.println("Repeat the password to confirm!");
        passwordConfirm = entry.nextLine();
    } while (checkEnteredPass(password, passwordConfirm));

    User register = new User(username, password);
    data.createUser(register, "default");

}

public void createAdminUser(String user, String pass) {
    User admin = new User(user, pass);
    data.createUser(admin, "admin");
}

public void checkEnteredUser() {
    boolean checkEntryUser;
    do {
        username = "";
        System.out.println("Insert desired username:");
        username = entry.nextLine();
        checkEntryUser = username.isBlank() || data.checkUser(username);
        if (username.isBlank()) System.out.println("[❌] Username cannot be empty! [❌]");
        if (data.checkUser(username)) System.out.println("[❌] This username exists! Choose another username! [❌]");
    } while (checkEntryUser);
}

public boolean checkEnteredPass(String password, String passwordConfirm) {

        boolean checkEntryPass = password.isBlank() || !(password.equals(passwordConfirm));
        if (password.isBlank()) System.out.println("[❌] Password cannot be empty! [❌]");
        if (!(password.equals(passwordConfirm))) System.out.println("[❌] Error! Different password, please re-type! [❌]");
        return checkEntryPass;
}

}
