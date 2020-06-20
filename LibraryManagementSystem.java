import java.util.HashMap;
import java.util.Map;

public class LibraryManagementSystem {

	//BookID ----> Book Object
	Map<Integer,Book> idMap;

	//BookName ----> Book Object
	Map<String,Book> nameMap;

	//BookID --> Student
	Map<Integer,Student> booking;

	//StudentID ---> Student
	Map<Integer,Student> studentMap;
	int latestBookId;

	LibraryManagementSystem(){
		idMap = new HashMap<Integer,Book>();
		nameMap = new HashMap<String, Book>();

		//Bookid -----> student object
		booking = new HashMap<Integer,Student>();

		//StudentId -----> Student Object
		studentMap = new HashMap<Integer, Student>();
		latestBookId = 0;
	}

	String search(Integer id) {
		if(idMap.containsKey(id)) {
			return (idMap.get(id)).getTitle();
		}
		return null;
	}


	Integer search(String name) {
		if(nameMap.containsKey(name)) {
			return (nameMap.get(name)).getId();
		}
		return -1;
	}

	void addBook(String name) {
		//If book already there increment the count
		if( search(name) != -1 ) {
			nameMap.get(name).incNumber(1);
		}else {
			//if book not present we add an entry
			++latestBookId;
			idMap.put(latestBookId , new Book(name,latestBookId, 1));
			nameMap.put(name,idMap.get(latestBookId));
		}
	}

	void addBook(Integer id) {
		idMap.get(id).incNumber(1);
	}

	void addStudent(int sid, String name) {
		studentMap.put(sid, new Student(sid,name));
	}

	void reserve(Integer sid, Integer bookid) {
		booking.put(bookid, studentMap.get(sid));
		studentMap.get(sid).reserve(bookid);
	}
}
