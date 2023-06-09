import inventory.Inventory;
import inventory.exceptions.FullStorageException;

import java.io.IOException;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String newObject = "";
        int capacity = 0;



            System.out.println("Set the inventory capacity ");
            try {
                capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
            } catch (NumberFormatException ex) {
                System.out.println("Number is not valid, please enter a valid number");
            }

        Inventory inv = new Inventory(capacity);
        do {
            int option = menu();
            switch (option) {
                case 1:
                    try {
                        System.out.println("Add an object to your inventory ");
                        newObject = input.nextLine();
                        inv.setItem(newObject);

                    } catch (FullStorageException e) {

                        System.err.println(e.getMessage());
                        break;
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Delete an object from your inventory ");
                        newObject = input.nextLine();
                        inv.deleteItem(newObject);
                    } catch (IOException e) {
                        System.err.println(e.getMessage());
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }

                    break;
                case 3:
                    inv.itemsLoaderFromFile("ejercicios/entregas/andrésAlarcón/EX004Exceptions/src/inventory/pets.dat");
                    break;
                case 4:
                    inv.itemList();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }


        }
        while (true);

        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas

    }


    public static int menu() {
        Scanner input = new Scanner(System.in);
        int option = Integer.parseInt(input.nextLine());

        do {

            System.out.println("1. Add Elements");
            System.out.println("2. Delete Elements");
            System.out.println("3. Add Elements from File");
            System.out.println("4. Elements List");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");

            try {
                option = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("The number you enter is not valid, please inset a valid option");
            }
        } while (option == 0);
        return option;
    }


}
