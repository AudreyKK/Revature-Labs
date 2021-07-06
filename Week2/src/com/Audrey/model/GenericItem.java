package com.Audrey.model;

public class GenericItem {
	
	private int id;
	private String description;
	
	public GenericItem() {}
	
	public GenericItem(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
	public int getId() {return this.id;}
	
	public void setId(int id) {this.id = id;}
	
	public String getDescription() {return this.description;}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "GenericItem [id=" + id + ", description=" + description + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
