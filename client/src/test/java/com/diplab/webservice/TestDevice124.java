package com.diplab.webservice;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestDevice124 {

	Device124 device124Service;

	@Before
	public void initialize() {
		device124Service = new Device124Service().getDevice124Port();
	}

	@Test
	public void testOff() {
		device124Service.off();
		Assert.assertEquals("should be off", PinState.LOW,
				device124Service.getState());
	}

	@Test
	public void testOn() {
		device124Service.on();
		Assert.assertEquals("should be on", PinState.HIGH,
				device124Service.getState());
	}

	@Test
	public void testExecuteAC() {
		device124Service.executeAC();
	}

	@Test
	public void testSetACtemperature() {
		int test[] = { 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 0, 100 };
		for (int i : test) {
			device124Service.setACtemperature(i);
		}
	}

	@Test
	public void testSetACtime() {
		int test[] = { 2, 3, 4, 5, 8, 10, 12, 100, 0 };
		for (int i : test) {
			device124Service.setACtime(i);
		}
	}

	@Test
	public void testAlerton() {
		device124Service.alerton();
		Assert.assertEquals("should be on", PinState.LOW,
				device124Service.getAlertState());
	}

	@Test
	public void testToggle() {
		device124Service.on();
		device124Service.toggle();
		Assert.assertEquals("should be off", PinState.LOW,
				device124Service.getState());
		device124Service.toggle();
		Assert.assertEquals("should be on", PinState.HIGH,
				device124Service.getState());
	}

	@Test
	public void testAlertoff() {
		device124Service.alertoff();
		Assert.assertEquals("should be on", PinState.HIGH,
				device124Service.getAlertState());
	}

	@After
	public void turnDown() {
		device124Service.alertoff();
		device124Service.off();
		device124Service.setACtemperature(0);
	}

}
