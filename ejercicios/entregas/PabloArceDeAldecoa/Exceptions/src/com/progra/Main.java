package com.progra;

import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the capacity of your inventory: \n");
        int capacity;
        Inventory inv;
        try {
            capacity = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid capacity entered. Using default capacity.\n");
            capacity = 0;
        }

        if (capacity > 0) {
            inv = new Inventory(capacity);
        } else {
            inv = new Inventory();
        }

        System.out.println("\nWelcome to your inventory. What would you like to do?\n");

        while (true) {
            System.out.println("1. Edit inventory");
            System.out.println("2. List all the objects in your inventory");
            System.out.println("3. Check if your inventory is empty");
            System.out.println("4. Check left capacity");
            System.out.println("5. Exit\n");
            int option = Integer.parseInt(input.nextLine());
            switch (option){
                case 1:
                    editMenu(inv);
                    break;
                case 2:
                    if (inv.isEmpty()) {
                        System.out.println("\nYour inventory is empty for now.\n");
                    }
                    else {
                        System.out.println("= ".repeat(12));
                        System.out.println("Your inventory contains: \n");
                        inv.listItems();
                        System.out.println("= ".repeat(12)+ "\n");
                    }
                    break;
                case 3:
                    if (inv.isEmpty()) {
                        System.out.println("\nYour inventory is empty.\n");
                    } else {
                        System.out.println("\nYour inventory is not empty.\n");
                    }
                    break;
                case 4:
                    System.out.println("\n Available storage left: " + inv.getAvailableStorage() + "\n");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid option");
                    break;
            }
        }
    }

    public static void editMenu(Inventory inv){
        Scanner input = new Scanner(System.in);
        int editFlag = 0;
        while (editFlag == 0) {
            System.out.println("1. Add an object to your inventory");
            System.out.println("2. Load a list of objects to your inventory");
            System.out.println("3. Load a list of objects from a file to your inventory");
            System.out.println("4. Remove an object from your inventory");
            System.out.println("5. Return to main menu\n");
            int option = Integer.parseInt(input.nextLine());
            switch (option){
                case 1:
                    System.out.println("\nEnter the name of the object you want to add: \n");
                    String newObject = input.nextLine();
                    try {
                        inv.setItem(newObject);
                    } catch (FullStorageException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    ArrayList<String> itemsArray = new ArrayList<String>();
                    while (true) {
                        System.out.println("\nEnter the name of the object you want to add: (exit to leave)\n");
                        String newObject2 = input.nextLine();
                        if (newObject2.equals("exit")) {
                            break;
                        }
                        itemsArray.add(newObject2);
                    }
                    try {
                        inv.loadItems(itemsArray);
                    } catch (FullStorageException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    String fileName = "src/com/progra/file.dat"; //input.nextLine();
                    try {
                        inv.loadItemsFromFile(fileName);
                    } catch (FullStorageException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("\nEnter the name of the object you want to remove: ");
                    String objectToRemove = input.nextLine();
                    inv.removeItem(objectToRemove);
                    break;
                case 5:
                    editFlag = 1;
                    break;
                default:
                    System.out.println("\nInvalid option selected\n");
                    break;
            }
        }
    }
}
