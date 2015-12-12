package client;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestDBprocess implements JavaDelegate {

	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		SqlSession sqlSession = (SqlSession) context.getBean("sqlSession");

		context.getBean(RuntimeService.class).startProcessInstanceByKey(
				"myProcess");
		
		sqlSession.close();
		context.close();
	}

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("In TestDBprocess");
		execution.getVariableNames().stream()
				.forEach(x -> System.out.println(x));
	}
}