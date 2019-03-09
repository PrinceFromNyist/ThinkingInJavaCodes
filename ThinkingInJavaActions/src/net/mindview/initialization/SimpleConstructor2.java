package net.mindview.initialization;

class Rock2 {
	/**
	 * 类的带参构造方法
	 * constructor with argument lists
	 */
	Rock2(int i) {
		System.out.println("Rock() " + i + " ");
	}
}

/**
 * 
 * @version:v1.0
 * @Description:类的初始化2
 * @author:Prince
 * @date:2019年3月9日 下午1:14:01
 */
public class SimpleConstructor2 {

	/**
	 * 主程序入口
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			new Rock2(i);
		}

	}

}
