package com.progra;

import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;
import com.progra.inventory.exceptions.ItemNotFoundException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FullStorageException, ItemNotFoundException {

        Scanner input = new Scanner(System.in);
        String newObject = "";

        System.out.println("Ingresa la capacidad de tu inventario: ");
        int capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
        Inventory inv = new Inventory(capacity);
        int option = 0;
        do{
            System.out.println("Selecciona el número de opción que quieres llevar a cabo en tu inventario");
            System.out.println("1. Crear un nuevo item en tu inventario manualmente");
            System.out.println("2. Eliminar un item de tu inventario");
            System.out.println("3. Añadir items a tu inventario a partir de un archivo");
            System.out.println("0. Salir del programa");
            option = Integer.parseInt(input.nextLine());

            switch (option){
                case 1:
                    try {
                        System.out.println("Ingresa un objeto a tu inventario: ");
                        newObject = input.nextLine();
                        inv.setItem(newObject);

                    } catch (FullStorageException e) {
                        throw new FullStorageException(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Ingresa el objeto a eliminar de tu inventario: ");
                        newObject = input.nextLine();
                        inv.removeItem(newObject);

                    }
                    catch (ItemNotFoundException e) {
                        throw new ItemNotFoundException(e.getMessage());
                    }
            }

        }
        while (option != 0);

        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas

    }
}
