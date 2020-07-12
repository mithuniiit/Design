package movieticket.customer;

import movieticket.payment.PaymentProvider;
import movieticket.ticket.TicketProvider;

public abstract class User {
	String username;
	String password;
	String status;

	PaymentProvider pp;
	TicketProvider tp;

	public User() {
		pp = new PaymentProvider();
		tp = new TicketProvider();
	}

	public abstract boolean login(String username, String password);

	public void addPayment(String type, String details) {
		switch(type) {
		case "Credit":
			pp.addCreditCard(details);
			break;
		case "Debit":
			pp.addDebitCard(details);
			break;
		case "Cash":
			pp.addCash(details);
		}
	}

	public boolean search(String movie) {
		return tp.search(movie);
	}
	
	public void book() {
		pp.book();
	}
	
	public abstract void addMovie(String prod);
	public abstract void deleteMovie(String prod);
}
