package main;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Converter {
	static double poundsToKilogramsFactor = 2.20462;
	static double ouncesToGramsFactor = 28.3495;
	static double gallonsToLitersFactor = 3.78541;
	static double cupsToTablespoonsFactor = 16.2307;
	static double cubicFootToQuartsFactor = 29.9221;
	static double milesToKilometersFactor = 1.60934;
	static double metersToFeetFactor = 3.28084;
	static double milesToNauticalMilesFactor = 0.86897626970789;
	static double poundsToDollarsFactor = 1.38;
	
	
	static final Scanner sc = new Scanner(System.in);
	
	public static double collectQuantity() {
		return sc.nextDouble();
	}
	
	public static void poundsToKilos(double pounds) {
		double result = pounds * poundsToKilogramsFactor;
		System.out.println("\n" + pounds + " pound(s) converts to ");
		System.out.println("" + result + " kilograms.\n");
	}
	
	public static void ozToGrams(double oz) {
		double result = oz * ouncesToGramsFactor;
		System.out.println("\n" + oz + " ounce(s) converts to ");
		System.out.println("" + result + " grams.\n");
	}
	
	public static void galToLiter(double gal) {
		double result = gal * gallonsToLitersFactor;
		System.out.println("\n" + gal + " gallon(s) converts to ");
		System.out.println("" + result + " liters.\n");
	}
	
	public static void cupToTbsp(double cup) {
		double result = cup * cupsToTablespoonsFactor;
		System.out.println("\n" + cup + " cup(s) converts to ");
		System.out.println("" + result + " grams.\n");
	}
	
	public static void cubFootToQuart(double cubicFeet) {
		double result = cubicFeet * cubicFootToQuartsFactor;
		System.out.println("\n" + cubicFeet + " cubic feet converts to ");
		System.out.println("" + result + " quart(s).\n");
	}
	
	public static void milesToKm (double miles){
		double result = miles * milesToKilometersFactor;
		System.out.println("\n" + miles + " mile(s) converts to ");
		System.out.println("" + result + " kilometer(s).\n");
	}
	
	public static void metersToFeet (double meters) {
		double result = meters * metersToFeetFactor;
		System.out.println("\n" + meters + " meter(s) converts to ");
		System.out.println("" + result + " feet.\n");
	}
	
	public static void milesToNauts (double miles) {
		double result = miles * milesToNauticalMilesFactor;
		System.out.println("\n" + miles + " miles(s) converts to ");
		System.out.println("" + result + " nautical mile(s).\n");
	}
	
	public static void poundsToDollars (double pounds) {
		
	}
	
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
		
		while (validating) {
			try {
				resp = sc.nextInt();
			
				if (resp < 6 & resp > 0) {
					validating = false;
				} else {
					throw new NoSuchElementException();
				}
				
			} catch (NoSuchElementException ex){
				System.out.println("Please enter a valid number");
				sc.nextLine();
				
			}
			
		
		}
		return resp;
	}

	
	// 
	public static void volumeMenu() {
		System.out.println("Select what you want to convert: ");
		System.out.println("1. Cups to tbsp");
		System.out.println("2. Gallons to liters");
		System.out.println("3. Cubic feet to quarts");
		
		sc.nextLine(); // get rid of lingering \n if present.
		String input = sc.nextLine();
		
		switch(input) {
			case "1": {
				System.out.println("Please enter the quantity you want converted");
				double resp = collectQuantity();
				cupToTbsp(resp);
				break;
			}
			case "2": { 
				System.out.println("Please enter the quanitity you want converted");
				double resp = collectQuantity();
				galToLiter(resp);
	
			}
			case "3": {
				System.out.println("Please enter the quanitity you want converted");
				double resp = collectQuantity();
				cubFootToQuart(resp);
			}
		}
	}
	
	//
	public static void distanceMenu() {
		System.out.println("Select what you want to convert: ");
		System.out.println("1. Miles to kilometers");
		System.out.println("2. Meters to feet");
		System.out.println("3. Miles to nautical miles");
		
		sc.nextLine(); // get rid of lingering \n if present.
		String input = sc.nextLine();
		
		switch(input) {
			case "1": {
				System.out.println("Please enter the distance you want converted");
				double resp = collectQuantity();
				milesToKm(resp);
				break;
			}
			case "2": { 
				System.out.println("Please enter the distance you want converted");
				double resp = collectQuantity();
				metersToFeet(resp);
				break;
			}
			case "3": {
				System.out.println("Please enter the distance you want converted");
				double resp = collectQuantity();
				milesToNauts(resp);
			}
		}
	}
	
	// 
	public static void currencyMenu() {
		System.out.println("Select what you want to convert: ");
		System.out.println("1. Miles to kilometers");
		System.out.println("2. Meters to feet");
		System.out.println("3. Miles to nautical miles");
		
		sc.nextLine(); // get rid of lingering \n if present.
		String input = sc.nextLine();
		
		switch(input) {
			case "1": {
				System.out.println("Please enter the quantity of currency you want converted");
				double resp = collectQuantity();
				poundsToDollars(resp);
				break;
			}
			case "2": { 
				System.out.println("Please enter the quantity of currency you want converted");
				double resp = collectQuantity();
				dollarsToPesos(resp);
				break;
	
			}
			case "3": {
				System.out.println("Please enter the quantity of currency you want converted");
				double resp = collectQuantity();
				dollarsToRupees(resp);
			}
		}
	}
	
	
	//
	public static void weightsMenu() {
		String input;
		
		System.out.println("Select what you want to convert: ");
		System.out.println("1. kg to pounds");
		System.out.println("2. oz to grams");
		System.out.println("3. Interplanetary weight conversion");
		
		sc.next(); // get rid of lingering \n if present.
		input = sc.nextLine();
		
		switch(input) {
			case "1": {
				System.out.println("Please enter the quantity you want converted");
				double resp = collectQuantity();
				poundsToKilos(resp);
				break;
			}
			case "2": { 
				System.out.println("Please enter the quanitity you want converted");
				double resp = collectQuantity();
				ozToGrams(resp);
	
			}
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
				
				case 5: running = false;
				break;
			}
			

			// refactor
			if (input != 5) {
				System.out.println("\nRun program again? Y/N\n");
				//sc.next(); // clear buffer
				String resp = sc.next();
				if (resp.equals(String.valueOf('N'))) {
					running = false;
				}
			}
			// end refactor
			
			
		}
		sc.close();
		System.out.println("Exited program.");
	}

}
