package movieticket.ticket;

import java.util.ArrayList;

public class TicketProvider {

	ArrayList<Ticket> movieList;
	
	public TicketProvider() {
		movieList = new ArrayList<Ticket>();
	}

	public boolean search(String name) {
		return true;
	}
	
	public void addMovie(String name) {
		movieList.add(new Ticket(name));
	}
	
	public void deleteMovie(String name) {
		movieList.remove(0);
	}
}
