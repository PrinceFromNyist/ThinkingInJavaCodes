package net.mindview.access;

import static net.mindview.utils.PrintUtils.println;

import net.mindview.access.cookie2.Cookie;
public class ChocolateChip2 extends Cookie {
	public ChocolateChip2() {
		println("ChocolateChip2 constructor");
		
	}
	void chomp() {
		println("chomp in ChocolateChip2");
		bite();
	}
	public static void main(String[] args) {
		ChocolateChip2 chip2 = new ChocolateChip2();
		chip2.bite();//继承的话可以继承被public和protected修饰符修饰的类
		chip2.chomp();
	}
}
