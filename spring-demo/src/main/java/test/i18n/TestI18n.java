package test.i18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.GregorianCalendar;
import java.util.Locale;

public class TestI18n {
	public static void main(String[] args) {
		String [] configs = {"BeanFactory.xml"};
		ApplicationContext ctx =new ClassPathXmlApplicationContext(configs);
		Object[] params = {"John", new GregorianCalendar().getTime()};
		String str1 = ctx.getMessage("test", params, Locale.US);
		String str2 = ctx.getMessage("test", params, Locale.CHINA);
		System.out.println(str1);
		System.out.println(str2);
	}
}
