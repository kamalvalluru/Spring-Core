package com.spring.construct;

public class Person
{
	private int personId;
	private String personName;
	private Example name;
	


	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", name=" + name + "]";
	}
	public Person(int personId, String personName, Example name) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.name = name;
	}
	

}
