package exampleOne;

public class ExampleOne {

	public static void main(String[] args) {
		boolean on = false;
		
		while(on) {
			System.out.println("Inside the while loop");
			//on = false;
		}
		
		do {
			System.out.println("Inside the do-while loop");
		} while (on);

	}

}
