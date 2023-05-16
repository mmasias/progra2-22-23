package inventory;


import exceptions.FullStorageException;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Inventory implements  IInventory{
    int capacity = 0;
    ArrayList<String> items;


    /**
     * @param capacity  The number of items that the inventory can handle
     */

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<String>();

    } public Inventory() {
        this.capacity = 10;
    }

            /**
             * AddItem method lets you add a new item to the inventory
             *
             * @param val       The String value that you want to add to inventory
             * @exception FullStorageException  If the number of items has reached the capacity of the inventory
             */
    @Override
    public void setItem(String val) throws FullStorageException {
        if(hasAvailableStorage()){
            this.items.add(val);
        }
        else {
            throw new FullStorageException("No space left");
        }
    }

    /**
     * getItems method gives you the actual items in the inventory
     *
     * @return          Returns an ArrayList of the actual state of the inventory
     */
    @Override
    public ArrayList<String> getItems() {
        return this.items;
    }

    private Boolean hasAvailableStorage(){
        return this.items.size() < this.capacity ? true: false;
    }
    private static void addItem(String item) throws FullStorageException {
        //Añadir objetos al inventario. Si esta lleno lanza FullStorageException
       if(this.items.size()<capacity){
           this.items.add(item);
       }else{
           throw new FullStorageException("Capacidad superada");
       }

    }
    public static void listItems(){
        for (int i = 0; i < capacity; i++) {
            System.out.println(items);
        }

    }
    private void loadItems(ArrayList<String> items) {
        for (int i = 0; i < capacity; i++) {
            try{
                addItem(items.get(i));
            }catch( FullStorageException e){
                System.err.println(e.getMessage());
            }

        }

    }
    public static void loadItemsFromFile(){
        File file = new File("pets.dat");
        if (!file.exists()){
            System.out.println("The file doesnt exist");
        }else{
            try{
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line ="";
                while ((line=br.readLine())!=null){
                  addItem(line);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (FullStorageException e) {
                throw new RuntimeException(e);
            }
        }

    }
}