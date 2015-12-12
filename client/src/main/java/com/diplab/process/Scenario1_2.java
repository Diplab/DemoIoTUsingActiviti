package com.diplab.process;

import java.net.MalformedURLException;

import org.activiti.engine.ProcessEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.diplab.activiti.Undeploy;

public class Scenario1_2 {

	public static void main(String[] args) throws InterruptedException,
			MalformedURLException {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		final ProcessEngine processEngine = context
				.getBean(ProcessEngine.class);

		Undeploy.undeploy(processEngine);
		processEngine.getRepositoryService().createDeployment()
				.disableSchemaValidation().disableBpmnValidation()
				.addClasspathResource("bpmn/RecordSensorData.bpmn")
				.addClasspathResource("bpmn/AirMonitor.bpmn").deploy();
	}

}
