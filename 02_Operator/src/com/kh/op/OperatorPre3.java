package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {

	public static void main(String[] args) {
		
		//method1();
		method2();

	}

	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		boolean result1 = (num1 > num2);
		boolean result2 = (num1 < num2);
		boolean result3 = (num1 >= num2);
		boolean result4 = (num1 <= num2);
		
		System.out.println("�� ��� �� 1 = " + num1 + " > " + num2 + " : " + result1);
		System.out.println("�� ��� �� 2 = " + num1 + " < " + num2 + " : " + result2);
		System.out.println("�� ��� �� 3 = " + num1 + " >= " + num2 + " : " + result3);
		System.out.println("�� ��� �� 4 = " + num1 + " <= " + num2 + " : " + result4);
		
	}
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		System.out.print("����° ������ �Է��ϼ��� : ");
		int num3 = sc.nextInt();
		
		boolean result1 = (num1 == num2) && (num2 != num3);
		// && if while ������ üũ�� ��
		// 	  2���� ������ ��� �����ϴ� ��쿡 ����Ѵ�.
		//  & ��Ʈ ���� �������� Ư�� ��Ʈ ������ �Ǵ��� �� ����Ѵ�.
		//	  ���� ������ �ʴ´�.
		boolean result2 = (num1 >= num2) || (num2 <= num3);
		
		System.out.println("�� ��� �� 1 : " + result1);
		System.out.println("�� ��� �� 2 : " + result2);
		
		
	}

}
