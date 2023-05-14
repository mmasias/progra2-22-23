import core.Inventory;
import exceptions.FullStorageException;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Inventory Manager");
        System.out.println("Please, enter your inventory's capacity: ");
        Scanner scanCapacity = new Scanner(System.in);
        int capacity = scanCapacity.nextInt();

        Inventory inv = new Inventory(capacity);
        System.out.println("Please, select a valid option form the ones below: ");
        System.out.println("1. Add item");
        System.out.println("2. List items");
        System.out.println("3. Add items from an external archive");
        System.out.println("4. Exit Inventory Manager");

        Scanner scanOption = new Scanner(System.in);
        int selectedOption = scanOption.nextInt();

        Scanner input = new Scanner(System.in);
        if (selectedOption == 1) {
            String newObject = "";
            boolean addMore = true;
            do {
                try {
                    System.out.println("Enter the item you want to add: ");
                    newObject = input.nextLine();
                    inv.addItem(newObject);
                    System.out.println("Do you want to add more items to the inventory? (yes/no)");
                    Scanner scanResponse = new Scanner(System.in);
                    String response = scanResponse.nextLine();
                    if (!response.equals("yes")) {
                        addMore = false;
                    }
                } catch (FullStorageException e) {
                    System.err.println(e.getMessage());
                }
            }
            while (addMore);
        }
        else if (selectedOption == 2) {
            inv.listItems();
        }
        else if (selectedOption == 3) {

            String file = " ";
            try {
                System.out.println("Enter the name of the file please: ");
                file = input.nextLine();
                inv.loadItemsFromFile(file);
            } catch (FullStorageException e) {
                System.err.println(e.getMessage());
            }
        }
        else if (selectedOption == 4) {
            System.out.println("You are about to exit the program...");
            System.exit(0);
        }



    }
}
