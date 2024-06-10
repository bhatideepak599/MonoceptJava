package com.techlabs.model;

import com.techlabs.interfaces.Controllable;
import com.techlabs.interfaces.SmartDevice;

public class SmartHome {
	private SmartDevice[] devices;
	private int deviceCount;
	private static int currentDeviceCount=0;
	
	public SmartHome( int deviceCount) {
		super();
		this.devices = new SmartDevice[deviceCount];
		this.deviceCount = deviceCount;
	}
	
	void addDevice(SmartDevice device) {
		this.devices[currentDeviceCount]=device;
		currentDeviceCount++;
		
	}
	
	public void controlDevice(String deviceId, boolean turnOn) {
        for (int i = 0; i < currentDeviceCount; i++) {
            if (devices[i].getDeviceId().equals(deviceId) && devices[i] instanceof Controllable) {
                Controllable controllable = (Controllable) devices[i];
                if (turnOn) {
                	
                    controllable.turnOn();
                    break;
                }
                
                 controllable.turnOff();
                 break;
            }
        }
    }
	
	public void listAllDevices() {
        for (int i = 0; i < currentDeviceCount; i++) {
            System.out.println(devices[i]);
        }
    }
	
	public static void main(String args[]) {
		SmartHome home=new SmartHome(5);
		
		Light light1=new Light("1","CFL");
		Thermostat thermostat1=new Thermostat("2","AC");
		SecurityCamera securityCamera1=new SecurityCamera("3","Gopro");
		
		home.addDevice(light1);
		home.addDevice(thermostat1);
		home.addDevice(securityCamera1);
		
		home.listAllDevices();
		
		home.controlDevice("1",true);
		home.controlDevice("2", true);
		home.controlDevice("3",false);
		
		home.listAllDevices();
		
		securityCamera1.startRecording();
		System.out.println(securityCamera1.getStatus());
		
		
	}
	
	
	
}
