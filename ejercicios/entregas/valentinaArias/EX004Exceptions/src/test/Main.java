package test;

import main.inventory.IInventory;
import main.inventory.Inventory;
import main.exceptions.FullStorageException;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String newObject = "";
		String deleteObject = "";
		Inventory inv = new Inventory();
		Inventory inv1 = new Inventory(10);

		inv.listItems();



		System.out.println("Ingresa la capacidad de tu inventario: ");
		int capacity = Integer.parseInt(input.nextLine()); // nextInt has problems with EOL
		Inventory inv3 = new Inventory(capacity);
		do {
			System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			System.out.println("Bienvenido al inventario de objetos");
			System.out.println("opciones: ");
			System.out.println("1. añadir objeto");
			System.out.println("2. eliminar objeto");
			System.out.println("3. ver inventario");
			System.out.println("4. salir");
			System.out.println("Ingresa una opción: ");
			String userOption = input.nextLine(); // Mover esta línea aquí

			try {
				if (userOption.equals("1")) {
					System.out.println("Ingresa un objeto a tu inventario: ");
					newObject = input.nextLine();
					inv .setItem(newObject);
					System.out.println("Objeto agregado al inventario.");
				} else if (userOption.equals("2")) {
					System.out.println("Ingresa el objeto que deseas eliminar: ");
					deleteObject = input.nextLine();
					inv.getItems().remove(deleteObject);
				} else if (userOption.equals("3")) {
					System.out.println("Inventario: " );
					List<String> items = inv.getItems();
					for (int i = 0; i < items.size(); i++) {
						System.out.println((i + 1) + ". " + items.get(i));
					}
				} else if (userOption.equals("4")) {\
					System.out.println("Adiós");
					break;
				} else {
					System.out.println("Opción no válida");
				}

			} catch (FullStorageException e) {
				System.err.println(e.getMessage());
			}

		} while (true);


	}
}

		//TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
		// como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas

