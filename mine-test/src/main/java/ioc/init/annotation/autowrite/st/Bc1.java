package ioc.init.annotation.autowrite.st;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author : zyb
 * 时间 : 2020/8/17 15:10.
 */
@Component
@Primary
@DependsOn("bc2")
@Lazy
public class Bc1 extends Bc{
}
