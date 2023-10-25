package com.spring.kamal.componet;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myobj")
@Scope("prototype")
public class Shopping 
{
	@Value(value="Bingo")
	private String products;
	@Value(value="20")
	private  int price;
	
	@Value("#{temp}")
	private List<String> brands;
	
	
	
	public List<String> getBrands() {
		return brands;
	}
	public void setBrands(List<String> brands) {
		this.brands = brands;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shopping [products=" + products + ", price=" + price + ", brands=" + brands + "]";
	}
	
	}
	
