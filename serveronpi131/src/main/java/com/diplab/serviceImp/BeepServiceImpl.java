package com.diplab.serviceImp;


import com.diplab.device.BeepSound;
import com.diplab.service.BeepService;
import com.pi4j.io.gpio.PinState;

public class BeepServiceImpl implements BeepService {

	@Override
	public void alertoff() {
		BeepSound.alertoff();
		return;

	}

	@Override
	public void alerton() {
		BeepSound.alerton();
		return;
	}

	
	@Override
	public PinState getState() {
		return BeepSound.getState();
	}

}
