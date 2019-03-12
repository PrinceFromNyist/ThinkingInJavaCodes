package net.mindview.initialization;
import static net.mindview.utils.PrintUtils.*;
/**
 * 测试This关键字用法2,用‘人用剥皮器削苹果皮’来验证this的用法
 * @version:v1.0
 * @Description:1.return 语句不能用在构造函数中
 * @author:zengqiang.wang
 * @date:2019年3月12日 上午10:34:55
 */
class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}
class People {
	void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy!");
	}
}

//削皮器工具类
class Peeler {
	static Apple peel(Apple apple) {
		return apple;
	}
}
public class TestThisKey2 {

	public static void main(String[] args) {
		People people = new People();
		people.eat(new Apple());
	}

}
