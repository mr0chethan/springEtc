package com.luv2code.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("prototypeBeanLifecycle-applicationContext.xml");

		Coach theTrackCoach = context.getBean("myTrackCoach",Coach.class);
		
		
		
		context.close();
		

	}

}

