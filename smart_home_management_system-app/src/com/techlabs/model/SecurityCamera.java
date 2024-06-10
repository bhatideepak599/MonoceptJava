package com.techlabs.model;

import com.techlabs.interfaces.Monitorable;
import com.techlabs.interfaces.SmartDevice;

public class SecurityCamera implements Monitorable, SmartDevice {
	

	private String deviceId;
	private String name;
	private boolean recording;
	
	
	public SecurityCamera(String deviceId, String name) {
		super();
		this.deviceId = deviceId;
		this.name = name;
		this.recording = false;
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
		
		return recording;
	}

	@Override
	public String getStatus() {
		if(recording) return "Recording......";
		return "Not Recording.....";
	}
	
	public void startRecording() {
		this.recording=true;
	}
	public void stopRecording() {
		this.recording=false;
	}

	@Override
	public String toString() {
		return "SecurityCamera [DeviceId=" + deviceId + ", Name=" + name + ", Recording=" + recording + "]";
	}
	
	

}
