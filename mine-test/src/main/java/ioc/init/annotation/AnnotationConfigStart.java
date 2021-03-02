package ioc.init.annotation;

import ioc.init.annotation.imports.MyImportSelector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author : zyb
 * 时间 : 2020/6/15 0:08.
 */
//@Component
public class AnnotationConfigStart {

	public static void main(String[] args) {


		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(At.class);
		ac.refresh();
		System.out.println("2222");
		At bean1 = ac.getBean(At.class);
		Bbean bbean = bean1.bbean();
		System.out.println("3333");

	}
}
