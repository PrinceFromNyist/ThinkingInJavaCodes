package net.mindview.access;

class Sundae {
	private Sundae() {
		
	}
	static Sundae makeSundae() {
		return new Sundae();
	}
}
public class IceCream {

	public static void main(String[] args) {
//		new Sundae();// not visible
		Sundae sundae = Sundae.makeSundae();//ͨ����ľ�̬�����������췽��Ϊprivate����Ķ���
	}

}
