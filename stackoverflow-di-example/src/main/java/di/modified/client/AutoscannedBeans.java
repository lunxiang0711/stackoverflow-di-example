package di.modified.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.modified.autoscanned.Room_as;

public class AutoscannedBeans {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("autoscanned-beans.xml");
	
	public static void main(String[] args) {
		Room_as rm = context.getBean(Room_as.class);
		System.out.println(rm.toString());
		
	}	
}
