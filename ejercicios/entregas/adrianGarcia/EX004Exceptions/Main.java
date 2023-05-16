package com.progra;
import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newObject = "";
        System.out.println("Enter the capacity of your inventory:");
        int capacity = Integer.parseInt(input.nextLine());
        Inventory inv = new Inventory(capacity);
        do {
            int option = menu();
            switch (option) {
                case 1:
                    try {
                        System.out.println("Add an object to your inventory:");
                        newObject = input.nextLine();
                        inv.setItem(newObject);
                    } catch (FullStorageException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 2:
                    inv.showItems();
                    break;
                case 3:
                    inv.LoadItemsFromFile("src/com/progra/inventory/pets.dat");
                    break;
                case 4:
                    System.exit(0);
                    break;}}
        while (true);}
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int election = 0;
        do {
            System.out.println("1. Add products");
            System.out.println("2. Order inventory items");
            System.out.println("3. Initial inventory");
            System.out.println("4. Exit");
            try {
                election = input.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number");}
        } while (election < 1 || election > 4);
        return election;}}