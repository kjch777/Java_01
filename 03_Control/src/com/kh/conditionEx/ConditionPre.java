package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	public static void main(String[] args) {
		// �������� ������ ���� �޼���
		//method1();
		//method2();
		method3();

	}

	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + " �� " + num2 + " �� ���� �����ϴ�.");
		} else {
			System.out.println(num1 + " �� " + num2 + " �� ���� �ٸ��ϴ�.");
		}
		
	}
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		String str1 = sc.nextLine();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println(str1 + " �� " + str2 + " �� �����ϴ�.");
		} else {
			System.out.println(str1 + " �� " + str2 + " �� �ٸ��ϴ�.");
		}
		
	}
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �Ǽ��� �Է��ϼ��� : ");
		double dou1 = sc.nextDouble();
		System.out.print("�ι�° �Ǽ��� �Է��ϼ��� : ");
		double dou2 = sc.nextDouble();
		
		if (dou1 == dou2) {
			System.out.println(dou1 + " �� " + dou2 + " �� �����ϴ�.");
		} else {
			System.out.println(dou1 + " �� " + dou2 + " �� �ٸ��ϴ�.");
		}
		
	}

}
