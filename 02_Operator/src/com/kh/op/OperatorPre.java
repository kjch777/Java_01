package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	// ���� ��� �Ǵ� ���� �޼���
	public static void main(String[] args) {
		method1();
	}
	public static void method1() {
		// ���� ��� �Ǵ� �޼��尡 �ƴ϶�, ���� �ʿ��� �� ������ ����� �� �ִ� �޼���
		// �޼����, Ư�� ���³� ����� �����س��� �����̴�.
		// static �̶�, ������ �̶�� ���� ������ �ִ�.
		// static �� �ٴ´ٴ� ���� �ڷ����̳� ������ ��Ƽ� ���°� �ƴ϶�, 
		// �ܵ�����, ���������� �޸𸮿��� ����� �� ������ ��Ÿ���� ǥ���̴�.
		
		
		
		// 1. int num1 = 10, int num2 = 3
		//    ���ϱ� ���� ���ϱ� ������ ��� ����ϱ�
		
		// 2. double num3 = 2.5, double num4 = 3.5
		//    ���ϱ� ���� ���ϱ� ������ ��� ����ϱ�
		
		int num1 = 10;
		int num2 = 3;
		
		int sum1 = num1 + num2;
		int dif1 = num1 - num2;
		int mul1 = num1 * num2;
		int div1 = num1 / num2;
		
		System.out.println("int�� ���� ��� : " + sum1);
		System.out.println("int�� ���� ��� : " + dif1);
		System.out.println("int�� ���� ��� : " + mul1);
		System.out.println("int�� ������ ��� : " + div1);
		
		double num3 = 2.5;
		double num4 = 3.5;
		
		double sum2 = num3 + num4;
		double sub1 = num3 - num4;
		double mul2 = num3 * num4;
		double div2 = num3 / num4;
		
		System.out.println("double�� ���� ��� : " + sum2);
		System.out.println("double�� ���� ��� : " + sub1);
		System.out.println("double�� ���� ��� : " + mul2);
		System.out.println("double�� ������ ��� : " + div2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� ���� a ���� ���� �Է��ϼ���. : ");
		int a = sc.nextInt();
		System.out.print("���ϴ� ���� b ���� ���� �Է��ϼ���. : ");
		int b = sc.nextInt();
		
		int sum3 = a+b;
		int dif2 = a-b;
		int mul3 = a*b;
		int div3 = a/b;
		
		System.out.println("���� a�� ���� b�� ���� ��� : " + sum3);
		System.out.println("���� a�� ���� b�� ���� ��� : " + dif2);
		System.out.println("���� a�� ���� b�� ���� ��� : " + mul3);
		System.out.println("���� a�� ���� b�� ������ ��� : " + div3);
		
		System.out.println("���ϴ� �Ǽ� c ���� ���� �Է��ϼ���. : ");
		double c = sc.nextDouble();
		System.out.println("���ϴ� �Ǽ� d ���� ���� �Է��ϼ���. : ");
		double d = sc.nextDouble();
		
		double sum4 = c+d;
		double sub2 = c-d;
		double mul4 = c*d;
		double div4 = c/d;
		
		System.out.println("�Ǽ� c�� �Ǽ� d�� ���� ��� : " + sum4);
		System.out.println("�Ǽ� c�� �Ǽ� d�� ���� ��� : " + sub2);
		System.out.println("�Ǽ� c�� �Ǽ� d�� ���� ��� : " + mul4);
		System.out.println("�Ǽ� c�� �Ǽ� d�� ������ ��� : " + div4);
		
		sc.close();
		
		
		
	}

}
