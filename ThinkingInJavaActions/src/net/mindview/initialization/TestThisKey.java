package net.mindview.initialization;
import static net.mindview.utils.PrintUtils.*;
/**
 * ����this�ؼ��ֵ��÷�
 * @version:v1.0
 * @Description:1.this���ǵ�ǰ��������ã�reference����
 * @author:zengqiang.wang
 * @date:2019��3��12�� ����10:25:30
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
