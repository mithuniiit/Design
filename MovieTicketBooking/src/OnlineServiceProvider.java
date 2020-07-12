import movieticket.customer.AdminUser;
import movieticket.customer.GuestUser;
import movieticket.customer.RegisteredUser;
import movieticket.customer.User;

public class OnlineServiceProvider {

	//UserProvider up;
	User u;
	//
	String UserName;
	String Password;
	
	public OnlineServiceProvider() {
	
	}

	public User createUser(String type) {
		switch(type) {
		case "guest":
			u = new GuestUser();
			break;
		case "registered":
			u = new RegisteredUser();
			break;
		case "Admin":
			u = new AdminUser();
			break;
		}
		return u;
	}
}
