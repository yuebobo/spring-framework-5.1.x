package ioc.init.annotation.fanx;

import org.springframework.stereotype.Component;

/**
 * @author : zyb
 * 时间 : 2020/7/14 23:44.
 */
@Component
public class ZzBase {
	private Base<String> xBase;
	private Base<Integer> yBase;

	public ZzBase(Base<String> xBase, Base<Integer> yBase) {
		this.xBase = xBase;
		this.yBase = yBase;
	}
}
