package amazon.payment;

public class PaymentProvider {
	
	CreditCard cc;
	DebitCard dc;
	Cash c;
	
	public PaymentProvider() {
		
	}
	
	public void addCreditCard(String details) {
		cc = new CreditCard(details);
	}
	
	public void addDebitCard(String details) {
		dc = new DebitCard(details);
	}
	
	public void addCash(String number) {
		c = new Cash(number);
	}
	
	public boolean makePayment(int sum) {
		
		return false;
	}
}
