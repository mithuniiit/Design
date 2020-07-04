import amazon.customer.UserProvider;
import amazon.item.ItemProvider;
import amazon.payment.PaymentProvider;
import amazon.shoppingcart.ShoppingCart;

public class OnlineServiceProvider {

	UserProvider up;
	ItemProvider ip;
	ShoppingCart sc;
	PaymentProvider pp;
	String UserName;
	String Password;
	
	public OnlineServiceProvider() {
		ip = new ItemProvider();
		sc = new ShoppingCart(ip);
		pp = new PaymentProvider();
	}

	public boolean login(String username,String password) {
		return up.login(username,password);
	}
	
	public String search(String prod) {
		return ip.search(prod);
	}
	
	public void add(String prod) {
		sc.addItemToBasket(prod);
	}
	
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
	
	public void Order() {
		//Iterate through cart using Shopping Cart Provider
		int sum = sc.findTotal();
		
		//Invoke Payment using Payment provider
		pp.makePayment(sum);
	}
}
