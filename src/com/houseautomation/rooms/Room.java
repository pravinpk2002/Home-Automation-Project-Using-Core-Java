package com.houseautomation.rooms;

import java.util.ArrayList;
import java.util.List;

import com.houseautomation.devices.Device;

public class Room {
	
	public String roomType;
	public ArrayList<Device> device;
	public Room(String roomType) {
	
		this.roomType = roomType;
		this.device = new ArrayList<Device>();
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public ArrayList<Device> getDevice() {
		return device;
	}
	public void setDevice(ArrayList<Device> device) {
		this.device = device;
	}
	
	public void displayDevice() {
		
		System.out.println("Devices in "+ roomType);
		int count = 1;
		for(Device d : device) {
			System.out.println(count+")"+d.getDeviceName());
			count++;
		}
		
	}
	
	
	
	public void addDevice(Device device) {
		
		this.device.add(device);
		
	}
	
	public Device getDevice(int index) {
		return device.get(index);
	}
	
	
	public int getDeviceCount() {
		return device.size();
	}
	
	
	

}
