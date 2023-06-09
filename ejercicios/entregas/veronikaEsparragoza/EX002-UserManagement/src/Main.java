package src;
import src.classes.Manager;
import src.classes.OptionRepository;
import src.classes.UserRepository;

import java.util.Scanner;

public class Main {
    private  static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserRepository userDatabase = new UserRepository();
        userDatabase.getInitialFakeData(); // fake user Database Connection

        OptionRepository optionRepository = new OptionRepository();

        Manager manager = new Manager(userDatabase, optionRepository);
        manager.login();
    }

}
