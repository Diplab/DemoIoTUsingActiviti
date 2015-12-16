package com.diplab.process;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scenario2 {
	public static void main(String[] args) {

		@SuppressWarnings({ "resource", "unused" })
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanForSenario2.xml");

	}
}
