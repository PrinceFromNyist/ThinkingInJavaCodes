package net.mindview.access.dessert;
import static net.mindview.utils.PrintUtils.*;
public class Cookie {
	public Cookie() {
		println("Cookie constructor!");
	}
//	Cookie() {
//		println("Cookie constructor!");
//	}//如果Cookie构造方法前面没有修饰符，那么不是同一个包下的其他类不能使用它
	void bite() {
		println("bite");
	}
}
