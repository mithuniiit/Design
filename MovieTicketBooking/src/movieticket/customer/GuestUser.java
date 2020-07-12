package movieticket.customer;

public class GuestUser extends User{

	public GuestUser() {
		
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void addMovie(String movie) {
		System.out.println("Cannot add");
	}
	
	public void deleteMovie(String movie) {
		System.out.println("Cannot delete");
	}

}
