package com.luv2code.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean{

	// define private field for dependency (helper)
	private FortuneService fortuneService;
	
	/**
	 * @param fortuneService
	 */
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public TrackCoach() {
	}
	
	

	// define constructor for dependency injection
	/*
	 * public TrackCoach(FortuneService theFortuneService) { this.fortuneService =
	 * theFortuneService; }
	 */
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		// use fortuneService to get a fortune
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// init method
	
	public void doMyStartupStuff() {
		System.out.println("inside init method");
	}
	
	// destroy method
	
	public void doMyCleanupStuff() {
		System.out.println("inside destroy method");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inside disposable prototype bean method");
		
	}
	
	

}
