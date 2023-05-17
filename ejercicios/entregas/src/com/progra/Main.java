package com.progra;

import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, FullStorageException {

        Scanner input = new Scanner(System.in);
        String newObject = "";

        System.out.println("Ingresa la capacidad de tu inventario: ");
        int capacity = Integer.parseInt(input.nextLine());
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

                    }
                    break;
                case 2:
                    inv.listItems();
                    break;
                case 3:
                    inv.loadItemsFromFile("src/com/progra/inventory/pets.dat");
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (true) ;

        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas

    }

    public static int menu() {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1: Agregar productos");
            System.out.println("2: Listar productos");
            System.out.println("3: Cargar inventario");
            System.out.println("4: Salir de la aplicacion");
            try {
                opcion = input.nextInt();

            } catch (NumberFormatException e) {
                System.out.println("Ingrese una opcion valida");
            }
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
}
