package QASystem;

import user.AdminUser;
import user.GuestUser;
import user.RegisteredUser;
import user.User;

public class QASystem {

	User u;

	public QASystem() {
		// TODO Auto-generated constructor stub
	}

	public User createUser(String user, String userName, String password){
		switch(user) {
		case "a":
			u = new AdminUser(userName,password);
			break;
		case "r":
			u = new RegisteredUser(userName,password);
			break;
		default:
			u = new GuestUser(userName,password);
		}
		return u;
	}
}