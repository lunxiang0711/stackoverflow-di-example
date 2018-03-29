package di.client;

import di.Room;
import di.Student;

public class Main {
	
	public static void main(String[] args) {
		
		Student st = new Student();
		st.setName("joe bloggs");
//		System.out.println(st.getName());
		
		Room rm = new Room();
		rm.setRoomNumber(101);
		rm.setAllotedTo(st);
		System.out.println(rm.toString());
		
	}
}
