package com.diplab.process;

import java.io.IOException;
import java.io.StringWriter;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.repository.DeploymentBuilder;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PressureTest {
	private static final int TIME = 15;

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext(
						"Beans.xml");

		ProcessEngine engine = context.getBean(ProcessEngine.class);
		DeploymentBuilder deployment = engine.getRepositoryService()
				.createDeployment();

		for (int i = 0; i < TIME; i++) {
			String format = String.format("test_10_%d.bpmn", i);
			deployment.addString(format, getDef(format, 10));
		}
		for (int i = 0; i < TIME; i++) {
			String format = String.format("test_30_%d.bpmn", i);
			deployment.addString(format, getDef(format, 30));
		}
		for (int i = 0; i < TIME; i++) {
			String format = String.format("test_60_%d.bpmn", i);
			deployment.addString(format, getDef(format, 60));
		}

		deployment
				.deploy();

	}

	public static String getDef(String id, int time) {
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		Template t = ve
				.getTemplate("src/main/resources/template/helloworld.vm");
		VelocityContext context = new VelocityContext();
		context.put("id", id);
		context.put("cycle", "R/PT" + time + "S");
		StringWriter writer = new StringWriter();
		t.merge(context, writer);

		String string = writer.toString();
		return string;

	}
}
