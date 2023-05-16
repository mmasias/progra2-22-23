package main.inventory;

import main.exceptions.FullStorageException;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private static final int MAX_CAPACITY = 10;
	private int capacity;
	private List<Item> items;

	public Inventory(int capacity) {
		this.capacity = capacity;
		this.items = new ArrayList<>();
	}

	public void addItem(Item item) throws FullStorageException {
		if (isFull()) {
			throw new FullStorageException("Inventory is full");
		}
		items.add(item);
	}

	public boolean isFull() {
		return items.size() >= capacity;
	}

	public boolean isEmpty() {
		return items.isEmpty();
	}

	public List<Item> getItems() {
		return new ArrayList<>(items);
	}

	public int getItemsCount() {
		return items.size();
	}

	public Item getItem(int index) {
		if (index >= 0 && index < items.size()) {
			return items.get(index);
		}
		return null;
	}

	public static class Item {
		private String name;

		public Item(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}