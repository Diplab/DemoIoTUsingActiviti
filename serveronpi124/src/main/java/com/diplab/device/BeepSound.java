package com.diplab.device;

import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class BeepSound {

	private static GpioPinDigitalOutput pin = GpioFactory.getInstance()
			.provisionDigitalOutputPin(RaspiPin.GPIO_07);

	public static void alertoff() {
		pin.high();
		System.out.println("alert off");
	}

	public static void alerton() {
		pin.low();
		System.out.println("ALERT");
	}

	public static PinState getState() {
		return pin.getState();
	}

}
