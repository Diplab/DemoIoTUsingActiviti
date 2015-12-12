package com.diplab.process;

import java.net.MalformedURLException;

import org.activiti.engine.ProcessEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scenario1_1 {

	public static void main(String[] args) throws InterruptedException,
			MalformedURLException {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		final ProcessEngine processEngine = context
				.getBean(ProcessEngine.class);

		processEngine.getRepositoryService().createDeployment()
				.disableSchemaValidation().disableBpmnValidation()
				.addClasspathResource("bpmn/RecordSensorData.bpmn").deploy();
	}

}
