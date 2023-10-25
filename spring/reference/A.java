package com.spring.reference;

public class A
{
	private int x;
	private B z;
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int x, B z) {
		super();
		this.x = x;
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getZ() {
		return z;
	}
	public void setZ(B z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", z=" + z + "]";
	}
	

}
