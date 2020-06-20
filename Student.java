import java.util.ArrayList;

public class Student {
	String name;
	Integer sid;
	ArrayList<Integer> BookIdArray;
	
	Student(Integer sid, String name){
		BookIdArray = new ArrayList<Integer>();
		this.name = name;
		this.sid = sid;
	}
	
	void reserve(Integer id){
		BookIdArray.add(id);
	}
	
	void cancel(Integer id) {
		BookIdArray.remove(id);
	}
}
