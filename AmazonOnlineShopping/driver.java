
public class Driver {
	public Driver() {
		
	}
	public static void main(String[] args) {
		OnlineServiceProvider osp = new OnlineServiceProvider();
		osp.login("user","password");
		osp.search("ABC");
		osp.add("ABC");
		osp.Order();
	}
}
