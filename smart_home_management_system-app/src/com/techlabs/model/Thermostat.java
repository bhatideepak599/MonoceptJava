package com.techlabs.model;

import com.techlabs.interfaces.Controllable;
import com.techlabs.interfaces.Monitorable;
import com.techlabs.interfaces.SmartDevice;

public class Thermostat implements Controllable, Monitorable, SmartDevice {
	
	private String deviceId;
	private String name;
	private boolean on;
	private double temperature;
	

	public Thermostat(String deviceId, String name) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.on = false;
		this.temperature = 25.0;
	}
	
	@Override
	
	
	public String getDeviceId() {
		
		return deviceId;
	}

	@Override
	public String getName() {
		
		return name;
	}

	@Override
	public boolean isOn() {
		
		return on;
	}

	

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String getStatus() {
		
		return "Temperature is "+temperature+"°C";
	}

	@Override
	public void turnOn() {
		this.on=true;

	}

	@Override
	public void turnOff() {
		this.on=false;

	}

	@Override
	public String toString() {
		return "Thermostat [DeviceId=" + deviceId + ", Name=" + name + ", On=" + on + ", temperature=" + temperature
				+ "]";
	}
	

}
