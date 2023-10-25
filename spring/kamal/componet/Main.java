package com.spring.kamal.componet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/kamal/componet/stero.xml");
		
		
		Shopping s1=con.getBean("myobj",Shopping.class);
		//System.out.println(s1);
		Shopping s2=con.getBean("myobj", Shopping.class);
		
		System.out.println("The HashCode for the S1 Variable is"+""+s1.hashCode()); 
		//940857381 This is the hash code for this  
	    // refernce variable in  a single tone.....

		System.out.println("The HashCode for the S1 Variable is"+" "+s2.hashCode());   //940857381 This is the hash code for this 
		   									// refernce variable in  a single tone.....
		
	/*
	 * In the single tone scope the only one object is created for the multiple reference 
	 * variables which will make the high securituy
	 */
		
		People p1=con.getBean("people1", People.class);
		
		System.out.println("The HashCode for the P1 Refernce variable is"+" "+p1.hashCode());
		
		People p2=con.getBean("people1", People.class);
		
		System.out.println("The HashCode for the P2 Refernce variable is"+" "+p2.hashCode()); 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
