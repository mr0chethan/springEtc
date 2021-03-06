package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService ;
	private String emailAddress;
	private String team;
	
	// create a no argument constructor
	public CricketCoach() {
		System.out.println("inside no argument constructor of CricketCoach");
	}
	
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter method CricketCoach fortuneService");
		this.fortuneService = fortuneService;
	}
	
	


	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter method of CricketCoach emailAddress");
		this.emailAddress = emailAddress;
	}


	public void setTeam(String team) {
		System.out.println("inside setter method of CricketCoach team");
		this.team = team;
	}

	

	public String getEmailAddress() {
		return emailAddress;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "There is nothing other than cricket. " + fortuneService.getFortune();
	}

}
