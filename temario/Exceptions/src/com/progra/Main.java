package com.progra;

import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String newObject = "";

        System.out.println("Ingresa la capacidad de tu inventario: ");
        int capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
        Inventory inv = new Inventory(capacity);
        do{
            try {
                System.out.println("Ingresa un objeto a tu inventario: ");
                newObject = input.nextLine();
                inv.setItem(newObject);

            } catch (FullStorageException e) {
                // HERE you can do something with the exception :)
                System.err.println(e.getMessage());
            }
        }
        while (true);
    }

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int election = 0;
        do{
        System.out.println("1. Add products");
        System.out.println("2. Order inventory items");
        System.out.println("3. Initial inventory");
        System.out.println("4. Exit");
            try {
            election=input.nextInt();
            }catch (NumberFormatException e) {
            System.out.println("Enter a valid number");
            }
        }while (election < 1 || election > 4);

        return election;
    }
}
