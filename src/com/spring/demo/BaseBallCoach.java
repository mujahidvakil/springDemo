package com.spring.demo;

public class BaseBallCoach implements Coach {
	private Fortune fortune;

	public BaseBallCoach(Fortune fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return "daily work on 5hr in this fields";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortuneSrvice();
	}

}
