package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach=context.getBean("myBaseBallCoach", Coach.class);
		System.out.println(theCoach.getDailyWork());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
