package com.kh.conditionEx;

import java.util.Scanner;

// ��Ű�� : �ۼ��� ������ ���� ���� ��ġ
public class ConditionEx {
// ���ǹ� ��ɿ� Ŭ���� 
// if �� else �� Ŭ����
	public static void main(String[] args) {
		// ���� �޼���
		//method1();
		//method2();
		//method3();
		practice1();
		practice2();
	}
	
	public static void method1() {
		// �޼��� 1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if (age >= 19) {
		// ���� ���� ���̰� 19�� �̻��̶��
		// �� age �� ���� 19 �̻��̸�
			System.out.println("�����Դϴ�.");
			// "�����Դϴ�." �� ����� ��
		}
		
		else {
		// ���� age �� ���� 19 �̸��̸�
			System.out.println("�̼������Դϴ�.");
			// "�̼������Դϴ�." �� ����� ��
			
			/*
			 if �� �־��� ������ ���� �� ����Ǵ� �ڵ� ����̴�.
			 else �� ������ ������ �� ����Ǵ� �ڵ� ��� (�ʼ��� �ۼ��ؾ� �ϴ� ���� �ƴϴ�.)
			 else �� �Ұ�ȣ ( ) �ȿ� ���ǽ��� �ۼ����� �ʾƵ� �ȴ�.
			 
			 ��� ���
			 if (���ǹ�) {
			 	������ ���� ��� ������ �ڵ� �ۼ�
			 	����, ���ǹ��� ������ ���� �ƴ� ��쿡�� �ڵ����� ����ȴ�.
			 }
			 */
		}
		
	}
	
	public static void method2() {
		
		int num = 2;
		
		if (num % 2 == 0) {
			// � ���� 2�� ������ �� �������� 0�̸� ¦���̴�.
			System.out.println("¦���Դϴ�.");
		}
		
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
	} 
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if((0 < age) && (age < 14)) {
			System.out.println("����Դϴ�.");	
		}
		
		else {
			System.out.println("��̰� �ƴմϴ�.");
		}
		
	}

	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if ((age >= 10) && (age < 20)) {
			System.out.println("10�� �Դϴ�.");
		}
		
		else {
			System.out.println("10�밡 �ƴմϴ�.");
		}
	}
	
	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		if (age >= 80) {
			System.out.println("80�� �̻��Դϴ�.");
		}
		
		else {
			System.out.println("�ش����� �ʽ��ϴ�.");
		}
	}

}
