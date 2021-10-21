package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myTennisCoach")
@Component
public class TennisCoach implements Coach{

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	

	public TennisCoach() {
		System.out.println("inside constructor of TennisCoach without parameter");
	}



//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//	System.out.println("inside constructor of TennisCoach with parameter");
//		this.fortuneService = fortuneService;
//	}
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("inside setFortuneService");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println("inside doSomeCrazyStuff");
//		this.fortuneService = fortuneService;
//	}
	
	
	
	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "practice your backhand volley";
	}
	
	

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
