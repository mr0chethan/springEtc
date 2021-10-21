package com.luv2code.springdemo;

public class MyApp {
	
	public static void main(String[] args) {
		Coach theBasketballCoach = new BaseballCoach();
		Coach theTrackCoach = new TrackCoach();
		System.out.println(theBasketballCoach.getDailyWorkout());
		System.out.println(theTrackCoach.getDailyWorkout());
	}
}
