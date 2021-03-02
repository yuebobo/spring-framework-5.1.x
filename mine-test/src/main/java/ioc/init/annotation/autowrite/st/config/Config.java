package ioc.init.annotation.autowrite.st.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : zyb
 * 时间 : 2020/8/17 17:28.
 */
@Configuration
public class Config {

	@Bean
	public BeMethod beMethod(){
		return new BeMethod();
	}
}
