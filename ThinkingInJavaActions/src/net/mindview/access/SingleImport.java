package net.mindview.access;
import java.util.ArrayList;
public class SingleImport {
	public static void main(String[] args) {
		//��import����ʽ������Ӧ�İ���Ȼ��Ϳ���ֱ��ʹ����Ӧ������
		ArrayList list = new ArrayList();
		ArrayList list1 = new java.util.ArrayList();
	}
}
/**
 * ���������ʽ�����֣�����(��java.util���µ�ArrayList��Ϊ��)��
 * 1.import java.util.ArrayList;
 * 2.import java.util.*;
 */
