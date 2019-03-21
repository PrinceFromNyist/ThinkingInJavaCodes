package net.mindview.access;
class Soup1 {
	private Soup1() {
		
	}
	public static Soup1 makeSoup1() {
		return new Soup1();
	}
}

class Soup2 {
	private Soup2() {
		
	}
	private static Soup2 s1 = new Soup2();
	public static Soup2 access() {
		return s1;//单例设计模式
	}
}
public class Lunch {
	void testPrivate() {
//		Soup1 s1 = new Soup1();//not visible
	}
	void testStatic() {
		Soup1 s1 = Soup1.makeSoup1();
		
	}
	void testSingleton() {
		Soup2.access();
	}
	
}
