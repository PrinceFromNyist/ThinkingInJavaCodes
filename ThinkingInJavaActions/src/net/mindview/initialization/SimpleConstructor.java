package net.mindview.initialization;

class Rock {
	/**
	 * ��Ĺ��췽����
	 * default constructor��no-arg constructor��
	 */
	Rock() {
		System.out.println("Rock() ");
	}
}

/**
 * 
 * @version:v1.0
 * @Description:������ĳ�ʼ��1
 * @author:Prince
 * @date:2019��3��9�� ����12:46:52
 */
public class SimpleConstructor {

	/**
	 * ���������
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			new Rock();
		}

	}

}
