package com.luv2code.springdemo;

public class HappyFortuneService implements FortuneService {
	private int[] fortuneArray = {7,8,9};
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int fortune = fortuneArray[(int)(Math.random()*fortuneArray.length)];
		return "Today is your lucky day " + fortune;
	}

}
