
public class driver {

	public static void main(String[] args) {
		LibraryManagementSystem lms = new LibraryManagementSystem();

		lms.addBook("Java");
		lms.addBook("C++");
		lms.addBook("Python");

		System.out.println(lms.search("Java"));

		lms.addStudent(1, "s1");
		lms.addStudent(2, "s2");
		lms.reserve(1, lms.search("Java"));
	}
}
