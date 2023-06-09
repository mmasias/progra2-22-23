import Inventory.exceptions.FullStorageException;
import Inventory.Inventory;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String newObject = "";

        System.out.println("Inventory capacity: ");
        int capacity = Integer.parseInt(input.nextLine()); //nextInt has problems with EOL
        Inventory inv = new Inventory(capacity);
        do{
            try {
                int option = menu();
                switch (option){
                    case 1:
                           try{
                               System.out.println("Add an object to the inventory: ");
                               newObject = input.nextLine();
                               inv.setItem(newObject);
                           } catch (FullStorageException e) {
                               System.err.println(e.getMessage());
                           }

                        break;
                    case 2:
                        inv.showItems();
                        break;
                    case 3:
                        inv.loadFileItems("src\\Inventory\\data\\items.txt");
                        break;
                    case 4:
                        System.exit(0);
                        break;
                }

                System.out.println("Add an object to the inventory: ");
                newObject = input.nextLine();
                inv.setItem(newObject);

            } catch (FullStorageException e) {
                // HERE you can do something with the exception :)
                System.err.println(e.getMessage());
            }
        }
        while (true);
    }

    public static int menu(){
        Scanner input = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("1. Add an object to the inventory");
            System.out.println("2. Short inventory");
            System.out.println("3. Initial inventory");
            System.out.println("4. Exit");

            try{
                option = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please enter a valid option");
            }
        } while(option < 1 || option > 4);
        return option;
    }
}
