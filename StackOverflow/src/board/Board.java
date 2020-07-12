package board;

public class Board {

	private static Board board_instance = null;

	private Board() {

	}

	public static Board getInstance() {
		if(board_instance == null)
			return board_instance = new Board();
		
		return board_instance;
	}
	
	public void create() {
		
	}
	
	public void delete() {
		
	}
	
	public void search() {
		
	}
}
