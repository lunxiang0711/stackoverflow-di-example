package di.modified.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Room_aw {
	private int roomNumber;
	@Autowired 
    private Student_aw allotedTo;
	
    public Student_aw getAllotedTo() {
           return allotedTo;
    }
    
    public void setRoomNumber(int roomNumber) {
    	this.roomNumber = roomNumber;
    }
 
    public int getRoomNumber() {
    	return roomNumber;
    }
    
    
//    public void setAllotedTo(Student_aw allotedTo) {
//           this.allotedTo = allotedTo;
//    }


	@Override
    public String toString() {
    return "Room [roomNumber=" + roomNumber + ", allotedTo=" + allotedTo.getName()+ "]";
    }   
}
