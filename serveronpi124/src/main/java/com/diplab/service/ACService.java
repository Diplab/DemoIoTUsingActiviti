package com.diplab.service;

import javax.jws.WebMethod;

public interface ACService {

	@WebMethod
	void executeAC();

	@WebMethod
	/**
	 * 
	 * @param temp between 20~30, other for cooler
	 */
	void setACtemperature(int temp);

	@WebMethod
	/**
	 * 
	 * @param hour 2,3,4,5,8,10,12, other for forever
	 */
	void setACtime(int hour);

	@WebMethod
	void blast();

	@WebMethod
	void cooler();

}
