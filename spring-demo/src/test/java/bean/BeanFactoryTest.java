package bean;

import bean.factorybean.Car;
import bean.factorybean.CarFactoryBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
	@Test
	public void testSimpleLoad() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());

		Car car = (Car) bf.getBean("car");
		System.out.println(car);

		CarFactoryBean carFactoryBean = (CarFactoryBean) bf.getBean("&car");
		System.out.println(carFactoryBean);
	}
}
