import movieticket.customer.User;

public class Driver {
	public Driver() {
		
	}
	
	public static void main(String[] args) {
		OnlineServiceProvider osp = new OnlineServiceProvider();
		
		//creating users
		User guestUser = osp.createUser("guest");
		User regUser = osp.createUser("registered");
		User admin = osp.createUser("Admin"); 
		
		//login
		if(!regUser.login("user","password")) {
			System.out.println("unable to login");
		}
		
		if(!guestUser.login("user","password")) {
			System.out.println("unable to login");
		}
		
		if(!admin.login("user","password")) {
			System.out.println("unable to login");
		}
		
		guestUser.search("movie1");
		guestUser.addMovie("movie1");
		guestUser.addPayment("CreditCard", "xyz");
		guestUser.book();
		
		regUser.search("movie1");
		regUser.addMovie("movie1");
		regUser.book();
		
		admin.addMovie("Movie2");
		admin.deleteMovie("Movie2");
	}
}
