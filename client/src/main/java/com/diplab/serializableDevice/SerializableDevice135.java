package com.diplab.serializableDevice;

import java.io.Serializable;

import com.diplab.webservice.Device135;
import com.diplab.webservice.Device135Service;
import com.diplab.webservice.InterruptedException_Exception;
import com.diplab.webservice.PinState;

public class SerializableDevice135 implements Serializable, Device135 {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8653220884398224973L;

	private SerializableDevice135() {
	}

	private static SerializableDevice135 device = new SerializableDevice135();

	public static SerializableDevice135 getInstanceOfSerializableDevice135() {
		return device;
	}

	public String getDevice() {
		return "Device135";

	}

	public String getTypeCO() {
		return "CO";

	}

	public String getTypeCO2() {
		return "CO2";

	}

	@Override
	public double cOppm() {
		return new Device135Service().getDevice135Port().cOppm();
	}

	@Override
	public double co2Ppm() {
		return new Device135Service().getDevice135Port().co2Ppm();
	}

	@Override
	public double getSmokePpm() throws InterruptedException_Exception {
		return new Device135Service().getDevice135Port().getSmokePpm();
	}

	@Override
	public double readTemperature() {
		return new Device135Service().getDevice135Port().readTemperature();
	}

	@Override
	public void off() {
		new Device135Service().getDevice135Port().off();
	}

	@Override
	public void on() {
		new Device135Service().getDevice135Port().on();
	}

	@Override
	public void toggle() {
		new Device135Service().getDevice135Port().toggle();
	}

	@Override
	public PinState getState() {
		return new Device135Service().getDevice135Port().getState();
	}

	@Override
	public double calibration() {
		return new Device135Service().getDevice135Port().calibration();
	}

	@Override
	public void setRo(double arg0) {
		new Device135Service().getDevice135Port().setRo(arg0);		
	}

}
