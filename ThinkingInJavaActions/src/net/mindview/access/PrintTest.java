package net.mindview.access;
import static net.mindview.utils.PrintUtils.*;
/**
 * 测试net.mindview.utils包中的PrintUtils类的静态方法
 * 导入方式：import static xxx.xxx.*;
 * @version:v1.0
 * @Description:
 * @author:zengqiang.wang
 * @date:2019年3月21日 下午3:32:24
 */
public class PrintTest {

	public static void main(String[] args) {
		println(1);
		println("string");
		println(3.14);
		println(3.15f);//可以写为3.15F，效果一样
		println(1000l);
		println(3434L);
	}

}
