package spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
public static void main(String[] args) {
	
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
	StudentApp stp =ctx.getBean("stp",StudentApp.class);
	System.out.println(stp);
}
}
