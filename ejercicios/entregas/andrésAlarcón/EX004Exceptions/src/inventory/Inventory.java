package inventory;

import inventory.exceptions.FullStorageException;

import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class Inventory implements IInventory {
    int capacity = 0;
    ArrayList<String> items;


    public Inventory() {
        this.capacity = 20;
        this.items = new ArrayList<String>();
    }

    /**
     * @param capacity The number of items that the inventory can handle
     */

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<String>();
    }

    /**
     * AddItem method lets you add a new item to the inventory
     *
     * @param val The String value that you want to add to inventory
     * @throws FullStorageException If the number of items has reached the capacity of the inventory
     */
    @Override
    public void setItem(String val) throws FullStorageException {
        if (hasAvailableStorage()) {
            this.items.add(val);
        } else {
            throw new FullStorageException("No space left");
        }
    }

    /**
     * getItems method gives you the actual items in the inventory
     *
     * @return Returns an ArrayList of the actual state of the inventory
     */
    @Override
    public ArrayList<String> getItems() {
        return this.items;
    }

    private Boolean hasAvailableStorage() {
        return this.items.size() < this.capacity ? true : false;
    }


    public void addItem(String val) throws FullStorageException {
        if (hasAvailableStorage()) {
            this.items.add(val);
        } else {
            throw new FullStorageException("No space left");
        }
    }

    public void itemList() {
        for (String item : this.items) {
            System.out.println(item);
        }
    }

    public void itemsLoader(ArrayList<String> data) {
        for (String item : data) {
            try {
                this.addItem(item);
            } catch (FullStorageException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public void itemsLoaderFromFile(String path) {
        File file = new File(path);
        ArrayList<String> data = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        this.itemsLoader(data);
    }
}

