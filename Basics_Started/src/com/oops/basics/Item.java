package com.oops.basics;

/**
 * 
 * @author shivj
 *
 *Item POJO
 */

public class Item {
	
	protected int id;
	protected String name;
	protected String description;
	

	public Item() {
		
	}
	public Item(int id, String name, String description) {
	//	super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int idx) {
		this.id = idx;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String itemname) {
		this.name = itemname;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String desc) {
		this.description = desc;
	}

	
	

}
