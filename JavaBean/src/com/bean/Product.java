package com.bean;

public class Product {
	private int pid;
	private String pname;
	private float price;
	
	//explicitly defined default/empty constructor exists by default of no other constructor is defined
	public Product() {
		super();
	}
	
	//constructor overloading - polymorphism. We can create as many constructors as we want

	//once you write parameter constructor, now the default constructor does not exist unless you explicitly define it
	public Product(int pid, String pname, float price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	//to get the original toString method you can use super.toString()
	@Override
	public String toString() {
		return "what is this Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]"+super.toString();
	}

	
}
