package user;

public class AdminUser extends User{

	public AdminUser(String userName, String password) {
		super(userName,password);
	}
	
	@Override
	protected boolean login(String userName,String password) {
		return true;
	}
	
	public void search() {
		b.search();
	}
	
	public void create() {
		b.create();
	}
	
	public void delete() {
		b.delete();
	}
}
