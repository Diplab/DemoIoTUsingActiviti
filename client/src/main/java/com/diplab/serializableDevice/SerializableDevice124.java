package com.diplab.serializableDevice;

import java.io.Serializable;

import com.diplab.webservice.Device124;
import com.diplab.webservice.Device124Service;
import com.diplab.webservice.PinState;

public class SerializableDevice124 implements Serializable, Device124 {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2397670423070881010L;

	private SerializableDevice124() {
	}

	private static SerializableDevice124 device = new SerializableDevice124();

	public static SerializableDevice124 getInstanceOfSerializableDevice124() {
		return device;
	}

	@Override
	public void off() {
		new Device124Service().getDevice124Port().off();
	}

	@Override
	public void on() {
		new Device124Service().getDevice124Port().on();
	}

	@Override
	public void executeAC() {
		new Device124Service().getDevice124Port().executeAC();
	}

	@Override
	public void setACtemperature(int arg0) {
		new Device124Service().getDevice124Port().setACtemperature(arg0);
	}

	@Override
	public void setACtime(int arg0) {
		new Device124Service().getDevice124Port().setACtime(arg0);
	}

	@Override
	public void alerton() {
		new Device124Service().getDevice124Port().alerton();
	}

	@Override
	public void toggle() {
		new Device124Service().getDevice124Port().toggle();
	}

	@Override
	public PinState getAlertState() {
		return new Device124Service().getDevice124Port().getAlertState();
	}

	@Override
	public void alertoff() {
		new Device124Service().getDevice124Port().alertoff();
	}

	@Override
	public PinState getState() {
		return new Device124Service().getDevice124Port().getState();
	}

	@Override
	public void blast() {
		new Device124Service().getDevice124Port().blast();

	}

	@Override
	public void cooler() {
		new Device124Service().getDevice124Port().cooler();		
	}

}
