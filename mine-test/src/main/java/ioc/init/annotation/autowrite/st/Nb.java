package ioc.init.annotation.autowrite.st;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : zyb
 * 时间 : 2020/8/17 11:41.
 */
@Component
public class Nb {

	@Autowired
	private Bc bc;

//	public Nb(Bc bc) {
//		this.bc = bc;
//	}

	public Bc getBc() {
		return bc;
	}
}
