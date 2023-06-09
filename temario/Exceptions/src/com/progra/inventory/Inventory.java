package com.progra.inventory;

import com.progra.inventory.exceptions.FullStorageException;
import com.progra.inventory.exceptions.ItemNotFoundException;

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

    public void removeItem(String item) throws ItemNotFoundException {
        if(!this.items.contains(item))
        {
            throw new ItemNotFoundException("Not found item to delete");
        }

        this.items.remove(item);
    }

    private Boolean hasAvailableStorage(){
        return this.items.size() < this.capacity;
    }
}
