package com.houseautomation.devices.timecalculation;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
	
	LocalTime time1;
	LocalTime time2;

	
	public Time() {
		// TODO Auto-generated constructor stub
	
	}
	
	public String getDiffernace(LocalTime time1, LocalTime time2) {
		
		Duration duration = Duration.between(time2, time1);
		 duration = duration.abs();
		 
		 long hours = duration.toHours();
	        long minutes = duration.toMinutes() % 60;  
	        long seconds = duration.getSeconds() % 60; 
	        
	        
	        String Timedifferenace = String.format("%02d:%02d:%02d", hours, minutes, seconds); 
	        return Timedifferenace;
	}
	
	
	public static String formatTime(LocalTime time) {
        // Format the given time as "hh:mm:ss"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(formatter);
    }
	
	

}
