package ioc.init.annotation.aaatext;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : zyb
 * 时间 : 2020/8/15 11:39.
 */
@Configuration
public class ConfigApp {

	@Bean
	public Pepoel pepoelx(){
		return new Pepoel();
	}
}
