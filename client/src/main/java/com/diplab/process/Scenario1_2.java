package com.diplab.process;

import java.net.MalformedURLException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scenario1_2 {

	public static void main(String[] args) throws InterruptedException,
			MalformedURLException {

		@SuppressWarnings({ "resource", "unused" })
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanForSenario1_2.xml");

		// final ProcessEngine processEngine = context
		// .getBean(ProcessEngine.class);

		// update sensor set data = 100000 where type = 'CO'
	}

}
