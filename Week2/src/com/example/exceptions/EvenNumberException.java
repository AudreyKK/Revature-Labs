package com.example.exceptions;

public class EvenNumberException extends Exception{
	
	@Override
	public String getMessage() {
		return "You cannot input an even number.";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
