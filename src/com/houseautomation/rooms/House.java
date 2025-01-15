package com.houseautomation.rooms;

import java.util.ArrayList;
import java.util.Iterator;

public class House {
	
	
	private ArrayList<Room> room;
	
	
	
	public House() {
		// TODO Auto-generated constructor stub
		
		room = new ArrayList<Room>();
		
	}
	
	
	
	public void addRoom(String roomType) {
		this.room.add(new Room(roomType));
	}
	
	public void displayRooms() {
		
		System.out.println("Rooms you have ");
		int count =1;
		for ( Room room : room) {
			System.out.println(count+")"+room.getRoomType());
			count++;
		}
			
		
	}
	
	public Room getRoom(int index) {
		return room.get(index);
	}



	public ArrayList<Room> getRoom() {
		return room;
	}



	public void setRoom(ArrayList<Room> room) {
		this.room = room;
	}



	public int getRoomCount() {
		return room.size();
	}



	

}
