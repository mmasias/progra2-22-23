package Progra;


import Progra.Inventory.Inventory;
import Progra.Inventory.Exceptions.FullStorageException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
                        System.out.println("Insert an object to inventory: ");
                        newObject = input.nextLine();
                        inv.setItem(newObject);

                    } catch (FullStorageException e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case 2:
                    Inventory.LoadItemsFromFile("pets.dat");
                    break;
                case 3:
                    Inventory.ListOfItems();
                    break;
                case 4:
                    boolean salir = true;
                    break;

            }

        } while (true);

    }
        public static int menu(){
        Scanner input =new Scanner(System.in);

            int option=0;
        try{
            System.out.println("1. Place an object in the inventory");
            System.out.println("2. Delete an obejct from the inventory");
            System.out.println("3. List objects from the inventory");
            System.out.println("4. Load File");
            System.out.println("5. Exit");
            option = input.nextInt();

        }catch (NumberFormatException exception){
            System.out.println("Introduce a valid option");
        }
        return option;


    }
}