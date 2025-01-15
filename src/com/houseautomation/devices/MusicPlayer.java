package com.houseautomation.devices;

import java.time.LocalTime;

import com.houseautomation.devices.timecalculation.Time;

public class MusicPlayer implements EntertainmentDevice {

	private String deviceName;
	private boolean state;
	private String brand;
	private String model;
	private int volumeLevel;
	private LocalTime previousStateTime;
	private int currentSong;
	
	
	public MusicPlayer(String brand, String model) {
		deviceName = "Music Player";
		this.state = false;
		this.brand = brand;
		this.model = model;
		this.volumeLevel = 1;
		this.previousStateTime = LocalTime.now();
		this.currentSong = 1;
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
		return state;
	}

	@Override
	public boolean checkStatus() {
		// TODO Auto-generated method stub
		
		Time time = new Time();
		System.out.println("Device             : Music Player");
	    System.out.println("Brand              : " + this.brand);
	    System.out.println("Model              : " + this.model);
	    
	    if (state) {
	        System.out.println("Volume Level       : " + this.volumeLevel);
	        System.out.println("Status             : ON");
	        System.out.println("Current Channel    : " + this.currentSong);
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

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
	}

	public LocalTime getPreviousStateTime() {
		return previousStateTime;
	}

	public void setPreviousStateTime(LocalTime previousStateTime) {
		this.previousStateTime = previousStateTime;
	}

	public int getCurrentSong() {
		return currentSong;
	}

	public void setCurrentSong(int currentSong) {
		this.currentSong = currentSong;
	}
	
	@Override
	public String getDeviceName() {
		// TODO Auto-generated method stub
		return this.deviceName;
	}
	

}
