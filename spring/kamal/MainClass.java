package com.spring.kamal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
	public static void main(String[] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/kamal/configaration.xml");
		Employ learner1= (Employ) context.getBean("leraner1");
		System.out.println(learner1.getName());
		System.out.println(learner1.getPhoneNumber());
		System.out.println(learner1.getAddress());
		System.out.println(learner1.getCourse());
		
	}

}
