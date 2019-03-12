package net.mindview.initialization;
import static net.mindview.utils.PrintUtils.*;
/**
 * 测试this关键字的用法
 * @version:v1.0
 * @Description:1.this就是当前对象的引用（reference），
 * @author:zengqiang.wang
 * @date:2019年3月12日 上午10:25:30
 */
class Person {
	int i;
	Person increment() {
		i++;
		println(this);
		return this;
	}
}
public class TestThisKey {

	public static void main(String[] args) {
		Person p = new Person().increment().increment();
		println(p);
		println(p.i);
	}

}
