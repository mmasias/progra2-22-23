package main.inventory;

import main.exceptions.FullStorageException;

import java.util.ArrayList;
// Definimos comportamiento de un inventario
	public interface IInventory {

		public void setItem(String val) throws FullStorageException;
		public ArrayList<String> getItems();


	}

