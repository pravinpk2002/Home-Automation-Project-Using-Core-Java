package com.houseautomation.devices;

import java.time.LocalTime;

public interface Device {
	
	public String getDeviceName();
	public void turnOn();
	public void turnOff();
	public boolean isOn();//for ON return true for OFF return false
	public boolean checkStatus();// Provide details of device in current state
	public LocalTime previousStateTime(); // gives previous state time
	public void deviceSpecific();
	
}
