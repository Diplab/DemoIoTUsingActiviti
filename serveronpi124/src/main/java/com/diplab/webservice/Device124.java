package com.diplab.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

import com.diplab.service.ACService;
import com.diplab.service.BeepService;
import com.diplab.service.SwitchService;
import com.diplab.serviceImp.ACServiceImpl;
import com.diplab.serviceImp.BeepServiceImpl;
import com.diplab.serviceImp.SwitchServiceImpl;
import com.pi4j.io.gpio.PinState;

@WebService
@SOAPBinding(style = Style.RPC)
public class Device124 {

	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:9005/webservice/Device124",
				new Device124());

		System.out.println("open webservice124");

	}

	SwitchService switchService = new SwitchServiceImpl();

	ACService acService = new ACServiceImpl();

	BeepService beepService = new BeepServiceImpl();

	@WebMethod
	public void alertoff() {
		beepService.alertoff();
	}

	@WebMethod
	public void alerton() {
		beepService.alerton();
	}

	@WebMethod
	public void blast() {
		acService.blast();
	}

	@WebMethod
	public void executeAC() {
		acService.executeAC();
	}

	@WebMethod
	public PinState getAlertState() {
		return beepService.getState();
	}

	@WebMethod
	public PinState getState() {
		return switchService.getState();
	}

	@WebMethod
	public void off() {
		switchService.off();
	}

	@WebMethod
	public void on() {
		switchService.on();
	}

	@WebMethod
	public void setACtemperature(int temp) {
		acService.setACtemperature(temp);
	}

	@WebMethod
	public void setACtime(int hour) {
		acService.setACtime(hour);
	}

	@WebMethod
	public void toggle() {
		switchService.toggle();
	}

	@WebMethod
	public void cooler() {
		acService.cooler();
	}

}
