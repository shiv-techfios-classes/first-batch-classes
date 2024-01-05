package com.oops.basics;

public class Shirt extends Item {
	
	
	//default constructor
	public Shirt() {
		super();
	}
	
	public Shirt(double price, String size) {
		
		this.price =price;
		this.size = size;
	}
	
	
	public Shirt(int id, String name, String description) {
		super(id, name, description);
		
	}	

	
	public Shirt(int id, String name, String description, double price, String size) {
	
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.size = size;
	}


	private double price;
	
	private String size;
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}


	@Override
	public String toString() {
		return "Shirt [price=" + price + ", size=" + size + ", id=" + id + ", name=" + name + ", description="
				+ description + "]";
	}



	
	

}
