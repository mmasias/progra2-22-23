package main.ui;

import main.core.Manager;
import main.core.Options;
import main.core.User;

import java.util.Scanner;

public class ManagementSystem {
    Manager manager;
    Scanner input;

    public ManagementSystem() {
        manager = new Manager();
        input = new Scanner(System.in);


        // Default user
        Options listOptionsAdmin = new Options(5);
        listOptionsAdmin.add("List all customers");
        listOptionsAdmin.add("List all products");
        listOptionsAdmin.add("List all orders");
        listOptionsAdmin.add("List all admins");

        User admin = new User("admin", "admin", "Admin");
        admin.setOptions(listOptionsAdmin);
        manager.add(admin);
    }

    public int askForOption() {
        return input.nextInt();
    }
    public String askForString() {
        return input.next();
    }
}
