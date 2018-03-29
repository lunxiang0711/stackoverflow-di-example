package di.modified.autoscanned;

import org.springframework.stereotype.Component;

@Component("allotedTo")
public class Student_as {
    private String name = "joe bloggs";
    public String getName() {
           return name;
    }
    public void setName(String name) {
           this.name = name;
    } 	
}
