package com.diplab.process;

import org.activiti.engine.ProcessEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scenario2 {
	public static void main(String[] args) {

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
				.addClasspathResource("bpmn/ControlActuator.bpmn").deploy();
	}
}
