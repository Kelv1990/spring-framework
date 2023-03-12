package aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
		TestAware testAware = (TestAware) ctx.getBean("testAware");
		testAware.testAware();
	}
}
