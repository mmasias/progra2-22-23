package com.progra.inventory;

import com.progra.inventory.exceptions.FullStorageException;

import java.util.ArrayList;

public class Inventory implements  IInventory{
    int capacity = 0;
    ArrayList<String> items;


    public Inventory() {
        this.capacity = 10;
        this.items = new ArrayList<String>();
    }
    public Inventory(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<String>();
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

    public void addItem(String val) throws FullStorageException {
        this.setItem(val);
    }

    @Override
    public ArrayList<String> getItems() {
        return this.items;
    }

    private Boolean hasAvailableStorage(){
        return this.items.size() < this.capacity ? true: false;
    }

    public void loadItems(ArrayList<String> data){
        for(String item: data){ // recorre la lista data para comprobar si esta lleno y si lo este que salte la excepcion
            try {
                this.setItem(item);
            } catch (FullStorageException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
