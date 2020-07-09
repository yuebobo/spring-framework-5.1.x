package ioc.init.annotation;

import org.springframework.context.annotation.Bean;

/**
 * @author : zyb
 * 时间 : 2020/7/6 22:11.
 */
public interface AtInterface {

	/**
	 * xx
	 * @return
	 */
	@Bean
	default BeanInterfaceA beanInterfaceA(){
		return new BeanInterfaceA();
	}
}
