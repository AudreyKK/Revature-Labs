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
	static double dollarsToPesosFactor = 19.85;
	static double dollarsToRupeesFactor = 74.52;
	
	// Planets' Gravity Factors
	static double mercury = 0.378;
	static double venus = 0.907;
	static double moon = 0.166;
	static double mars = 0.377;
	static double jupiter = 2.36;
	static double saturn = 0.916;
	static double uranus = 0.889;
	static double neptune = 1.12;
	static double pluto = 0.071;
	
	static final Scanner sc = new Scanner(System.in);
	
	public static double collectQuantity() {
		return sc.nextDouble();
	}
	
	public static String collectUnits () {
		boolean deciding = true;
		String returnString = "";
		
		while (deciding) {
			System.out.println("\n First, are you using kilograms or pounds?\n");
			System.out.println("1. kg");
			System.out.println("2. lb");
			int input = sc.nextInt();
		if (input == 1) {
			returnString = "kg";
			deciding = false;
		}else if (input == 2) {
			returnString = "lb";
			deciding = false;
		}else {
			System.out.println("Please type a valid input.");
		}
		
		}
		
		return returnString;
		
	}
	
	public static void earthToMercury(double weight, String unit) {
		double result = weight * mercury;
		System.out.println("" + weight + " " + unit + " on Earth is equivalent to ");
		System.out.println("" + result + " " + unit + " on Mercury.");
	}
	
	public static void earthToVenus(double weight, String unit) {
		double result = weight * venus;
		System.out.println("" + weight + " " + unit + " on Earth is equivalent to ");
		System.out.println("" + result + " " + unit + " on Venus.");
	}
	
	public static void earthToMoon(double weight, String unit) {
		double result = weight * moon;
		System.out.println("" + weight + " " + unit + " on Earth is equivalent to ");
		System.out.println("" + result + " " + unit + " on the Moon.");
	}
	
	public static void earthToMars(double weight, String unit) {
		double result = weight * mars;
		System.out.println("" + weight + " " + unit + " on Earth is equivalent to ");
		System.out.println("" + result + " " + unit + " on Mars.");
	}
	
	public static void earthToJupiter(double weight, String unit) {
		double result = weight * jupiter;
		System.out.println("" + weight + " " + unit + " on Earth is equivalent to ");
		System.out.println("" + result + " " + unit + " on Jupiter.");
	}
	
	public static void earthToSaturn(double weight, String unit) {
		double result = weight * saturn;
		System.out.println("" + weight + " " + unit + " on Earth is equivalent to ");
		System.out.println("" + result + " " + unit + " on Saturn.");
	}
	
	public static void earthToUranus(double weight, String unit) {
		double result = weight * uranus;
		System.out.println("" + weight + " " + unit + " on Earth is equivalent to ");
		System.out.println("" + result + " " + unit + " on Uranus.");
	}
	
	public static void earthToNeptune(double weight, String unit) {
		double result = weight * neptune;
		System.out.println("" + weight + " " + unit + " on Earth is equivalent to ");
		System.out.println("" + result + " " + unit + " on Neptune.");
	}
	
	public static void earthToPluto(double weight, String unit) {
		double result = weight * pluto;
		System.out.println("" + weight + " " + unit + " on Earth is equivalent to ");
		System.out.println("" + result + " " + unit + " on Pluto.");
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
		double result = pounds * poundsToDollarsFactor;
		System.out.println("\n" + pounds + " pound(s) converts to ");
		System.out.println("" + result + " dollar(s).\n");
	}
	
	public static void dollarsToPesos (double dollars) {
		double result = dollars * dollarsToPesosFactor;
		System.out.println("\n" + dollars + " dollar(s) converts to ");
		System.out.println("" + result + " peso(s).\n");
	}
	
	public static void dollarsToRupees (double dollars) {
		double result = dollars * dollarsToRupeesFactor;
		System.out.println("\n" + dollars + " dollar(s) converts to ");
		System.out.println("" + result + " rupees.\n");
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
				break;
	
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
		System.out.println("1. British pounds to US dollars");
		System.out.println("2. US Dollars to Mexican Pesos");
		System.out.println("3. US Dollars to Indian Rupees");
		
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
	public static void spaceMenu() {
		int input;
		double mass;
		
		System.out.println("\nSelect an option to see how gravity affects weight");
		System.out.println("on other planets.\n");
		System.out.println("1. Mercury");
		System.out.println("2. Venus");
		System.out.println("3. The moon");
		System.out.println("4. Mars");
		System.out.println("5. Jupiter");
		System.out.println("6. Saturn");
		System.out.println("7. Uranus");
		System.out.println("8. Neptune");
		System.out.println("9. Pluto");
		
		input = sc.nextInt();
		
		String unit = collectUnits();
		
		System.out.println("Input the quantity of mass you're converting.");
		sc.nextLine();
		mass = sc.nextDouble();
		
		switch(input) {
			case 1: {
				earthToMercury(mass, unit);
				break;
			}
			case 2: {
				earthToVenus(mass, unit);
				break;
			}
			case 3: {
				earthToMoon(mass, unit);
				break;
			}
			case 4: {
				earthToMars(mass, unit);
				break;
			}
			case 5: {
				earthToJupiter(mass, unit);
				break;
			}
			case 6: {
				earthToSaturn(mass, unit);
				break;
			}
			case 7: {
				earthToUranus(mass, unit);
				break;
			}
			case 8: {
				earthToNeptune(mass, unit);
				break;
			}
			case 9: {
				earthToPluto(mass, unit);
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
		
		sc.nextLine(); // get rid of lingering \n if present.
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
				break;
	
			}
			case "3": {
				spaceMenu();
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
