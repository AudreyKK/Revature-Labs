package com.yourname.model;

public class Airplane extends FlyingVehicle{
	private short wheels;
	private short propellers;
	
	//constructor
	public Airplane(short wheels, short propellors) {
		super();
		
		this.wheels = wheels;
		this.propellers = propellors;
	}
	
	//getters and setters
	public short getWheels() {return this.wheels;}
	public void setWheels(short wheels) {this.wheels = wheels;}
	
	public short propellers() {return this.propellers;}
	public void setPropellers(short propellers) {this.propellers = propellers;}
	
	public void turn() {
		System.out.println("Turning...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
