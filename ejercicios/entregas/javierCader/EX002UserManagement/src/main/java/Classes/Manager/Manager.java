package Classes.Manager;
import Utils.Interfaces.MenuItem;
import Classes.Users.User;

import java.util.Scanner;

public class Manager {
    public static User currentUser;
    private final Scanner scanner = new Scanner(System.in);

    public Manager(User loggedUser) {
        Manager.currentUser = loggedUser;
        while(currentUser.isLogin()) {
            displayOptions();
        }
    }

    public void displayOptions() {
        int selectedOption;
        MenuItem[] optionsMenu = currentUser.getOptions();

        if (optionsMenu == null) {
            throw new IllegalStateException("Invalid Options");
        }

        while (currentUser.isLogin()) {
            System.out.println("*".repeat(30));
            int index = 1;
            for (MenuItem option: optionsMenu) {
                System.out.printf("%d. %s %n", index, option.getText());
                index++;
            }
            System.out.println("Input the action you want to execute:");
            selectedOption = scanner.nextInt();
            if (selectedOption < 1 || selectedOption > optionsMenu.length) {
                System.out.println("Invalid choice.");
            } else {
                optionsMenu[selectedOption -1].execute();
            }
        }
    }
}
