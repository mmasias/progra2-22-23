package com.progra;

import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
        do{
            try {
                System.out.println("Ingresa un objeto a tu inventario: ");
                newObject = input.nextLine();
                inv.setItem(newObject);

            } catch (FullStorageException e) {
                // HERE you can do something with the exception :)
                System.err.println(e.getMessage());
                break;
            }
        }
        while (true);

        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas

    }
}
