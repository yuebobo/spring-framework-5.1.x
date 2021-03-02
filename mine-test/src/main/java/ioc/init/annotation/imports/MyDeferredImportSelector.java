package ioc.init.annotation.imports;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : zyb
 * 时间 : 2020/7/14 11:37.
 */
@Configuration
public class MyDeferredImportSelector implements DeferredImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{Tee.class.getName()};
	}
}
