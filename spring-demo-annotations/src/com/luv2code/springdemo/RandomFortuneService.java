package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private Random random = new Random();
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		
//		int ans=(int) (Math.random()*10);
		int ans = random.nextInt(10);
		return ""+ans;
	}

}
