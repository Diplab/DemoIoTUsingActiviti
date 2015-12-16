package com.diplab.process;

import java.net.MalformedURLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartEngine {

	public static void main(String[] args) throws InterruptedException,
			MalformedURLException {

		@SuppressWarnings({ "unused", "resource" })
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

	}

}
