package com.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/auto/autoconfig.xml");
		
		
		School s1=context.getBean("school1", School.class);
		
		System.out.println(s1.getSection().toString());
		System.out.println(s1.getSection2().toString());
		System.out.println(s1.getSection3().toString());
		
	}

}
