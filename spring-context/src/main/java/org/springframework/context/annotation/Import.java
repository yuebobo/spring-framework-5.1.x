/*
 * Copyright 2002-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context.annotation;

import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Indicates one or more <em>component classes</em> to import &mdash; typically
 * {@link Configuration @Configuration} classes.
 *
 * <p>Provides functionality equivalent to the {@code <import/>} element in Spring XML.
 * Allows for importing {@code @Configuration} classes, {@link ImportSelector} and
 * {@link ImportBeanDefinitionRegistrar} implementations, as well as regular component
 * classes (as of 4.2; analogous to {@link AnnotationConfigApplicationContext#register}).
 *
 * 此注解会在 {@link ConfigurationClassParser#processImports(ConfigurationClass, ConfigurationClassParser.SourceClass, Collection, boolean)} 处被处理
 *
 * 	一.	导入的类 为 {@link ImportSelector}
 * 			1.若 实现 	{@link Aware} 接口 ，则执行相关方法
 *
 * 			2.1 if {实现   {@link DeferredImportSelector} 接口 则当前解析时候不做处理
 * 						解析的地方是 {@link ConfigurationClassParser#parse(Set)} }
 *
 * 		    2.2 else  { 通过执行 {@link ImportSelector#selectImports(AnnotationMetadata)} 方法获取出  String[]
 * 		    			遍历 字符串数组 在递归调
 * 		    		{@link ConfigurationClassParser#processImports(ConfigurationClass, ConfigurationClassParser.SourceClass, Collection, boolean)}
 * 		    			进行处理
 * 		    	}
 *
 * 	二. 导入的类 为 {@link ImportBeanDefinitionRegistrar}
 * 	    1.若 实现 	{@link Aware} 接口 ，则执行相关方法
 *
 * 	    2.此处不会进行进一步操作，真正处理是在 {@link ConfigurationClassBeanDefinitionReader#loadBeanDefinitionsFromRegistrars(Map)} 方法被 调时
 * 	    	执行 {@link ImportBeanDefinitionRegistrar#registerBeanDefinitions(AnnotationMetadata, BeanDefinitionRegistry)}方法
 *
 * 	三. 导入的类 不是上边两种类型  则用此类作为参数递归执行 {@link ConfigurationClassParser#processConfigurationClass(ConfigurationClass)} 方法
 *
 *
 * <p>{@code @Bean} definitions declared in imported {@code @Configuration} classes should be
 * accessed by using {@link org.springframework.beans.factory.annotation.Autowired @Autowired}
 * injection. Either the bean itself can be autowired, or the configuration class instance
 * declaring the bean can be autowired. The latter approach allows for explicit, IDE-friendly
 * navigation between {@code @Configuration} class methods.
 *
 * <p>May be declared at the class level or as a meta-annotation.
 *
 * <p>If XML or other non-{@code @Configuration} bean definition resources need to be
 * imported, use the {@link ImportResource @ImportResource} annotation instead.
 *
 *  实现了 {@link ImportSelector} 或者 {@link ImportBeanDefinitionRegistrar} 的类
 *  无法通过 {@link Import} 注册到 Spring 容器中
 *
 * @author Chris Beams
 * @author Juergen Hoeller
 * @since 3.0
 * @see Configuration
 * @see ImportSelector
 * @see ImportResource
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Import {

	/**
	 * {@link Configuration @Configuration}, {@link ImportSelector},
	 * {@link ImportBeanDefinitionRegistrar}, or regular component classes to import.
	 */
	Class<?>[] value();

}
