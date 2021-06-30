package main;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Converter {
	
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
	public static void weightsMenu() {
		System.out.println("Select what you want to convert: ");
		System.out.println("1. ");
	}
	
	
	// Main loop
	public static void main(String[] args) {
		boolean running = true;
		
		
		while(running) {
			
		
			// Selection Menu
			mainMenu();
			// Verify input is convertible from string to int
			validateInput();
			

			running = false;
			
			
		}

	}

}
