package com.spring.auto;

public class Student 
{
	private String name;
	private int rollNo;
	
	public Student()
	{
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString () {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	

}
