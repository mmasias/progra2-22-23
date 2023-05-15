package com.progra;

import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        String newObject = "";
        int capacity = 0;
        do {
            System.out.println("Ingresa la capacidad de tu inventario: ");
            try {
                capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
            } catch (NumberFormatException ex) {
                System.out.println("Number is not valid");
            }
        }while(capacity==0);


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
                    break;
                }
                break;
            case 2:
                inv.listItems();
                break;
            case 3:
                inv.loadItemsFromFile("ejercicios/entregas/martinezNeco/EX004Exceptions/src/com/progra/inventory/pets.dat");
                break;
            case 4:
                System.exit(0);
                break;
        }





    }while(true);
        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas
    }

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("1. Add Item");
            System.out.println("2. List Item");
            System.out.println("3. Load File");
            System.out.println("4. Exit");
            try {
                option = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
            } catch (NumberFormatException ex) {
                System.out.println("Number is not valid");
            }
        }while(option==0);
        return option;
    }

}
