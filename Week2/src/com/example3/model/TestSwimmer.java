package com.example3.model;

import com.example3.model.Whale;
import com.example3.model.Swimmer;

public class TestSwimmer {

	public static void main(String[] args) {
		Swimmer beluga;
		
		beluga = new Whale();
		
		beluga.swim();
		
		beluga.dive();
		
		int feetTraveled = 80_000;
		System.out.println("So if the whales went " + feetTraveled + " feet, they " 
				+ "would have gone " + Swimmer.convertFromFeetToLeagues(feetTraveled) + " leagues.");

	}

}
