package com.houseautomation.app;

import com.houseautomation.devices.Chandler;
import com.houseautomation.devices.LED;
import com.houseautomation.rooms.House;

public class AppTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		House h = new House();
		
	
		h.addRoom("kitchen");

		h.addRoom("Living Area");
		h.addRoom("Bedroom");
		h.addRoom("Corridors");
		h.addRoom("WashRoom");
		
		h.displayRooms();
		
		LED led = new LED("philips", "ph7898b");
		Chandler chd = new Chandler("wipro", "whj700");
		
		h.getRoom(2).addDevice(led);
		h.getRoom(2).addDevice(chd);
		
		
		System.out.println("******************");
		h.getRoom(2).displayDevice();
		
		
		h.getRoom(3).addDevice(led);
		h.getRoom(3).addDevice(chd);
		System.out.println("******************");
		h.getRoom(3).displayDevice();
		System.out.println("******************");
		h.getRoom(2).getDevice(0).checkStatus();
		
		

	}

}
