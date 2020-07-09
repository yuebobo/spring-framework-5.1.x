package ioc.init.annotation;

import ioc.init.annotation.ScanBase.ScanBaseClass;
import ioc.init.annotation.annotation.MyScanner;
import ioc.init.annotation.scan.inner.InnerScannerBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;

/**
 * @author : zyb
 * 时间 : 2020/6/22 17:33.
 */
//@Service
//@Controller
//@Bean
@Import(ImportBean.class)
//@EnableAsync
@ComponentScan(
		value = {"ioc.init.annotation.scan"},//扫描的包路径
		basePackageClasses = ScanBaseClass.class,//把类所在包的路径作为扫描路径，与value 一起 都会扫描
		includeFilters = {@ComponentScan.Filter(value= MyScanner.class)},//包含的过滤器，把加了注解的类扫描出来
		excludeFilters = @ComponentScan.Filter(type = ASSIGNABLE_TYPE,value = InnerScannerBean.class) //剔除过滤器，把指定的类剔除
)
@Component
@Conditional(MyCondition.class)
@PropertySource(value = "classpath:/load.properties",ignoreResourceNotFound = true)
public class At extends AtSuper implements AtInterface{

	@Value("${property.name}")
	private String propertyName;

	@Value("${property.value}")
	private String propertyValue;

	@PostConstruct
	private void init(){
		System.out.println(propertyName+":"+propertyValue);
	}

	public void after(){
		System.out.println(propertyName);
		System.out.println(propertyValue);
	}

	@Bean
	public Bbean bbean(){
		return new Bbean();
	}


	@Component
	public class Bt{

		public  Object a = new Object();

	}
}

