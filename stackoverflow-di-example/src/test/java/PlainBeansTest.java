

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.Room;
import di.Student;

public class PlainBeansTest {

	private ApplicationContext context = new ClassPathXmlApplicationContext("plain-beans.xml");

	@Test
	public void test() {
		Student st = (Student) context.getBean("student");
		assertEquals("joe bloggs", st.getName());
		Room rm = (Room) context.getBean("room");
		assertEquals(101, rm.getRoomNumber());
		
	}

}
