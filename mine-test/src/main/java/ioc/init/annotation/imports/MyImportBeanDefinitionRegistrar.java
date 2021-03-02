package ioc.init.annotation.imports;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : zyb
 * 时间 : 2020/7/14 17:25.
 */
@Configuration
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//		BeanDefinition bbean = registry.getBeanDefinition("bbean");
//		bbean.setScope("prototype");


		System.out.println("xxxxxxxxxx");
	}
}
