package main;

public class Main {


    public static void main(String[] args) {
        String[] options = {"create", "read", "update", "delete"};
        MenuOption option = new MenuOption("Menú para tí");
        RegularUser user = new RegularUser("josue.merino", "abcde", "Josué");
        UserManager userManager = new UserManager();

        option.setItems(options);

        userManager.registerUser(user);
        user.setOptions(option);
        userManager.authenticateUser("josue.merino","abcde");
        userManager.showMenu();
    }

}