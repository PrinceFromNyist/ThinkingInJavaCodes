package net.mindview.initialization;

import static net.mindview.utils.PrintUtils.print;
import static net.mindview.utils.PrintUtils.println;

/**
 * 测试函数重载时，高类型向低类型参数传递的参数要求
 * @version:v1.0
 * @Description:类型高的参数可以接收类型低的参数，中间有个类型提升。
 * 而类型低的参数不能接收类型高的参数，从类型所存的数范围角度看，小类型放不下大类型的值
 * @author:Prince
 * @date:2019年3月10日 下午1:42:53
 */
public class Demotion {
	public void f1(char c) {
		println("f1(char) " + c);
		
	}
	public void f1(byte b) {
		println("f1(byte) " + b);
	}
	public void f1(int i) {
		println("f1(int) " + i);
	}
	public void f1(short s) {
		println("f1(short) " + s);
	}
	public void f1(long l) {
		println("f1(long) " + l);
	}
	public void f1(float f) {
		println("f1(float) " + f);
	}
	public void f1(double d) {
		println("f1(double) " + d);
	}
	
	
	public void f2(byte b) {
		println("f2(byte) " + b);
	}
	public void f2(int i) {
		println("f2(int) " + i);
	}
	public void f2(short s) {
		println("f2(short) " + s);
	}
	public void f2(long l) {
		println("f2(long) " + l);
	}
	public void f2(float f) {
		println("f2(float) " + f);
	}
	public void f2(double d) {
		println("f2(double) " + d);
	}
	
	public void f3(int i) {
		println("f3(int) " + i);
	}
	public void f3(short s) {
		println("f3(short) " + s);
	}
	public void f3(long l) {
		println("f3(long) " + l);
	}
	public void f3(float f) {
		println("f3(float) " + f);
	}
	public void f3(double d) {
		println("f3(double) " + d);
	}
	
	public void f4(short s) {
		println("f4(short) " + s);
	}
	public void f4(long l) {
		println("f4(long) " + l);
	}
	public void f4(float f) {
		println("f4(float) " + f);
	}
	public void f4(double d) {
		println("f4(double) " + d);
	}
	
	public void f5(long l) {
		println("f5(long) " + l);
	}
	public void f5(float f) {
		println("f5(float) " + f);
	}
	public void f5(double d) {
		println("f5(double) " + d);
	}
	
	
	public void f6(float f) {
		println("f6(float) " + f);
	}
	public void f6(double d) {
		println("f6(double) " + d);
	}
	
	
	
	public void f7(double d) {
		println("f7(double) " + d);
	}
	
	public void testConstant() {
		print("test constant:");
		f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
	}
	public void testChar(char c) {
		print("test char:");
		f1(c);f2(c);f3(c);f4(c);f5(c);f6(c);f7(c);
	}
	public void testByte(byte b) {
		print("test char:");
		f2(b);f3(b);f4(b);f5(b);f6(b);f7(b);
	}
	public void testShort(short s) {
		print("test short:");
		f3(s);f4(s);f5(s);f6(s);f7(s);
	}
	public void testInt(int i) {
		print("test int:");
		f4(i);f5(i);f6(i);f7(i);
	}
	public void testLong(long l) {
		print("test long:");
		f5(l);f6(l);f7(l);
	}
	public void testFloat(float f) {
		print("test float:");
		f6(f);f7(f);
	}
	public void testDouble(double d) {
		print("test long:");
		f7(d);
	}
	public static void main(String[] args) {
		Demotion d = new Demotion();
		double d1 = 0.3;
		d.testFloat((float)d1);

	}

}
