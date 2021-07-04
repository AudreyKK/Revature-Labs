package com.yourname.model;

public class FlyingVehicle extends Vehicle{
	private short wings;
	private Engine engine;
	
	//constructor
	public FlyingVehicle() {};
	
	public FlyingVehicle(short wings, Engine engine) {
		this.wings = wings;
		this.engine = engine;
	}
	
	//getters and setters
	public short getWings() {return this.wings;}
	public void setWings(short wings) {this.wings = wings;}
	
	public Engine getEngine() {return this.engine;}
	public void setEngine(Engine engine) {this.engine = engine;}
	
	public void fly() {
		System.out.println("FlyingVehicle is flying...");
	}
	
	public void refuel() {
		System.out.println("FlyingVehicle is refueling...");
	}
	
	public void liftOff() {
		System.out.println("FlyingVehicle is lifting off...");
	}
	
	public void land() {
		System.out.println("FlyingVehicle is landing...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
