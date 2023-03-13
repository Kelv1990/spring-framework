package initPropertySources;

import aware.TestAware;
import org.springframework.context.ApplicationContext;

public class TestInitPropertyScources {
	public static void main(String[] args) {
		ApplicationContext ctx = new MyClassPathXmlApplicationContext("beanFactoryTest.xml");
		TestAware testAware = (TestAware) ctx.getBean("testAware");
		testAware.testAware();
	}
}
