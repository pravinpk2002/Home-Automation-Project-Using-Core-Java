package com.houseautomation.devices;

import java.time.LocalTime;

import com.houseautomation.devices.timecalculation.Time;

public class AirConditioner implements TemperatureDevice {
	private String deviceName;
	private boolean state;
	private String brand;
	private String model;
	private LocalTime previousStateTime;
	private float temprature;
	private String modes[];
	private int modeIndex;
	private String mode;
	
	public AirConditioner(String brand, String model) {
		deviceName = "Air Conditioner";
		this.state = false;
		this.brand = brand;
		this.model = model;
		this.previousStateTime = LocalTime.now();
		this.temprature = 0;
		this.modes = new String[] {"auto","cool","heat","echo"};
		this.modeIndex = 0;
		this.mode = modes[0];
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
		System.out.println("Device             : AC");
	    System.out.println("Brand              : " + this.brand);
	    System.out.println("Model              : " + this.model);
	    
	    if (state) {
	      
	        System.out.println("Status             : ON");
	        System.out.println("Current Mode       : " + this.mode);
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
	public void setTemprature(float deg) {
		// TODO Auto-generated method stub
		this.temprature = deg;
	}

	@Override
	public float getTemprature() {
		// TODO Auto-generated method stub
		return this.getTemprature();
	}

	public boolean isState() {
		return state;
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

	public String[] getModes() {
		return modes;
	}

	public void setModes(String[] modes) {
		this.modes = modes;
	}

	public int getModeIndex() {
		return modeIndex;
	}

	public void setModeIndex(int modeIndex) {
		this.modeIndex = modeIndex;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public void changeMode() {
		if(modeIndex == modes.length - 1) {
			modeIndex = 0;
		}
		else {
			modeIndex++;
		}
		
		this.mode = modes[modeIndex];
	}
	
	@Override
	public String getDeviceName() {
		// TODO Auto-generated method stub
		return this.deviceName;
	}

}
