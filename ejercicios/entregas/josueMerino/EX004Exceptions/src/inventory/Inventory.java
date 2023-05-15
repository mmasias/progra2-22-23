package inventory;

import inventory.exceptions.FullStorageException;
import inventory.exceptions.ItemNotFoundException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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

    public Inventory() {
        this.capacity = 10;
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

    /**
     * removeItem method deletes item specified
     * @param item
     * @throws ItemNotFoundException
     */
    public void removeItem(String item) throws ItemNotFoundException {
        if(!this.items.contains(item))
        {
            throw new ItemNotFoundException("Not found item to delete");
        }

        this.items.remove(item);
    }

    /**
     *
     */
    public void listItems()
    {
        for (String item : items) {
            System.out.println(item);
        }
    }

    public void loadItemsFromFile(String path) throws IOException, FullStorageException {
        try{
            BufferedReader fileToRead = new BufferedReader(new FileReader(path));
            String line;
            while ((line = fileToRead.readLine()) != null) {
                setItem(line);
            }
        }
        catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        } catch (IOException e) {
            throw new IOException(e.getMessage());
        }
    }
    private Boolean hasAvailableStorage(){
        return this.items.size() < this.capacity;
    }

    public void loadItems(String[] items) throws FullStorageException {
        for (String item: items)
        {
            if (hasAvailableStorage()) {
                this.items.add(item);
            }
            else{
                throw new FullStorageException("No space left");
            }
        }
    }
}
