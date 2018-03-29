

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import di.modified.autowired.Room_aw;
import di.modified.autowired.Student_aw;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {
					"file:src/main/resources/autowired-beans.xml"
			}
		)
public class AutowiredBeansTest {

	@Autowired
	private ApplicationContext context;
	
	@Test
	public void test() {
		Student_aw st = (Student_aw) context.getBean("student");
		assertEquals("joe bloggs", st.getName()); 
		
		Room_aw rm = (Room_aw) context.getBean("room");
		assertEquals(101, rm.getRoomNumber());
	}

}
