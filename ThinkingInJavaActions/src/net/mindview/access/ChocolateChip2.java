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
		chip2.bite();//�̳еĻ����Լ̳б�public��protected���η����ε���
		chip2.chomp();
	}
}
