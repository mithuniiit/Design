package user;

public class GuestUser extends User {

	public GuestUser(String userName, String password) {
		super(userName,password);
	}

	@Override
	protected boolean login(String userName, String password) {
		return true;
	}

	public void search() {
		b.search();
	}

	public void create() {
		System.out.println("Cannot create");
	}

	public void delete() {
		System.out.println("Cannot delete");
	}

}
