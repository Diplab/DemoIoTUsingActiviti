package com.diplab.process;

import org.activiti.engine.ProcessEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScenarioTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"BeansForTest.xml");

		final ProcessEngine processEngine = context
				.getBean(ProcessEngine.class);
		processEngine.getRepositoryService().createDeployment()
				.disableSchemaValidation().disableBpmnValidation()
				.addClasspathResource("bpmn/RecordTemperature.bpmn")
				.addClasspathResource("bpmn/ControlActuator.bpmn").deploy();
	}
}
