package di.modified.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.modified.autowired.Room_aw;

public class AutowiredBeans {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("autowired-beans.xml");
	
	public static void main(String[] args) {
		Room_aw rm = (Room_aw) context.getBean("room");
		System.out.println(rm.toString());
	}	
}
