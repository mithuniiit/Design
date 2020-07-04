package amazon.item;

import java.util.ArrayList;

public class ItemProvider {

	ArrayList<Item> items;
	
	public ItemProvider() {
		items = new ArrayList<Item>();
	}

	public String search(String name) {
		return null;
	}
	
	public void addItem(String name) {
		items.add(new Item(name));
	}
}
