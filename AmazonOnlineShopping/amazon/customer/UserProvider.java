package amazon.customer;

public class UserProvider {

	User u;
	
	public UserProvider() {
		// TODO Auto-generated constructor stub
	}

	public boolean login(String username, String password) {
		if(username == null)
			u = new GuestUser();
		else
			u = new RegisteredUser();
		
		return u.login(username,password);
	}

}
