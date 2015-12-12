package com.diplab.process;

import java.net.MalformedURLException;

import org.activiti.engine.ProcessEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scenario4 {
	public static void main(String[] args) throws InterruptedException,
			MalformedURLException {

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");

		final ProcessEngine processEngine = context
				.getBean(ProcessEngine.class);
		processEngine.getRepositoryService().createDeployment()
				.disableSchemaValidation().disableBpmnValidation()
				.addClasspathResource("bpmn/RecordSensorData.bpmn")
				.addClasspathResource("bpmn/AirMonitor.bpmn")
				.addClasspathResource("bpmn/RecordTemperature.bpmn")
				.addClasspathResource("bpmn/RecordOutdoorTemperature.bpmn")
				.addClasspathResource("bpmn/SaveEnergy.bpmn")
				.addClasspathResource("bpmn/RecordSmoke.bpmn")
				.addClasspathResource("bpmn/FireEscape.bpmn")
				.deploy();
	}

}