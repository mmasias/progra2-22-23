package com.progra.inventory;

import java.util.ArrayList;

public interface IInventory {
	void setItem(String val) throws com.progra.inventory.exceptions.FullStorageException;

	ArrayList<String> getItems();
}
