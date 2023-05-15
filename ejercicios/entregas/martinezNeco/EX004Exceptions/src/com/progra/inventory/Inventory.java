package com.progra.inventory;

import com.progra.inventory.exceptions.FullStorageException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Inventory implements  IInventory{
    int capacity = 0;
    ArrayList<String> items;

    /**
     * @param capacity  The number of items that the inventory can handle
     */
    public Inventory() {
        this.capacity = 10;
        this.items = new ArrayList<String>();
    }

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

    public void addItem(String val) throws FullStorageException {
        if(hasAvailableStorage()){
            this.items.add(val);
        }
        else {
            throw new FullStorageException("No space left");
        }
    }

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


    public void listItems(){
        for (String item: this.items) {
            System.out.println(item);
        }
    }
    public void loadItems(String[] items) throws FullStorageException {
        for (String item: items) {
            this.setItem(item);
        }
    }
    @Override
    public ArrayList<String> getItems() {
        return this.items;
    }

    private Boolean hasAvailableStorage(){
        return this.items.size() < this.capacity ? true: false;
    }

    public void loadItemsFromFile(String path) throws IOException {
        File f = new File(path);
        if(f.exists()) {
            String line = "";
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                try {
                    this.addItem(line);
                } catch (FullStorageException e) {
                    System.err.println(e.getMessage());
                }
            }

        }else {
            throw new IOException("File not found");
        }

    }


}

