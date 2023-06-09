package Progra.Inventory;
import Progra.Inventory.Exceptions.FullStorageException;

import java.util.ArrayList;

public class Inventory implements IInventory{
    static int capacity = 0;
    ArrayList<String> items;

    /**
     * @param capacity  The number of items that the inventory can handle
     */

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<String>();
    }public Inventory(){
        this.capacity=8;
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
    public void AddItem(String name,int amount){
    }
    public void LoadItems(){

    }
    public static void LoadItemsFromFile(String FarmAnimals){

    }
    public static void ListOfItems(){
        for (int i = 0; i < capacity; i++){
            System.out.println();
        }
    }
}
