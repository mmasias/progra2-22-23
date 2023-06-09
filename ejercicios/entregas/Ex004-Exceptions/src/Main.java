import Inventory.Execptions.FullStorageException;
import Inventory.Inventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String newObject = "";

        menu();

        System.out.println("Ingresa la capacidad de tu inventario: ");
        int capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
        Inventory inventory= new Inventory(capacity);
        boolean salir=false;
        do{
           /* try {
                System.out.println("Ingresa un objeto a tu inventario: ");
                newObject = input.nextLine();
                inv.setItem (newObject);

            } catch (FullStorageException e) {
                // HERE you can do something with the exception :)
                System.err.println(e.getMessage());
            }*/
            int option=menu();
            switch (option){
                case 1:try {
                    System.out.println("Ingresa un objeto a tu inventario: ");
                    newObject = input.nextLine();
                    inventory.setItem (newObject);

                } catch (FullStorageException e) {
                    // HERE you can do something with the exception :)
                    System.err.println(e.getMessage());
                }
                    break;
                case 2:
                    inventory.loadItemsFromFile("pets.dat");
                    break;
                case 3: inventory.listItems();
                    break;
                case 4: salir=true;
                    break;
            }

        }
        while (!salir);

        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas

    }

    public static int menu() {
        Scanner imput= new Scanner(System.in);
        int option = 0;
        try {
            System.out.println("1. Insertar un objeto al inventario");
            System.out.println("2. Cargar fichero");
            System.out.println("3. Listar un objeto al inventario");
            System.out.println(" 4. Salir");
            option = imput.nextInt();
        }catch (NumberFormatException e){
            System.err.println("Ingrese un número válido");
        }
        return option;
    }

}