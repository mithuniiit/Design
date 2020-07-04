package amazon.customer;

public abstract class User {
	String username;
	String password;
	String status;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract boolean login(String username, String password);
}
