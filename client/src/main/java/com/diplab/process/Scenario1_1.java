package com.diplab.process;

import java.net.MalformedURLException;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diplab.db.Sensor;
import com.diplab.db.SensorMapper;

public class Scenario1_1 {

	public static void main(String[] args) throws InterruptedException,
			MalformedURLException {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"BeanForSenario1_1.xml");

		// final ProcessEngine processEngine = context
		// .getBean(ProcessEngine.class);

		SensorMapper bean = (SensorMapper) context.getBean("mapper");
		bean.insert(new Sensor("TEST", "TEST", 0, new Date()));
		System.out.println(bean);
	}

}
