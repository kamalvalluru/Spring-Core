package com.spring.kamal;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employ 
{
	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employ(String name, List<String> phoneNumber, Set<String> address, Map<String, String> course) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.course = course;
	}
	private String name;
	private List<String> phoneNumber;
	private Set<String> address;
	private Map<String, String> course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Employ:: [name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + ", course=" + course
				+ "]";
	}
	
	

}
