package main;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Converter {
	static double poundsToKilogramsFactor = 2.20462;
	
	public static void mainMenu() {
		System.out.println("What kind of conversion would you like to make?");
		System.out.println("Select the bulleted number)");
		System.out.println("Conversion List: ");
		System.out.println("1. Weight");
		System.out.println("2. Volume");
		System.out.println("3. Distance");
		System.out.println("4. Currency");
		System.out.println("5. Quit");
		
	}
	
	// Validates input is a number and returns int which 
	// represents choice on the first selection menu
	public static int validateInput() {
		boolean validating = true;
		int resp = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (validating) {
			try {
				resp = scanner.nextInt();
			
				if (resp < 6 & resp > 0) {
					validating = false;
				} else {
					throw new NoSuchElementException();
				}
				
			} catch (NoSuchElementException ex){
				System.out.println("Please enter a valid number");
				scanner.nextLine();
				
			}
			
		
		}
		scanner.close();
		return resp;
	}

	
	// 
	public static void volumeMenu() {
		System.out.println("todo");
	}
	
	//
	public static void distanceMenu() {
		System.out.println("todo");
	}
	
	// 
	public static void currencyMenu() {
		System.out.println("todo");
	}
	
	
	//
	public static double pounds2kilos (String amount) {
		
		return Double.parseDouble(amount) * poundsToKilogramsFactor;
	}
	
	//
	public static void weightsMenu() {
		String input;
		
		System.out.println("Select what you want to convert: ");
		System.out.println("1. kg to pounds");
		System.out.println("2. oz to grams");
		System.out.println("3. Interplanetary weight conversion");
		
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		
		try {
			switch(input) {
				case "1": pounds2Kilos();
			}
		}catch (NoSuchElementException ex){
			System.out.println("Please enter a valid number");
			sc.nextLine();
		}
	}
	
	
	// Main loop
	public static void main(String[] args) {
		boolean running = true;
		int input;
		
		
		while(running) {
			
		
			// Selection Menu
			mainMenu();
			// Verify input is convertible from string to int
			input = validateInput();
			
			switch(input) {
				
				case 1: { 
					weightsMenu();
					break;
				}
				
				case 2: {
					volumeMenu();
					break;
				}
				
				case 3:{
					distanceMenu();
					break;
				}
				
				case 4: {
					currencyMenu();
					break;
				}
				
				case 5: break;
			}
			

			running = false;
			
			
		}

	}

}
