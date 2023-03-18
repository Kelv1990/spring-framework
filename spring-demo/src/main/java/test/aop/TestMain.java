package test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext bf=new ClassPathXmlApplicationContext("testAop.xml");
		TestBean bean = (TestBean) bf.getBean("test");
		bean.test();
	}
}
