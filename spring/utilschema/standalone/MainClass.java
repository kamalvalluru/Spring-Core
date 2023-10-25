package com.spring.utilschema.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/utilschema/standalone/util.xml");
		
		Company c1=con.getBean("companay1", Company.class);
		
		//System.out.println(c1);
		//System.out.println(c2);
		
		//System.out.println(c1.getNames().getClass().getName());
		//System.out.println(c1);
		
		//System.out.println(c1.getProp().getClass().getName());

	}

}
