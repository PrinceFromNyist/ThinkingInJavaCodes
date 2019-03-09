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
 * ���Է��������أ��������캯������ͨ����
 * @version:v1.0
 * @Description:
 * @author:Prince
 * @date:2019��3��9�� ����1:49:24
 */
public class Overloading {

	public static void main(String[] args) {
		Tree tree1 = new Tree();
		tree1.info();
		tree1.info("�в�info()��������");
		Tree tree2 = new Tree(66);
		tree2.info();
		tree2.info("�в�info()��������");

	}

}
