package net.mindview.access;
/**
 * 以fullname创建自己自定义的类的一个对象
 * @version:v1.0
 * @Description:
 * @author:zengqiang.wang
 * @date:2019年3月21日 下午2:52:33
 */
public class QualifiedMyClass {
	public static void main(String[] args) {
		net.mindview.access.mypackage.MyClass myClass = new net.mindview.access.mypackage.MyClass();
		//使用包全名会显得代码很是臃肿
	}

}
