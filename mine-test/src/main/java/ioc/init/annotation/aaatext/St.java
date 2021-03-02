package ioc.init.annotation.aaatext;

import ioc.init.annotation.autowrite.st.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author : zyb
 * 时间 : 2020/8/15 11:37.
 */
@ComponentScan
public class St {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(St.class);
		Object bean = ac.getBean("&myFactoryBean");
		Object myFactoryBean = ac.getBean("myFactoryBean");
		Member bean1 = ac.getBean(Member.class);
		System.out.println(bean);
		ConfigApp configApp = ac.getBean(ConfigApp.class);
		Pepoel pepoelx = configApp.pepoelx();
	}
}
