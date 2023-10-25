package com.kamal.withoutxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan(basePackages = "com.kamal.withoutxml")
public class Config 
{
	
	public void sample()
	{
		System.out.println("Heloo");
		
	}
}
