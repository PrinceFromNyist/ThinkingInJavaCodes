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
		Sundae sundae = Sundae.makeSundae();//通过类的静态方法构建构造方法为private的类的对象
	}

}
