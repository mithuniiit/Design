public class Librarian {
	LibraryManagementSystem lms;

	Librarian(LibraryManagementSystem lms){
		this.lms = lms;
	}

	String search(String name) {
		return lms.search(lms.search(name));
	}

	String search(Integer id) {
		return lms.search(id);
	}

	void addBook(String book) {
		lms.addBook(book);
	}
}
