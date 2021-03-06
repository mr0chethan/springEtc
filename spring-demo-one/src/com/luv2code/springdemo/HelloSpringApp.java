package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// Retrieve bean from container
		Coach theBasketballCoach = context.getBean("myBasketballCoach",Coach.class);// bean id, interface name
		Coach theTrackCoach = context.getBean("myTrackCoach",Coach.class);
		
		// call methods on bean
		System.out.println(theBasketballCoach.getDailyWorkout());
		System.out.println(theTrackCoach.getDailyWorkout());
		
		// new method
		System.out.println(theBasketballCoach.getDailyFortune());
		System.out.println(theTrackCoach.getDailyFortune());
		
		
		// close context
		context.close();
	}

}
