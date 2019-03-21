package net.mindview.access;
import java.util.ArrayList;
public class SingleImport {
	public static void main(String[] args) {
		//以import的形式导入相应的包，然后就可以直接使用相应的类了
		ArrayList list = new ArrayList();
		ArrayList list1 = new java.util.ArrayList();
	}
}
/**
 * 导入包的形式有两种，如下(以java.util包下的ArrayList类为例)：
 * 1.import java.util.ArrayList;
 * 2.import java.util.*;
 */
