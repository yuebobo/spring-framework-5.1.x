package ioc.init.annotation.autowrite.st;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.AutowireCapableBeanFactory.AUTOWIRE_AUTODETECT;

/**
 * @author : zyb
 * 时间 : 2020/8/17 11:45.
 */
@Component
public class MyBeanFactory implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//		BeanDefinition nb = beanFactory.getBeanDefinition("nb");
//		AbstractBeanDefinition nb1 = (AbstractBeanDefinition) nb;
//		nb1.setAutowireMode(5);
	}
}
