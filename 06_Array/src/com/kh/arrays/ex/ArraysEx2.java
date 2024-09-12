package com.kh.arrays.ex;

import java.util.Arrays;

public class ArraysEx2 {

// method
	// �⺻ ������
	public ArraysEx2() {
		
	}
	
	// ��� void
	public void method1() {
		
		// ���� �迭 ����
		int[] num = {6, 4, 2, 3, 5, 7, 9};
		
		// ���� ����
		Arrays.sort(num);
		
		// ���� �� ���� ���
		System.out.println(Arrays.toString(num));
		System.out.println("====================");
		
		// num �迭 abc �� ����
		int abc[] = Arrays.copyOf(num, num.length);
		
		// ����� ���� �ƴ��� ���
		System.out.println(Arrays.toString(abc));
		System.out.println("====================");
		
		// num �� abc �� ������ ��
		boolean same = Arrays.equals(num, abc);
		System.out.println("num �� abc �� ������? : " + same);
		System.out.println("====================");
		
		int[] full = new int[3];
		String str = Arrays.toString(full);
		System.out.println("ó�� ���� : " + str + " �Դϴ�.");
		System.out.println("====================");
		
		// ���� 6�� ������ �����
		Arrays.fill(full, 6);
		
		// ����غ���
		System.out.println(Arrays.toString(full));
	}
	
	public static void main(String[] args) {
		ArraysEx2 ae = new ArraysEx2();
		ae.method1();

	}

}
