package net.mindview.initialization;

class Rock {
	/**
	 * 类的构造方法，
	 * default constructor（no-arg constructor）
	 */
	Rock() {
		System.out.println("Rock() ");
	}
}

/**
 * 
 * @version:v1.0
 * @Description:测试类的初始化1
 * @author:Prince
 * @date:2019年3月9日 下午12:46:52
 */
public class SimpleConstructor {

	/**
	 * 主程序入口
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			new Rock();
		}

	}

}
