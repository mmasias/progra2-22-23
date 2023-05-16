package com.progra.inventory;

import com.progra.inventory.exceptions.FullStorageException;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory implements IInventory {
    int capacity = 0;
    ArrayList<String> items;

    public Inventory() {
        this.capacity = 10;
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
        return this.items.size() < this.capacity;
    }

    public void addItem(String item) throws FullStorageException {
        if (hasAvailableStorage()) {
            this.items.add(item);
        } else {
            throw new FullStorageException("No space left");
        }
    }

    public void listItems() {
        for (String item : this.items) {
            System.out.println(item);
        }
    }
    public void loadItems(ArrayList<String> tempItems) {
        for (String item : tempItems) {
            try {
                addItem(item);
            } catch (FullStorageException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    public void loadItemsFromFile(String fileName) {
        File f = new File (fileName);
        if (!f.exists()) {
            System.out.println("El fichero no existe");
        } else {
            try {
                BufferedReader s = new BufferedReader(new FileReader(f));
                String item = "";
                while ((item= s.readLine()) != null) {
                    try {
                        addItem(item);
                    } catch (FullStorageException e) {
                        System.err.println(e.getMessage());
                    }
                }
                s.close();
            } catch (FileNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}