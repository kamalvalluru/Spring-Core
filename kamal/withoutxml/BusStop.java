package com.kamal.withoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BusStop
{
	//@Value("100")
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String busName(String name)
	{
		return name;
		
	}

	
	
}
