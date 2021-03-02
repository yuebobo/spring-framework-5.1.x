package ioc.init.annotation.aaatext;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author : zyb
 * 时间 : 2020/8/15 11:39.
 */
@Component
//@DependsOn(value = "ioc.init.annotation.aaatext.member")
public class MyFactoryBean implements FactoryBean {


	public MyFactoryBean() {
		System.out.println(this.getObject());
	}

	@Override
	public Object getObject() {
		return new Member();
	}

	@Override
	public Class<?> getObjectType() {
		return Member.class;
	}
}
