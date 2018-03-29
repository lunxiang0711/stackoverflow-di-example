package di.modified.autoscanned;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("room")
public class Room_as {
    private int roomNumber = 101;
    @Autowired
    private Student_as allotedTo;      

    public int getRoomNumber() {
           return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
           this.roomNumber = roomNumber;
    }
    public Student_as getAllotedTo() {
           return allotedTo;
    }
    public void setAllotedTo(Student_as allotedTo) {
           this.allotedTo = allotedTo;
    }
    @Override
    public String toString() {
    return "Room [roomNumber=" + roomNumber + ", allotedTo=" + allotedTo.getName()
                        + "]";
    }   
}
