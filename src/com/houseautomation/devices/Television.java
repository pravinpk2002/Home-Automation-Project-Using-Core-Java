package com.houseautomation.devices;

import java.time.LocalTime;

import com.houseautomation.devices.timecalculation.Time;

public class Television implements EntertainmentDevice {
	
	private String deviceName;
	private boolean state;
	private String brand;
	private String model;
	private int volumeLevel;
	private LocalTime previousStateTime;
	private int currentChannel;

	
	
	
	public Television(String brand, String model) {

		
		deviceName = "Television";
		this.brand = brand;
		this.model = model;
		this.previousStateTime = LocalTime.now();
		this.volumeLevel = 0;
		this.state = false;
		this.currentChannel = 1;
	}



	@Override
	public void turnOn() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean checkStatus() {
		// TODO Auto-generated method stub
		Time time = new Time();
		System.out.println("Device             : TV");
	    System.out.println("Brand              : " + this.brand);
	    System.out.println("Model              : " + this.model);
	    
	    if (state) {
	        System.out.println("Volume Level       : " + this.volumeLevel);
	        System.out.println("Status             : ON");
	        System.out.println("Current Channel    : " + this.currentChannel);
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
	public void increaseVolume() {
		// TODO Auto-generated method stub
		if (volumeLevel<20)
			this.volumeLevel++;

	}

	@Override
	public void decreaseVolume() {
		// TODO Auto-generated method stub
			if (volumeLevel>0)
			this.volumeLevel--;
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



	public int getvolumeLevel() {
		return volumeLevel;
	}



	public void setvolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}



	public LocalTime getPreviousStateTime() {
		return previousStateTime;
	}



	public void setPreviousStateTime(LocalTime previousStateTime) {
		this.previousStateTime = previousStateTime;
	}



	public int getCurrentChannel() {
		return currentChannel;
	}



	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
	}
	
	
	@Override
	public void deviceSpecific() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public String getDeviceName() {
		// TODO Auto-generated method stub
		return this.deviceName;
	}

	

}
