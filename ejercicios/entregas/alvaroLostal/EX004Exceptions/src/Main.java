import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String newObject = "";
menu();
        System.out.println("Ingresa la capacidad de tu inventario: ");
        int capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
        Inventory inv = new Inventory(capacity);
        boolean exit = false;
        do {
            int option = menu();
            switch (option) {
                case 1:
                    //add element
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
                    //load file
                    inv.loadItemsFromFile("pets.dat");
                    break;

                case 3:
                    //list elements
                    System.out.println(inv.getItems());
                    break;

                case 4:
                    //exit
                    exit = true;
                    break;
            }

        }
        while (!exit);

        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas

    }
    public static int menu() {
        Scanner input = new Scanner(System.in);
        int opcion = 0;
        do {
            opcion = 0;
            try {
                System.out.println("1. Añadir Elemento");
                System.out.println("2. Cargar Fichero");
                System.out.println("3. Listar Elementos");
                System.out.println("4. Salir");
                System.out.println("Ingresa una opción: ");
                opcion = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while(opcion < 1 || opcion > 4);
        return opcion;
    }
}
