package com.kamal.withoutxml;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	static String name;
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		BusStop bs=context.getBean("busStop", BusStop.class);
		
		Config con=context.getBean(Config.class);
		
		con.sample();
		
	}
}
