
import inventory.Inventory;
import inventory.exceptions.FullStorageException;
import inventory.exceptions.ItemNotFoundException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FullStorageException, ItemNotFoundException, IOException {

        Scanner input = new Scanner(System.in);
        String newObject = "";

        System.out.println("Ingresa la capacidad de tu inventario: ");
        int capacity = Integer.parseInt(input.nextLine()); // nextInt has problems with EOL
        Inventory inv = new Inventory(capacity);
        int option = 0;
        do {
            System.out.println("Selecciona el número de opción que quieres llevar a cabo en tu inventario");
            System.out.println("1. Crear un nuevo item en tu inventario manualmente");
            System.out.println("2. Eliminar un item de tu inventario");
            System.out.println("3. Añadir items a tu inventario a partir de un archivo");
            System.out.println("4. Mostrar los items del inventario");
            System.out.println("5. Añadir varios elementos");
            System.out.println("0. Salir del programa");
            option = Integer.parseInt(input.nextLine());

            switch (option) {
                case 1:
                    try {
                        System.out.println("Ingresa un objeto a tu inventario: ");
                        newObject = input.nextLine();
                        inv.setItem(newObject);
                        System.out.println();
                    } catch (FullStorageException e) {
                        throw new FullStorageException(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Ingresa el objeto a eliminar de tu inventario: ");
                        newObject = input.nextLine();
                        inv.removeItem(newObject);

                    } catch (ItemNotFoundException e) {
                        throw new ItemNotFoundException(e.getMessage());
                    }
                    break;
                case 3:
                        System.out.println("Ingresa la ruta del archivo");
                        String path = input.nextLine();

                        inv.loadItemsFromFile(path);
                    break;
                case 4:
                    inv.listItems();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("¿Cuántos elementos quieres introducir?");

            }

        } while (option != 0);

    }
}
