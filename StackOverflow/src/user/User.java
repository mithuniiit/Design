package user;

import board.Board;

public abstract class User {

	String userName;
	String password;
	Board b;
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
		b = Board.getInstance();
	}
	protected abstract boolean login(String userName, String password);
	
	public abstract void search();
	public abstract void create();
	public abstract void delete();
	
}
