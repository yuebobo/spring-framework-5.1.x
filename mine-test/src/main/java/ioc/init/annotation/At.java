package ioc.init.annotation;

import ioc.init.annotation.ScanBase.ScanBaseClass;
import ioc.init.annotation.annotation.EnableImport;
import ioc.init.annotation.annotation.MyScanner;
import ioc.init.annotation.scan.inner.InnerScannerBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static org.springframework.context.annotation.FilterType.ASSIGNABLE_TYPE;

/**
 * @author : zyb
 * 时间 : 2020/6/22 17:33.
 */
//@Configuration
//@Service
//@Controller
//@Bean
@EnableImport
@Import(ImportBean.class)
//@EnableAsync
@ComponentScan(
//		value = {"ioc.init.annotation.scan"},//扫描的包路径
		value = {"ioc.init.annotation"},//扫描的包路径
		basePackageClasses = ScanBaseClass.class,//把类所在包的路径作为扫描路径，与value 一起 都会扫描
		includeFilters = {@ComponentScan.Filter(value= MyScanner.class)},//包含的过滤器，把加了注解的类扫描出来
		excludeFilters = @ComponentScan.Filter(type = ASSIGNABLE_TYPE,value = InnerScannerBean.class) //剔除过滤器，把指定的类剔除
)
//@Component
@Conditional(MyCondition.class)
@PropertySource(value = "classpath:/load.properties",ignoreResourceNotFound = true)
public class At extends AtSuper implements AtInterface{

	@Value("${property.name}")
	private String propertyName;

	@Value("${property.value}")
	private String propertyValue;

	@Value("${server.port}")
	private String port;

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
		System.out.println("================");
		return new Bbean();
	}


	@Component
	public static class Bt{

		public  Object a = new Object();

	}
}

