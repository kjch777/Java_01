package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {

	public static void main(String[] args) {
		/*
		 if - else if - else 
		 
		 ��� ���
		 if (���� 1) {
		 	���� 1�� ���� ��� ������ �ڵ� �ۼ�
		 }
		 
		 else if (���� 2) {
		 	���� 1�� �����̰�
		 	���� 2�� ���� ��� ������ �ڵ� �ۼ�
		 }
		 
		 else {
		 	���� 1�� ���� 2�� ��� ������ ��� ������ �ڵ� �ۼ�
		 }
		 */
		method1();
		//method2();
		//method3();
		//method4();

	}
	
	public static void method1() {
		// ���� ���� 2_000 �� �̻� ���� ���, �ýø� ź��.
		// ���� ���� 1_500 ~ 1_900 �� ���� ���� ���, ���߱����� ź��.
		// �̿��� ���, �ɾ��.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �ִ� ���� �׼��� �Է� �ϼ��� : ");
		int money = sc.nextInt(); // ���� ���� ������ �ִ� ��
		
		String result;
		
		if(money >= 2_000) {
			result = "�ý�";
		}
		
		else if((money >= 1_500) && (money <= 1_900)) {
			result = "���� ����";
		}
		
		else {
			result = "����";
		}
		
		System.out.println(result + " ��(��) �̿� �մϴ�.");
	}
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ȳ��ϼ���, �׹������Դϴ�! ���̸� �Է� ���ּ��� : ");
		int age = sc.nextInt();
		String result;
		
		if((age <= 13) && (age > 0)) {
			result = "���";
		}
		
		else if((age > 13) && (age <= 18)) {
			result = "û�ҳ�";
		}
			
		else if(age > 18) {
			result = "����";
		}
		
		else {
			result = "�߸��� �Է�";
		}
		System.out.println(result + " �Դϴ�.");
	}
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �˾ƺ��⸦ ���ϴ� ���� ���ڷ� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		String result; // if - else if - else ��ο� result �� �ݵ�� ��� �Ѵ�.
		if((month == 1) || (month == 2) || (month == 12)) {
			result = "�ܿ�";
		} else if((month>=3) && (month<=5)) {
			result = "��";
		} else if((month>=6) && (month<=8)) {
			result = "����";
		} else if((month>=9) && (month<=11)) {
			result = "����";
		} else {
			result = "�߸��� �Է�";
		}
		System.out.println(result + " �Դϴ�.");
	}
	
	public static void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		// ������ ����� Ȱ���Ͽ� �������� ���̿� ���� ǥ�⸦ ���
		String result;
		// Ÿ��	������
		if((age <= 13) && (age > 0)) {
			result = "���";
		} else if((age >= 14) && (age <= 18)) {
			result = "û�ҳ�";
		} else if(age > 18) {
			result = "����";
		} else {
			result = "�߸��� �Է�";
		} 
		
		System.out.println(result + " �Դϴ�.");
	}
}


