package net.mindview.access;

import net.mindview.access.dessert.Cookie;
import static net.mindview.utils.PrintUtils.*;
public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		println("constructor of chocolatechip");
	}
	public static void main(String[] args) {
		ChocolateChip chocolateChip = new ChocolateChip();
//		chocolateChip.bite();//not visibleºÍundefined ²»Í¬
	}
	
}
