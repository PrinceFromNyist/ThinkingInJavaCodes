package net.mindview.access;
import static net.mindview.utils.PrintUtils.*;
public class Range {
	public static int[] range(int n) {
		int[] result = new int[n];
		for(int i = 0; i < n; i++) {
			result[i] = i;
		}
		return result;
	}
	//method overloadded
	public static int[] range(int start,int end) {
		int sz = end - start;
		int[] result = new int[sz];
		for(int i = 0; i < sz; i++) {
			result[i] = start + i;
		}
		return result;
	}
	public static int[] range(int start,int end,int step) {
		int sz = (end - start)/step;
		int[] result = new int[sz];
		for(int i = 0; i < sz; i++) {
			result[i] = start + i * step;
		}
		return result;
	}
	public static void main(String[] args) {
		//²âÊÔrangeº¯Êý
		int[] r1 = range(10);
		int[] r2 = range(1,10);
		int[] r3 = range(1,10,2);
		println(r1);
		println(r2);
		println(r3);
	}
}
