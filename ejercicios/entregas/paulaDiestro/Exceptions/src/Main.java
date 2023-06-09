import inventory.Inventory;
import inventory.exceptions.FullStorageException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory(10);

        boolean running = true;
        while (running) {
            System.out.println("Select an option:");
            System.out.println("1. Add product");
            System.out.println("2. List products");
            System.out.println("3. Charge inventory from archive");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:

                    System.out.print("Ingrese el nombre del producto: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();


                    try {
                        inventory.addItem(name, amount);
                        System.out.println("Producto agregado con éxito");
                    } catch (FullStorageException e) {
                        System.out.println("El inventario está lleno, no se pudo agregar el producto");
                    }
                    break;
                case 2:
                    inventory.listItems();
                    break;
                case 3:

                    System.out.print("Ingrese el nombre del archivo: ");
                    String pet = scanner.nextLine();

                    try {
                        inventory.loadItemsFromFile(pet);
                        System.out.println("Inventario cargado con éxito desde el archivo");
                    } catch (FullStorageException e) {
                        System.out.println("El inventario está lleno, no se pudo cargar el inventario desde el archivo");
                    }
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }

        scanner.close();
    }
}
