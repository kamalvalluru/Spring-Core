package com.spring.kamal.componet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class People
{
	@Value(value="10")
	private int count;
	@Value(value="Kamal")
	private String name;
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "People [count=" + count + ", name=" + name + "]";
	}
}
