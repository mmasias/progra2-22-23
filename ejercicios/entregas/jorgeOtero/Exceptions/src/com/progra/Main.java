package com.progra;

import com.progra.core.CarBrand;
import com.progra.core.Options;
import com.progra.inventory.Inventory;
import com.progra.inventory.exceptions.FullStorageException;
import com.progra.inventory.exceptions.NoItemFound;
import com.progra.utils.FileHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("How many brands you want to be shown or added?");
        Scanner input = new Scanner(System.in);
        String newObject = "";
        int capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
        Inventory inv = new Inventory(capacity);
        boolean working = true;
        List<CarBrand> carBrands = new ArrayList<>();

        FileHandler fileHandler = new FileHandler();
        for (String carBrand : fileHandler.loadFileContent("src\\com\\progra\\data\\Brands.txt")) {
            String name = carBrand;
            try {
                inv.setItem(name);
            } catch (FullStorageException e) {
            }
        }
        Options options = new Options(4);
        options.add("Add new item");
        options.add("Remove item");
        options.add("List items");
        options.add("Exit");

        do {

            options.print();

            Scanner optionSelection = new Scanner(System.in);
            int option = optionSelection.nextInt();
            if (option == options.getDefaultSelection()) {
                System.out.println("Bye!");
                working = false;

            } else if (option == 1) {
                try {
                    System.out.println("Write the brand");
                    newObject = input.nextLine();
                    inv.setItem(newObject);

                } catch (FullStorageException e) {
                    System.err.println(e.getMessage());

                }
            } else if (option == 2) {
                try {
                    System.out.println("What item you want to remove?");
                    newObject = input.nextLine();
                    inv.removeItem(newObject);
                } catch (NoItemFound e) {
                    System.err.println(e.getMessage());
                }
            } else if (option == 3) {
                for (String item : inv.getItems()) {
                    System.out.println(item);
                }
            }
        }while (working);





        //TODO Borrar Elementos del inventario, Añadir Elementos a través de un archivo externo y manejar excepciones
        // como FileNotFoundException, también crear validaciones por medio de Excepciones personalizadas

    }
}
