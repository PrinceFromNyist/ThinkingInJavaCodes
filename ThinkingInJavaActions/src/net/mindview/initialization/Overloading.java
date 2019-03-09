package net.mindview.initialization;

class Tree {
	int height;
	Tree() {
		height = 0;
		System.out.println("Planting a seed");
	}
	Tree(int initialHeight) {
		height = initialHeight;
		System.out.println("Creating a tree with " + height + " feet tall");
	}
	void info() {
		System.out.println("The tree is " + height + " feet tall");
	}
	void info(String s) {
		System.out.println(s + ".The tree is " + height + " feet tall");
		
	}
}
/**
 * 测试方法的重载，包含构造函数和普通函数
 * @version:v1.0
 * @Description:
 * @author:Prince
 * @date:2019年3月9日 下午1:49:24
 */
public class Overloading {

	public static void main(String[] args) {
		Tree tree1 = new Tree();
		tree1.info();
		tree1.info("有参info()方法调用");
		Tree tree2 = new Tree(66);
		tree2.info();
		tree2.info("有参info()方法调用");

	}

}
