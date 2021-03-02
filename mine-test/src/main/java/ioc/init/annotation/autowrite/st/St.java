package ioc.init.annotation.autowrite.st;


import ioc.init.annotation.autowrite.Aimport;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author : zyb
 * 时间 : 2020/8/15 11:37.
 */
@ComponentScan("ioc.init.annotation.autowrite.st")
@Import(Aimport.class)
public class St {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(St.class);
		Nb bean = ac.getBean(Nb.class);
		System.out.println(bean.getBc());
	}
}
