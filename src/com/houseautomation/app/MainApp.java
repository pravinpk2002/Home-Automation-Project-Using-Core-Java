package com.houseautomation.app;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.houseautomation.devices.Chandler;
import com.houseautomation.devices.LED;
import com.houseautomation.devices.MusicPlayer;
import com.houseautomation.devices.Television;

public class MainApp {

	
	public static void main(String[] args) {


		
		HomeAutomationService service = new HomeAutomationService();
	
		service.start();
		
		
		
		
		

	}
}
