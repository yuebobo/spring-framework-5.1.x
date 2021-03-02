package ioc.init.annotation.imports;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author : zyb
 * 时间 : 2020/7/14 10:40.
 *
 *
 *
 */
@Configuration
public class MyImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{Tab.class.getName()};
	}
}
