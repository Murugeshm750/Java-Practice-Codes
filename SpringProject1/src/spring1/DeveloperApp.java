package spring1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeveloperApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		JavaDeveloper jd = ctx.getBean("jd",JavaDeveloper.class);
		jd.work();
		jd.project();
		
		SE se = ctx.getBean("se",SE.class);
		se.activity(jd);
	
	}

}
