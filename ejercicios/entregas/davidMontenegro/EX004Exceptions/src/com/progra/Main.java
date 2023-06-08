package com.progra;

import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;
import com.progra.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String newObject = "";
        int capacity = 0;
        do {
            System.out.println("Ingresa la capacidad de tu inventario: ");
        } try {
            int capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
        } catch (NumberFormatException ex) {
            System.err.println("Invalid number");
        }
        Inventory inv = new Inventory(capacity);
        do {
            try {
                System.out.println("Ingresa un objeto a tu inventario: ");
                newObject = input.nextLine();
                inv.setItem(newObject);

            } catch (FullStorageException e) {
                // HERE you can do something with the exception :)
                System.err.println(e.getMessage());
            }
        } while (capacity == 0);

        Inventory inv = new Inventory(capacity);
        do {
            int option = menu();
            switch (option) {
                case 1:
                    try {
                        System.out.println("Ingresa un objeto a tu inventario: ");
                        newObject = input.nextLine();
                        inv.setItem(newObject);

                    } catch (FullStorageException e) {
                        // HERE you can do something with the exception :)
                        System.err.println(e.getMessage());
                        break ();
                    }
                    break ();
                case 2:
                    inv.itemList();
                    break ();
                case 3:
                    inv.loadItemsFromFile("/Users/David/Documents/Code github/Code/progra2-22-23/ejercicios/entregas/davidMontenegro/EX004Exceptions/src/com/progra/inventory/pets.dat");
                    break ();
                case 4:
                    System.exit(0);
                    break ();
            }
        } while (true);
        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas
    }
    public static int menu(){
        Scanner input = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("1. Add item to inventory");
            System.out.println("2. List Items");
            System.out.println("3. Load file");
            System.out.println("4. Exit");
            System.out.println("Select an option: ");
            try {
                option = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
            } catch (NumberFormatException ex) {
                System.err.println("Invalid number");
            }
        } while (option == 0);
        return option;
    }
}
