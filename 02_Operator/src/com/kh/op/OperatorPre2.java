package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {
	
	public static void method1() {
		// ��ĳ�ʷ� �Է��� ���� true ���� false ���� �ۼ� �غ� ��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a�� ���� �Է��ϼ���. : ");
		int a = sc.nextInt();
		System.out.print("b�� ���� �Է��ϼ���. : ");
		int b = sc.nextInt();
		System.out.println("a : " + a + ", " + "b : " + b);
		System.out.println("a �� b �� ������ a == b �� true �� ���� ���Դϴ�.");
		System.out.println("a == b : " + (a == b));
		System.out.println("a �� b �� �ٸ��� a != b �� true �� ���� ���Դϴ�.");
		System.out.println("a != b : " + (a != b));
		
		sc.close();
		
	}
	
	// method2 �� ���� ���� �����ڸ� ����� ����,
	// �� �����ڸ� ����ؼ� ���� ������ �ٸ��� Ȯ���غ� ��
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("c�� ���� �Է��ϼ��� : ");
		int c = sc.nextInt();
		System.out.println("�Է��� c�� �� : " + c);
		// c �� ������ 11�� �Է��ߴٸ�
		System.out.print("d�� ���� �Է��ϼ��� : ");
		int d = sc.nextInt();
		
		int e = ++c; // e = c + 1 = c ���� e = c = 12
		
		// int f = ++c; �� �Ѵٸ�, f�� ���� ��� ��������
		// System.out.println("f : " + f); f�� ����غ���
		
		System.out.println("c : " + c + ", d : " + d + ", e : " + e);
		System.out.println("c == d : " + (c == d));
		System.out.println("c == e : " + (c == e));
		
		int f = ++c; // f = c + 1 = c ���� f = c = 12 + 1 = 13
		System.out.println("f : " + f);
		
		sc.close();
	}

	//method3 ���� ����ϱ�
	
	public static void method3() {
		/* ���� ��ǥ : ��� ����� ������ ���� ���� �������� �Ѵ�.
		 * �� ��, �ο� ���� ���� ������ Ű����� �Է� �ް�,
		 * 1�δ� �����ϰ� ���� ���� ������ ������,
		 * ���� �ְ� ���� ������ ������ ��� �غ���.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� ���� �Է� �ϼ���. : ");
		int people = sc.nextInt(); // �ο� ��
		
		System.out.println("���� ��Ƽ�� " + people + " ���� �����߽��ϴ�.");
		System.out.print("���� ������ �ִ� ������ �� ������ �Է� �ϼ���. : ");
		int candies = sc.nextInt();
		System.out.println("���� ������ �ִ� ������ �� " + candies + " �Դϴ�.");
		
		System.out.println("�׷��ٸ� 1�δ� �����ϰ� ���� ���� ������ ������ �� ���Դϱ�?");
		
		// �� ��� �� �����ϰ� ���� ���� ������ ���� = ������ �� ���� / �� �ο� �� 
		
		int perPerson = candies / people;
		System.out.println("1�δ� �����ϰ� �������� ������ ������ " + perPerson + " ���Դϴ�.");
		System.out.println("�׷��ٸ� ���� ������ ������ �� ���Դϱ�?");
		// ���� ������ ���� = ������ �� ���� % �ο� ��;
		
		int remain = candies % people;
		System.out.println("���� ������ ������ " + remain + " ���Դϴ�.");
		
		sc.close();
		
	}
	
	public static void main(String[] args) {
		// ���� ����� method �� �ۼ�
		method3();

	}

}
