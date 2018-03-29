package di.client_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di.Room;

public class PlainBeans {
	
	private static ApplicationContext context = new ClassPathXmlApplicationContext("plain-beans.xml");
	
	public static void main(String[] args) {
		Room rm = (Room) context.getBean("room");
		System.out.println(rm.toString());
		
	}
}
