package aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class TestAware implements BeanFactoryAware {
	private BeanFactory beanFactory;

	//生命bean的时候Spring会自动注入BeanFactory
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
	}

	public void testAware() {
		//通过hello这个bean id 从beanFactory获取实例
		Hello hello = (Hello) beanFactory.getBean("hello");
		hello.say();
	}
}
