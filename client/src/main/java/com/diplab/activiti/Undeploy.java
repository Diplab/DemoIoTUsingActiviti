package com.diplab.activiti;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.repository.Deployment;

public class Undeploy {

	public static void undeploy(ProcessEngine processEngine) {
		List<Deployment> list = processEngine.getRepositoryService()
				.createDeploymentQuery().list();
		list.stream().forEach(
				deployment -> processEngine.getRepositoryService()
						.deleteDeployment(deployment.getId(), true));
	}
}
