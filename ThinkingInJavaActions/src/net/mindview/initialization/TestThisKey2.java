package net.mindview.initialization;
import static net.mindview.utils.PrintUtils.*;
/**
 * ����This�ؼ����÷�2,�á����ð�Ƥ����ƻ��Ƥ������֤this���÷�
 * @version:v1.0
 * @Description:1.return ��䲻�����ڹ��캯����
 * @author:zengqiang.wang
 * @date:2019��3��12�� ����10:34:55
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

//��Ƥ��������
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
