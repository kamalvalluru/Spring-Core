package com.spring.construct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass
{
	public static void main(String[] args)
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/construct/construct.xml");
		
		Person p1=(Person) context.getBean("person1");
		System.out.println(p1);
	}

}
