

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.Room;

public class InnerBeansTest {
	
	private ApplicationContext context = new ClassPathXmlApplicationContext("plain-beans.xml");
	
	@Test
	public void test() {
		Room rm = (Room) context.getBean("room");
//		assertEquals("joe bloggs", rm.allotedTo.getName());
		assertEquals(101, rm.getRoomNumber());
	
	}

}
