package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Coach theTennisCoach = context.getBean("myTennisCoach", Coach.class);
		
		Coach theTennisCoach = context.getBean("tennisCoach", Coach.class);
		
//		Coach theTennisCoach = context.getBean("myTennisCoach", Coach.class);
		
		System.out.println(theTennisCoach.getDailyworkout());
		System.out.println(theTennisCoach.getDailyFortune());
		
		context.close();
		
		

	}

}
