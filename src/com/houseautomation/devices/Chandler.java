package com.houseautomation.devices;

import java.time.LocalTime;

import com.houseautomation.devices.timecalculation.Time;

public class Chandler implements LightingDevice {
	
	private String deviceName;
	private boolean state;
	private String brand;
	private String model;
	private LocalTime previousStateTime;
	private int brightnessLevel;
	private String colors[];
	private String color;
	private int colorIndex;
	
	
	
	

	public Chandler(String brand, String model) {
		this.deviceName = "Chandler";
		this.brand = brand;
		this.model = model;
		this.state = false;
		this.previousStateTime = LocalTime.now();
		this.brightnessLevel = 0;
		colors = new String[]{"blue","red","green"};
		colorIndex = 0;
		color = colors[0];
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		this.state = true;
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		this.state = false;
	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return this.state;
	}
	@Override
	public boolean checkStatus() {
		// TODO Auto-generated method stub
		Time time = new Time();
		System.out.println("Device             : Chandler");
	    System.out.println("Brand              : " + this.brand);
	    System.out.println("Model              : " + this.model);
	    
	    if (state) {
	        
	        System.out.println("Status             : ON");
	        System.out.println("Brightness Level   : " + this.brightnessLevel);
	        System.out.println("Color              : "+this.color);
	        System.out.println("On Time            : " + this.previousStateTime);
	        System.out.println("Duration           : " + time.getDiffernace(previousStateTime, LocalTime.now()));
	        return true;
	    }
	    System.out.println("Status             : OFF");
	    System.out.println("Off Time           : " + Time.formatTime(this.previousStateTime));
	    System.out.println("Duration           : " + time.getDiffernace(previousStateTime, LocalTime.now()));
		return false;
	}

	@Override
	public LocalTime previousStateTime() {
		// TODO Auto-generated method stub
		return this.previousStateTime;
	}

	@Override
	public void deviceSpecific() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setBrightness(int level) {
		// TODO Auto-generated method stub
		if (level <= 5 ||  level>0 ) {
			this.brightnessLevel = level;				
		}

	}

	

	public void setState(boolean state) {
		this.state = state;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public LocalTime getPreviousStateTime() {
		return previousStateTime;
	}

	public void setPreviousStateTime(LocalTime previousStateTime) {
		this.previousStateTime = previousStateTime;
	}

	public int getBrightnessLevel() {
		return brightnessLevel;
	}

	public void setBrightnessLevel(int brightnessLevel) {
		this.brightnessLevel = brightnessLevel;
	}

	public String[] getColors() {
		return colors;
	}

	public void setColors(String[] colors) {
		this.colors = colors;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void changeColor() {
		if(colorIndex == colors.length - 1) {
			colorIndex = 0;
			
		}else {
			colorIndex++;
			
		}
		setColor(colors[colorIndex]);
	}
	
	@Override
	public String getDeviceName() {
		// TODO Auto-generated method stub
		return this.deviceName;
	}

}
