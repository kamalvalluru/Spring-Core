package com.spring.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClas
{
	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("/SpringProject/src/main/java/com/spring/reference/refer.xml");
		 A a1=(A)context.getBean("refa");
		 
		 System.out.println(a1);
		 System.out.println(a1.getZ().getY());
		
	}

}
