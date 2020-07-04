package amazon.account;

import amazon.payment.PaymentProvider;

public class Account {
	String address;
	PaymentProvider p;
	
	Account(){
		
	}
	
	public void addAddress(String address) {
		this.address = address;
	}
	
	public void addPayment(String type, String details) {
		
	}
}
