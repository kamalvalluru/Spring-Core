package com.spring.kamal.anotaion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSchool 
{
	public static void main(String[] args)
	{
		ApplicationContext context =new ClassPathXmlApplicationContext("com/spring/kamal/anotaion/anatoconfig.xml");
		
		School s1=context.getBean("id1", School.class);
		
		System.out.println(s1);
	}

}
