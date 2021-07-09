package game;

import java.util.Scanner;

public class Input {
	
	// valid commands
	public static String[] commands = {"GO", "WALK"};
	// valid direction
	public static String[] directions = {"NORTH", "SOUTH", "EAST", "WEST"};
	
	public static boolean inArray(String s, String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == s) {
				return true;
			}
		}
		return false;
	}
	
	public static String[] collectInput(Scanner s) {
		String[] input = new String[8];
		
		input = s.nextLine().split("\\s");
		
		return input;
	}
	
	public static void parse(String[] input, Player player) {
		if (input.length == 2) {
			String action = input[0].toUpperCase().intern();
			String direction = input[1].toUpperCase().intern();
			
			if (inArray(action, commands)) {
				if (inArray(direction, directions)) {
						switch(direction) {
							case("NORTH"): {
								if (player.getCurrentRoom().getAdjacentRoom("NORTH") == null) {
									System.out.println("You can't go in that direction.");
								} else {
									player.setCurrentRoom(
											player.getCurrentRoom().getAdjacentRoom("NORTH"));
								}
								break;
							}
							case("SOUTH"): {
								if (player.getCurrentRoom().getAdjacentRoom("SOUTH") == null) {
									System.out.println("You can't go in that direction.");
								} else {
								player.setCurrentRoom(
										player.getCurrentRoom().getAdjacentRoom("SOUTH"));
								}
								break;
							}
							case("EAST"): {
								if (player.getCurrentRoom().getAdjacentRoom("EAST") == null) {
									System.out.println("You can't go in that direction.");
								} else {
								player.setCurrentRoom(
										player.getCurrentRoom().getAdjacentRoom("EAST"));
								}
								break;
							}
							case("WEST"): {
								if (player.getCurrentRoom().getAdjacentRoom("NORTH") == null) {
									System.out.println("You can't go in that direction.");
								} else {
								player.setCurrentRoom(
										player.getCurrentRoom().getAdjacentRoom("WEST"));
								}
								break;
							}
						}
					} else {
						System.out.println("Sorry, I didn't understand that direction.");
					}
				}
			
			
			
		} else {
			System.out.println("Sorry, I didn't understand that command.");
		}
		
	}
}
