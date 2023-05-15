package core;

import exceptions.FullStorageException;
import exceptions.UnableToRemoveException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Inventory implements IInventory {
    int capacity = 0;
    ArrayList<String> items;

    /**
     * @param capacity  The number of items that the inventory can handle
     */

    public Inventory(int capacity)  {
        this.capacity = capacity;
        this.items = new ArrayList<String>();
    }

    public Inventory () {
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
    public void addItem(String val) throws FullStorageException {
        if(hasAvailableStorage()){
            this.items.add(val);
        }
        else {
            throw new FullStorageException("No space left");
        }
    }

    @Override
    public void listItems() {
        System.out.println(items);
    }

    @Override
    public void loadItems(String[] itemsToLoad) throws FullStorageException {
        if (hasAvailableStorage()) {
            for (int i = 0; i < itemsToLoad.length; i++) {
                items.add(itemsToLoad[i]);
            }
        }
        else {
            throw new FullStorageException("No space left");
        }
    }

    @Override
    public void loadItemsFromFile(String fileName) throws FullStorageException {
        BufferedReader br = null;
        Path path = Paths.get(fileName);
        Path filePath = path.toAbsolutePath();
        String stringFilePath = filePath.toString();

        if (hasAvailableStorage()) {
            try {
                br = new BufferedReader(new FileReader(stringFilePath));
                String data = br.readLine();

                while (data != null) {
                    items.add(data);
                    data = br.readLine();
                }
            } catch (IOException e) {
                System.err.println("Error in input or output");
            } finally {
                try{
                    if (br != null) {
                        br.close();
                    }
                } catch (IOException e) {
                    System.err.println("Error in input or output");
                }
            }

        }
        else {
            throw new FullStorageException("No space left");
        }
    }

    @Override
    public void removeItem (String val) throws UnableToRemoveException {
        boolean remove = items.remove(val);
        if (!remove) {
            throw new UnableToRemoveException("The item can't be removed");
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




}
