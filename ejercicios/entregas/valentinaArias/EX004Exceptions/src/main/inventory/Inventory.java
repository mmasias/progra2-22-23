package main.inventory;

import main.exceptions.FullStorageException;

import java.util.ArrayList;
;

public class Inventory implements  IInventory{
	private int capacity = 0;
	ArrayList<String> items;


	/**
	 * @param capacity  The number of items that the inventory can handle
	 */

	public  Inventory() {
		this.capacity = 10;
		this.items = new ArrayList<String>();
	}
	public Inventory(int capacity) {
		this.capacity = capacity;
		this.items = new ArrayList<String>();
	}

	public void listItems() {
		for (int i = 0; i < this.items.size(); i++) {
			System.out.println((i + 1) + ". " + this.items.get(i));
		}
	}

	public void addItem(String val) throws FullStorageException {
		if(hasAvailableStorage()){
			this.items.add(val);
		}
		else {
			throw new FullStorageException("No space left");
		}
	}

	public loadItems(String[] items) throws FullStorageException {
		for (int i = 0; i < items.length; i++) {
			addItem(items[i]);
		}
	}

	public loadItemsFromFile(String filename) throws FullStorageException {

	}


	/**
	 * AddItem method lets you add a new item to the inventory
	 *
	 * @param val       The String value that you want to add to inventory
	 * @exception FullStorageException  If the number of items has reached the capacity of the inventory
	 */

	public void setItem(String val) throws FullStorageException {
		if(hasAvailableStorage()){
			this.items.add(val);
		}
		else {
			throw new FullStorageException("No space left");
		}
	}

	/**
	 * getItems method gives you the actual items in the inventory
	 *
	 * @return          Returns an ArrayList of the actual state of the inventory
	 */

	public ArrayList<String> getItems() {
		return this.items;
	}

	private Boolean hasAvailableStorage(){
		return this.items.size() < this.capacity ? true: false;
	}

}