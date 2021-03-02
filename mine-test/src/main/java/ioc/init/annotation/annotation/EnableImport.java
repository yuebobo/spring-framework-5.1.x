package ioc.init.annotation.annotation;

import ioc.init.annotation.imports.MyDeferredImportSelector;
import ioc.init.annotation.imports.MyImportBeanDefinitionRegistrar;
import ioc.init.annotation.imports.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : zyb
 * 时间 : 2020/7/14 10:42.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({MyImportSelector.class, MyDeferredImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public @interface EnableImport {
}
