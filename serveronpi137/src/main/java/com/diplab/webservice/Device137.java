package com.diplab.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;

import com.diplab.device.RpiSmoke;
import com.diplab.service.COService;
import com.diplab.service.SmokeService;
import com.diplab.service.TemperatureService;
import com.diplab.serviceImp.COServiceImpl;
import com.diplab.serviceImp.SmokeServiceImpl;
import com.diplab.serviceImp.TemperatureServiceImpl;

@WebService
@SOAPBinding(style = Style.RPC)
public class Device137 {

	COService coService = new COServiceImpl();
	SmokeService smokeService = new SmokeServiceImpl();
	TemperatureService temperatureService = new TemperatureServiceImpl();

	@WebMethod
	public double COppm() {
		return coService.COppm();
	}

	@WebMethod
	public double getSmokePpm() throws InterruptedException {
		return smokeService.getSmokePpm();
	}

	@WebMethod
	public double readTemperature() {
		return temperatureService.readTemperature();
	}

	@WebMethod
	public void setRo(double ro) {
		RpiSmoke.setRo(ro);
	}

	@WebMethod
	public double calibration() {
		return RpiSmoke.MQCalibration();
	}

	public static void main(String[] args) {
		Device137 implementor = new Device137();
		((Thread) implementor.smokeService).start();
		Endpoint.publish("http://0.0.0.0:9005/webservice/Device137",
				implementor);

		System.out.println("open webservice137");

	}

}
