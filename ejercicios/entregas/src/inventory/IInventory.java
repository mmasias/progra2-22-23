package inventory;


import exceptions.FullStorageException;

import java.util.ArrayList;

public interface IInventory {

    public void setItem(String val) throws FullStorageException, FullStorageException;
    public ArrayList<String> getItems();
}