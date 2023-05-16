

import exceptions.FullStorageException;
import inventory.Inventory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String newObject = "";

        System.out.println("Ingresa la capacidad de tu inventario: ");
        int capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
        Inventory inv = new Inventory(capacity);
        do{
        /*    try {
                System.out.println("Ingresa un objeto a tu inventario: ");
                newObject = input.nextLine();
                inv.setItem(newObject);

            } catch (FullStorageException e) {
                // HERE you can do something with the exception :)
                System.err.println(e.getMessage());
            }/*/
            int option=menu();
            switch (option){
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
                    Inventory.loadItemsFromFile("pets.dat");
                    break;
                case 3:
                    Inventory.listItems();
                    break;
                case 4:
                    boolean salir = true;
                    break;


        }
        while (true);

        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas

    }
    public static int menu(){
        Scanner input = new Scanner(System.in);
        int option = 0;
        try {
            System.out.println("1. Insertar un objeto al inventario");
            System.out.println("2. Borrar un objeto del inventario");
            System.out.println("3. Listar los objetos del inventario");
            System.out.println("4. Cargar fichero");
            System.out.println("5. Salir");
            option = input.nextInt();

        }catch (NumberFormatException ex){
            System.err.println("Ingresa un número válido");
        }

        return option;
        }
    }
}