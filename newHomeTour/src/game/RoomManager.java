package game;

import fixtures.Room;

public class RoomManager {

	private Room[] rooms;
	private int numRooms;
	private Room startingRoom;
	
	public RoomManager(int numRooms) {
		this.numRooms = numRooms;
		this.rooms = new Room[this.numRooms];
	}
	
	public void init() {
		
		// room a
		Room roomA = new Room(
				"room a",
				"the first room",
				"a room with a window in it.");
		this.rooms[0] = roomA;
		
		// room b
		Room roomB = new Room(
				"room b",
				"the second room",
				"a room without a window in it.");
		this.rooms[1] = roomB;
		
		// initial room
		this.startingRoom = roomA;
		
		// define adjacent rooms
		roomA.setAdjacentRooms("NORTH", roomB);
		roomA.setAdjacentRooms("SOUTH", null);
		roomA.setAdjacentRooms("EAST", null);
		roomA.setAdjacentRooms("WEST", null);
		
		//
		roomB.setAdjacentRooms("SOUTH", roomA);
		roomB.setAdjacentRooms("NORTH", null);
		roomB.setAdjacentRooms("EAST", null);
		roomB.setAdjacentRooms("WEST", null);
		
	}
	
	//
	public Room getStartingRoom() {
		return this.startingRoom;
	}
	
} 
