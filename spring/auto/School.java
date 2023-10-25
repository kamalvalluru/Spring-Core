package com.spring.auto;

public class School
{
	private Student section;
	private Student section2;
	private Student section3;
	
	

	public School(Student section, Student section2, Student section3) {
		super();
		this.section = section;
		this.section2 = section2;
		this.section3 = section3;
	}
	public School() 
	{
		super();
	}
	public Student getSection() {
		return section;
	}

	public void setSection(Student section) {
		this.section = section;
	}
	

	public Student getSection2() {
		return section2;
	}

	public void setSection2(Student section2) {
		this.section2 = section2;
	}

	@Override
	public String toString() {
		return "School [section=" + section + ", section2=" + section2 + ", section3=" + section3 + "]";
	}
	public Student getSection3() {
		return section3;
	}
	public void setSection3(Student section3) {
		this.section3 = section3;
	}

}
