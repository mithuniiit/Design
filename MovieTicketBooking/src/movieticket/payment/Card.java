package movieticket.payment;

public abstract class Card {
	String type;
	public abstract boolean debit();
}
