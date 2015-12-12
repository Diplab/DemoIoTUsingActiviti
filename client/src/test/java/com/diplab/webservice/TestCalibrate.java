package com.diplab.webservice;

public class TestCalibrate {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Device127 device127Service = new Device127Service().getDevice127Port();
		// Device129 device129Service = new
		// Device129Service().getDevice129Port();
		Device135 device135Service = new Device135Service().getDevice135Port();
		Device137 device137Service = new Device137Service().getDevice137Port();
		Device131 device131Service = new Device131Service().getDevice131Port();
		// System.out.println(device127Service.calibration());
		// System.out.println(device137Service.calibration());
		// device127Service.setRo(3.1966322037549024);
		device131Service.alerton();
	}
}
