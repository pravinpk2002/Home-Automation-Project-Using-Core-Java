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
//		LocalTime time1 = LocalTime.now();
//		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
////		System.out.println(time1.format(formatter));
//		
		LocalTime time2 = LocalTime.of(15, 30, 40);
//		
////		System.out.println(time2);
//		
//		 Duration duration = Duration.between(time1, time2);
//		 
//		 long hours = duration.toHours();
//	        long minutes = duration.toMinutes() % 60;  // minutes modulo 60
//	        long seconds = duration.getSeconds() % 60; 
//	        
//	        System.out.println("Time Difference: " + hours + " hours " + minutes + " minutes " + seconds + " seconds");
		
		
//		Television tv = new Television("samsung", "SM7890tv");
//		
//		tv.checkStatus();
//		tv.setState(true);
//		tv.setPreviousStateTime(time2);
//		System.out.println("******************************");
//		tv.checkStatus();
//		
//		
//		System.out.println("******************************");
//		MusicPlayer mp = new MusicPlayer("sony", "sn908u");
//		
//		mp.checkStatus();
//		mp.setState(true);
//		mp.setPreviousStateTime(time2);
//		System.out.println("******************************");
//		mp.checkStatus();
//		
//		
//		
//		LED led = new LED("philips", "ph7898b");
//		System.out.println("******************************");
//		led.checkStatus();
//		led.setBrightness(4);
//		led.setState(true);
//		led.setPreviousStateTime(time2);
//		System.out.println("******************************");
//		led.checkStatus();
//		
//		System.out.println("******************************");
//		
//		Chandler chd = new Chandler("wipro", "whj700");
//		chd.checkStatus();
//		System.out.println("******************************");
//		chd.setState(true);
//		chd.checkStatus();
//		System.out.println("******************************");
//		chd.changeColor();
//		chd.changeColor();
////		chd.changeColor();
//		chd.checkStatus();
		
		
		HomeAutomationService service = new HomeAutomationService();
//		
//		
		service.start();
		
		
		
		
		

	}
}
