package amazon.shoppingcart;

import java.util.ArrayList;

import amazon.item.Item;
import amazon.item.ItemProvider;

public class ShoppingCart {
	ItemProvider ip;
	ArrayList<Item> basket;
	
	public ShoppingCart(ItemProvider ip) {
		this.ip = ip;
	}
	
	public void addItemToBasket(Item i) {
		basket.add(i);
	}
	
	public void addItemToBasket(String name) {
		basket.add(new Item(name));
	}
	
	public void removeItemFromBasket(Item i) {
		basket.remove(i);
	}
	
	public int findTotal() {
		//Iterate and return price
		return 0;
	}
}
