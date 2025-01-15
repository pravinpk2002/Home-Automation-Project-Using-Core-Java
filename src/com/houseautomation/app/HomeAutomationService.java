package com.houseautomation.app;

import java.time.LocalTime;
import java.util.Scanner;

import com.houseautomation.devices.AirConditioner;
import com.houseautomation.devices.Chandler;
import com.houseautomation.devices.Device;
import com.houseautomation.devices.LED;
import com.houseautomation.devices.MusicPlayer;
import com.houseautomation.devices.Television;
import com.houseautomation.rooms.House;
import com.houseautomation.rooms.Room;

public class HomeAutomationService {
	
	private Scanner scanner = new Scanner(System.in);
	private House house = new House();
	
	
	public void start() {
		dummyData();
		mainMenu();
	}
	
	public void mainMenu() {
		
		int choice = 0;
		do {
			System.out.println("****FBS Home Automation****");
			System.out.println("1)Add Rooms");
			System.out.println("2)View Rooms");
			System.out.println("3)Exit ");
			System.out.println("Enter your choice ");
			choice = scanner.nextInt();
					
					switch(choice) {
					case 1:
						addRoom();
						break;
					case 2:
						viewRooms();
						break;
					case  3:
						System.out.println("App closing ..........");
						return;
					default:
						System.out.println("Enter valid choice");
					}
		}while(choice != 3);
		
	}
	
	
	public void addRoom() {
		int choice = 0;
		do {
			System.out.println("-----------------------------------");
			String roomtype=null;
			System.out.println("****FBS Home Automation****");
			
			System.out.println("1)Kitchen  \n2) Living area  \n3)Dining area  \n4)Bedroom \n5)WashRoom \n 6)Corridors ");
			System.out.println("7) cancel");
			System.out.println("Enter Rooom type");
			switch(choice) {
			case 1:
				roomtype = "Kitchen";
				break;
			case 2:
				roomtype = "Living Area";
				break;
			case 3:
				roomtype = "Dining area";
				break;
			case 4:
				roomtype = "Bedroom";
				break;
			case 5:
				roomtype = "WashRoom";
				break;
			case 6:
				roomtype = "Corridors";
				break;
			default:
				System.out.println("Enter valid choice !!!!");	
			}
			
			if (choice<7 && choice>0) {
				house.addRoom(roomtype);
				return;
			}

		}while(choice != 7);
	}
	
	
	public void viewRooms() {
		
		int room=0;
		int roomCount = house.getRoomCount();
		
		
		do {
			System.out.println("-----------------------------------");
			house.displayRooms();
			System.out.println((roomCount+1)+") Exit ");
			System.out.println("Enter Room No to  continue :");
			room = scanner.nextInt();
			
			if(room < 1 && room > roomCount)
				System.out.println("Enter valid  Room No !!!!!!!!");
			else  if(room == roomCount + 1) {
				System.out.println("redirecting to main menu ........");
				return;
			}else {
				viewDevice(house.getRoom(room-1));
				return;
			}
				
			
		}while(room != roomCount + 1);
		
		
	}
	
	
	public void viewDevice(Room room) {
		System.out.println("-----------------------------------");
		int choice = 0;
		do {
			System.out.println("-----------------------------------");
			System.out.println("Available Devices : ");
			room.displayDevice();
			System.out.println("----------------------------");
			System.out.println("1) Add Device ");
			System.out.println("2) Operate Device");
			System.out.println("3) Exit ");
			System.out.println("select choice");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				addDevice(room);
				break;
			case 2:
				int choice2=0;
				int deviceCount = room.getDeviceCount();
				do {
					room.displayDevice();
					System.out.println((deviceCount+1)+") Exit");
					System.out.println("select device to operate");
					
					choice2 = scanner.nextInt();
					if(choice2 < deviceCount+1 && choice2 > 0) {
						operateDevice(room.getDevice(choice2-1));
					}else if(choice2 == deviceCount+1)
						return;
					else
						System.out.println("Enter valid choice......");
				}while(choice2 != deviceCount+1);
				break;
			case 3:
				return;
			 default:
				System.out.println("Enter valid choice");
			}
			
		}while(choice != 3);
		
	}
	
	public void addDevice(Room room) {
		
		int choice=0;
		do {
			System.out.println("-----------------------------------");
			System.out.println("Devices");
			System.out.println("1) TV\n2) AC \n3)LED\n4)Music Player ");
			System.out.println("5) Exit");
			System.out.println("Which device you want to add ");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				room.addDevice(new Television("Toshiba", "t678j"));
				break;
			case 2:
				room.addDevice(new AirConditioner("Voltas", "m89kj9"));
				break;
			case 3:
				room.addDevice(new LED("syska", "893hj"));
				break;
			case 4:
				room.addDevice(new MusicPlayer("Boat", "b9990"));
				break;
			case 5:
				return;
			default:
				System.out.println("Enter valid choice .......");
			}
			
			if(choice < 5 && choice > 0) {
				System.out.println("device added successfully............");
			}
			
		}while(choice != 5);
		
	}
	
	
	public void operateDevice(Device device) {
		
		int choice=0;
		
		do {
			System.out.println("-----------------------------------");
			System.out.println("1) turn ON");
			System.out.println("2) turn OFF");
			System.out.println("3) check status");
			System.out.println("4) Exit");
			
			choice =scanner.nextInt();
			
			switch(choice) {
			case 1:
				device.turnOn();
				break;
			case 2:
				device.turnOff();
				break;
			case 3:
				device.checkStatus();
				break;
			case 4:
				return;
			default:
				System.out.println("Enter valid choice......");
			}
			
			
		}while(choice != 4);
		
		
	}
	public void dummyData() {
		LocalTime time2 = LocalTime.of(15, 30, 40);
		
		house.addRoom("kitchen");

		house.addRoom("Living Area");
		house.addRoom("Bedroom");
		house.addRoom("Corridors");
		house.addRoom("WashRoom");
		
	
		
		LED led = new LED("philips", "ph7898b");
		Chandler chd = new Chandler("wipro", "whj700");
		MusicPlayer mp = new MusicPlayer("sony", "sn908u");
		mp.setState(true);
		mp.setPreviousStateTime(time2);
		house.getRoom(2).addDevice(led);
		house.getRoom(2).addDevice(chd);
		
	
		
		house.getRoom(3).addDevice(led);
		house.getRoom(3).addDevice(chd);
		house.getRoom(3).addDevice(mp);
	
	
		
	}

}
