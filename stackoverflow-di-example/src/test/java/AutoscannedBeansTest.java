

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import di.modified.autoscanned.Room_as;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
			locations = {
					"file:src/main/resources/autoscanned-beans.xml"
			}
		)
public class AutoscannedBeansTest {

	@Autowired
	private ApplicationContext context;
	
	@Test
	public void test() {
		Room_as rm = context.getBean(Room_as.class);
		assertEquals(101, rm.getRoomNumber());
		assertEquals("joe bloggs", rm.getAllotedTo().getName());
	}

}
