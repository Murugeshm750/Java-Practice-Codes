package spring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Mobile m = ctx.getBean("mob", Mobile.class);
		System.out.println(m);
	}

}
