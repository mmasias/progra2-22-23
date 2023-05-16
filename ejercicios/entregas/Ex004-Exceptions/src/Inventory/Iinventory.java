package Inventory;

import Inventory.Execptions.FullStorageException;

import java.util.ArrayList;

public interface Iinventory {
    public void setItem(String val) throws FullStorageException;
    public ArrayList<String> getItems();
}
