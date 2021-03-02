package ioc.init.annotation.info_short_link;

//import org.springframework.context.annotation.ConfigurationClassParser;
//import org.springframework.context.annotation.ConfigurationClass;
//import org.springframework.context.annotation.ConfigurationClassParser;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.context.annotation.ImportSelector;

import java.util.Collection;
import java.util.Set;

/**
 *
 * {@link org.springframework.context.annotation.Import}
 *   在 {@link ConfigurationClassParser#doProcessConfigurationClass(ConfigurationClass, ConfigurationClassParser.SourceClass)}
 *
 *
 * {@link ImportSelector}
 *    在 {@link ConfigurationClassParser#processImports(ConfigurationClass, ConfigurationClassParser.SourceClass, Collection, boolean)}
 *
 * {@link DeferredImportSelector}
 * 	  在  {@link ConfigurationClassParser#parse(Set)}
 *
 * {@link ImportBeanDefinitionRegistrar}
 * 	  在 {@link ConfigurationClassBeanDefinitionReader#loadBeanDefinitionsForConfigurationClass(ConfigurationClass, ConfigurationClassBeanDefinitionReader.TrackedConditionEvaluator)}
 *
 * @author : zyb
 * 时间 : 2020/8/9 21:38.
 */
public class Import {
}
