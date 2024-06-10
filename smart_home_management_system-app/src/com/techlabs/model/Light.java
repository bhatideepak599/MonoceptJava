package com.techlabs.model;

import com.techlabs.interfaces.Controllable;
import com.techlabs.interfaces.SmartDevice;

public class Light implements SmartDevice, Controllable {
	
	private String deviceId;
	private String name;
	private boolean on;
	
	
	public Light(String deviceId, String name) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.on = false;
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

	@Override
	public String toString() {
		return "Light [DeviceId=" + deviceId + ", Name=" + name + ", On=" + on + "]";
	}
	
	

}
