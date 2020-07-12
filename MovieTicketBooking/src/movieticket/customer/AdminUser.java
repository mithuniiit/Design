package movieticket.customer;

public class AdminUser extends User{

	public AdminUser() {
		
	}

	@Override
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public void addMovie(String movie) {
		tp.addMovie(movie);
	}
	
	public void deleteMovie(String movie) {
		tp.addMovie(movie);
	}

}
