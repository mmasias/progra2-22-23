package Progra.Inventory;
import Progra.Inventory.Exceptions.FullStorageException;

import java.util.ArrayList;
public interface IInventory {
    public void setItem(String val) throws FullStorageException;
    public ArrayList<String> getItems();

}
