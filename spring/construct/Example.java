package com.spring.construct;

public class Example
{
	private String name;
	

	public Example(String name) {
		//super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Example [name=" + name + "]";
	}
	

}
