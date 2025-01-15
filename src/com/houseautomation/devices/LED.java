package com.houseautomation.devices;

import java.time.LocalTime;

import com.houseautomation.devices.timecalculation.Time;

public class LED implements LightingDevice {
	
	private String deviceName;
	private boolean state;
	private String brand;
	private String model;
	private LocalTime previousStateTime;
	private int brightnessLevel;
	
	
	
	

	public LED(String brand, String model) {
		deviceName = "LED";
		this.state = false;
		this.brand = brand;
		this.model = model;
		this.previousStateTime = LocalTime.now();
		this.brightnessLevel = 0;
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
		System.out.println("Device             : LED");
	    System.out.println("Brand              : " + this.brand);
	    System.out.println("Model              : " + this.model);
	    
	    if (state) {
	        
	        System.out.println("Status             : ON");
	        System.out.println("Brightness Level   : " + this.brightnessLevel);
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
	
	@Override
	public String getDeviceName() {
		// TODO Auto-generated method stub
		return this.deviceName;
	}

}
