package Classes.Manager;

import Utils.Functions.InputReader;
import Utils.Interfaces.MenuItem;
import Classes.Users.User;

import java.util.Scanner;

public class Manager {
    public static User currentUser;
    public Manager(User loggedUser) {
        Manager.currentUser = loggedUser;
    }

    public void start() {
        while(currentUser.isLogin()) {
            int selectedOption = InputReader.getUserOption();
            displayOptions();
            executeOption(selectedOption);
        }
    }
    private void executeOption(int selectedOption) {
        MenuItem[] optionsMenu = currentUser.getOptions();

        if (selectedOption < 1 || selectedOption > optionsMenu.length) {
            System.out.println("Invalid choice.");
        } else {
            optionsMenu[selectedOption - 1].execute();
        }
    }

    private void displayOptions() {
        MenuItem[] optionsMenu = currentUser.getOptions();

        if (optionsMenu == null) {
            throw new IllegalStateException("Invalid Options");
        }

        System.out.println("*".repeat(30));
        for (int i = 0; i < optionsMenu.length; i++) {
            MenuItem option = optionsMenu[i];
            System.out.printf("%d. %s %n", i + 1, option.getText());
        }
        System.out.println("Input the action you want to execute:");
    }
}
