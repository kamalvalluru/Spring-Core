package com.spring.kamal.anotaion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class School 
{
	
	//@Autowired
	//@Qualifier("details2")
	private Student details;
	
	
	public School() {
		super();
	}
	
	//@Autowired
	
	public School(Student details)
	{
		super();
		System.out.println("This is inside Constructor");
		this.details = details;
	}

	public Student getDetails() {
		return details;
	}
	
	@Autowired
	@Qualifier("details2")
	public void setDetails(Student details) 
	{
		System.out.println("Inside the Setter Method");
		this.details = details;
	}

	@Override
	public String toString() {
		return "School::== [details=" + details + "]";
	}

}
