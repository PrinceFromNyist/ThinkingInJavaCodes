package net.mindview.initialization;

class Rock2 {
	/**
	 * ��Ĵ��ι��췽��
	 * constructor with argument lists
	 */
	Rock2(int i) {
		System.out.println("Rock() " + i + " ");
	}
}

/**
 * 
 * @version:v1.0
 * @Description:��ĳ�ʼ��2
 * @author:Prince
 * @date:2019��3��9�� ����1:14:01
 */
public class SimpleConstructor2 {

	/**
	 * ���������
	 * @Description:
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			new Rock2(i);
		}

	}

}
