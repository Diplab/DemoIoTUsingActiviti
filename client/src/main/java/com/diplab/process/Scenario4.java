package com.diplab.process;

import java.net.MalformedURLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scenario4 {
	public static void main(String[] args) throws InterruptedException,
			MalformedURLException {

		@SuppressWarnings({ "resource", "unused" })
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanForSenario4.xml");

	}

}
