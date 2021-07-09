package fixtures;

import java.util.HashMap;

public class Room extends Fixture{
	
	public HashMap<String, Room> adjacentRooms;
	
	// adjacent room array [N, S, E, W]
	// Room[] adjacentRooms;

	public Room (String name, String shortDesc, String longDesc) {
		super(name, shortDesc, longDesc);
		
		this.name = name;
		this.shortDesc = shortDesc;
		this.longDesc = longDesc;
		this.adjacentRooms.put("NORTH", null);
		this.adjacentRooms.put("SOUTH", null);
		this.adjacentRooms.put("EAST", null);
		this.adjacentRooms.put("WEST", null);
		
	}
	
	// isNull
	//public boolean isNull()
	
	//
	public void setAdjacentRooms(String direction, Room room) {
		this.adjacentRooms.put(direction, room);
	}
	
//	public void sestAdjacentRooms(String direction, Room room) {
//		switch(direction) {
//			case("NORTH"): {
//				this.adjacentRooms[0] = room;
//				break;
//			} 
//			case("SOUTH"): {
//				this.adjacentRooms[1] = room;
//				break;
//			}
//			case("EAST"): {
//				this.adjacentRooms[2] = room;
//				break;
//			}
//			case("WEST"): {
//				this.adjacentRooms[3] = room;
//				break;
//			}
//		}
//	}
	
	public Room getAdjacentRoom(String direction) {
		return this.adjacentRooms.get(direction);
	}
	
	
//	public Room getAdjacentRoom(String direction ) {
//		switch(direction) {
//			case("NORTH"): {
//				return this.adjacentRooms[0];
//				break;
//			} 
//			case("SOUTH"): {
//				return this.adjacentRooms[1];
//				break;
//			}
//			case("EAST"): {
//				return this.adjacentRooms[2];
//				break;
//			}
//			case("WEST"): {
//				return this.adjacentRooms[3];
//				break;
//			}
//		}
//	}
	
	//
	public String getShortDesc() {
		return this.shortDesc;
	}
	
	//
}
