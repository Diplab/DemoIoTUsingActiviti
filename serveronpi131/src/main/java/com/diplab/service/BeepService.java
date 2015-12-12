package com.diplab.service;

import com.pi4j.io.gpio.PinState;

public interface BeepService {

	void alertoff();

	void alerton();

	PinState getState();

}
