package core;

import exceptions.FullStorageException;
import exceptions.UnableToRemoveException;

import java.util.ArrayList;

public interface IInventory {
    public void addItem(String val) throws FullStorageException;
    public void listItems();
    public void loadItems(String[] itemsToLoad) throws FullStorageException;
    public void loadItemsFromFile(String fileName) throws FullStorageException;
    public void removeItem(String val) throws UnableToRemoveException;
    ArrayList<String> getItems();
}
