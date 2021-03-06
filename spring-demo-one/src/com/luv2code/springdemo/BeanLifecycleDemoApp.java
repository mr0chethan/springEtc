package com.luv2code.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("prototypeBeanLifecycle-applicationContext.xml");

		Coach theTrackCoach = context.getBean("myTrackCoach",Coach.class);
		Coach alphaCoach = context.getBean("myTrackCoach",Coach.class);
		
		if(theTrackCoach==alphaCoach) {
			System.out.println("same");
		}
		else {
			System.out.println("different");
		}
		
		
		context.close();
		

	}

}

