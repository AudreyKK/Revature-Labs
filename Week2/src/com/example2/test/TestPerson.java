package com.example2.test;

import com.example2.Person;
import com.example2.Developer;

public class TestPerson {

	public static void main(String[] args) {
		Person adam = new Developer();
		
		adam.setName("Adam");
		System.out.println(adam.getName());
		

	}

}
