import QASystem.QASystem;
import user.User;

public class driver {

	public driver() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		QASystem q = new QASystem();
		User u = q.createUser("r", "userName", "password");
		u.create();
		u.search();
		u.delete();
	}
}
