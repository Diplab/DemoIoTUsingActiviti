package com.diplab.process;

import java.net.MalformedURLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EnvironmentControl {

	public static void main(String[] args) throws InterruptedException,
			MalformedURLException {

		// ProcessEngineConfiguration configuration = new
		// StandaloneInMemProcessEngineConfiguration();
		// configuration.setAsyncExecutorActivate(true);
		// configuration.setAsyncExecutorEnabled(true);
		// ProcessEngine engine = configuration.buildProcessEngine();
		// engine.getRepositoryService().createDeployment()
		// .addClasspathResource("bpmn/ts1.bpmn").deploy();

		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		@SuppressWarnings("unused")
		SqlSession sqlSession = (SqlSession) context.getBean("sqlSession");

		// context.getBean(RuntimeService.class).startProcessInstanceByKey(
		// "process_pool1");

		// sqlSession.close();
		// context.close();
	}

}
