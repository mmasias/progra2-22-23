package com.progra.inventory;

import com.progra.inventory.exceptions.FullStorageException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory implements  IInventory{
    int capacity;
    ArrayList<String> items;

    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<String>();
    }
    public Inventory(){
        this.capacity = 10;
        this.items = new ArrayList<String>();
    }
    private Boolean hasAvailableStorage(){
        return this.items.size() < this.capacity ? true: false;
    }

    public void listItems(){
        for (int i = 0; i < this.items.size(); i++) {
            System.out.println((i+1) +". "+this.items.get(i));
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
    public void loadItems(ArrayList<String> items) throws FullStorageException {
        if(items.size() > this.capacity){
            throw new FullStorageException("No space left");
        }
        else {
            this.items = items;
        }
    }
    public boolean isEmpty(){
        return this.items.size() == 0 ? true: false;
    }
    public void removeItem(String item){
        this.items.remove(item);
    }
    public int getAvailableStorage(){
        return this.capacity - this.items.size();
    }
    public void loadItemsFromFile(String path) throws FullStorageException {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String item = scanner.nextLine();
                this.items.add(item);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    @Override
    public ArrayList<String> getItems() {
        return this.items;
    }
}
