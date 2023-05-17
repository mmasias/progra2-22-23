package com.progra.inventory;

import com.progra.inventory.exceptions.FullStorageException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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


    public void addItem(String item) throws FullStorageException {
        if (!hasAvailableStorage()) {
            throw new FullStorageException("El inventario está lleno");
        }
        items.add(item);
    }


    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("El inventario está vacío");
        } else {
            System.out.println("Items en el inventario:");
            for (String item : items) {
                System.out.println(item);
            }
        }
    }
    @Override
    public void setItem(String val) throws FullStorageException {
            if(hasAvailableStorage()){
                this.items.add(val);
            }
            else {
                throw new FullStorageException("No hay espacio");
            }
    }
    public void loadItems(String[] newItems)  {

        for (String item : newItems) {
            try {
                addItem(item);
            } catch (FullStorageException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void loadItemsFromFile(String fileName) throws IOException, FullStorageException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                addItem(line);
            }
        }
    }
    @Override
    public ArrayList<String> getItems() {
        return this.items;
    }

    private Boolean hasAvailableStorage(){
        return this.items.size() < this.capacity ? true: false;
    }
}
