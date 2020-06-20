public class Book {
	
	int id;
	String title;
	int noOfCopies;
	
	Book(String title, int id, int noOfCopies){
		this.title = title;
		this.id = id;
		this.noOfCopies = noOfCopies;
	}
	
	String getTitle() {
		return title;
	}
	
	Integer getId() {
		return id;
	}
	
	void incNumber(int num) {
		noOfCopies += num;
	}
}
