package com.diplab.activiti;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.repository.Deployment;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Undeploy {

	public static void undeploy(ProcessEngine processEngine) {
		List<Deployment> list = processEngine.getRepositoryService()
				.createDeploymentQuery().list();
		list.stream().forEach(
				deployment -> processEngine.getRepositoryService()
						.deleteDeployment(deployment.getId(), true));
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		undeploy(context
				.getBean(ProcessEngine.class));
	}
}
