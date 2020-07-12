package movieticket.shoppingcart;

import java.util.ArrayList;

import movieticket.ticket.Ticket;
import movieticket.ticket.TicketProvider;

public class ShoppingCart {
	TicketProvider ip;
	ArrayList<Ticket> basket;
	
	public ShoppingCart(TicketProvider ip) {
		this.ip = ip;
	}
	
	public void addItemToBasket(Ticket i) {
		basket.add(i);
	}
	
	public void addItemToBasket(String name) {
		basket.add(new Ticket(name));
	}
	
	public void removeItemFromBasket(Ticket i) {
		basket.remove(i);
	}
	
	public int findTotal() {
		//Iterate and return price
		return 0;
	}
}
