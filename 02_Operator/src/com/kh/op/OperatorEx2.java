package com.kh.op;
// �޼����, Ư�� ���³� ����� �����س��� �����̴�.
// class �ٱ����� package�� import �� �ۼ��� �� �ְ�,
// �̿ܿ� �����ڰ� �����ϰ��� �ϴ� ������ class ���ο� �ۼ��ؾ� �Ѵ�.
import java.util.Scanner;

public class OperatorEx2 {
	// 1. �޼��� : ��ĳ�ʸ� ������� �ʴ� �޼���
	public static void method1() {
		int num1 = 20;
		int num2 = 5;
		int ���ϱ� = num1 + num2;
		int ���� = num1 - num2;
		int ���ϱ� = num1 * num2;
		int ������ = num1 / num2;
		System.out.println("���ϱ� : " + ���ϱ�);
		System.out.println("���� : " + ����);
		System.out.println("���ϱ� : " + ���ϱ�);
		System.out.println("������ : " + ������);
		
	}
	
	public static void method2() {
		double num3 = 1.4;
		double num4 = 2.5;
		
		double sum = num3 + num4;
		double sub = num3 - num4;
		double mul = num3 * num4;
		double div = num3 / num4;
		
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
	}
	
	public static void method3() {
		// method3() �� Scanner
		// method3 ���� �ִ� () �� ���߿� � ���� ���� �� ����ϸ�,
		// ���� ���� ���� ������ () �� �� �������� �����Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� A�� �Է��ϼ��� : ");
		int num5 = sc.nextInt(); // Ű����� �ۼ��� ���ڰ� num5 �� ���� �� �ְ� ���� ����
		System.out.print("���� B�� �Է��ϼ��� : ");
		int num6 = sc.nextInt(); // Ű����� �ۼ��� ���ڰ� num6 �� ���� �� �ְ� ���� ����
		int sum1 = num5 + num6;
		int sub1 = num5 - num6;
		int mul1 = num5 * num6;
		int div1 = num5 / num6;
		// Ű����� �ۼ��� ���ڸ� ���ϱ� ���� ���ϱ� ������ �� �� �ִ�.
		System.out.println("sum1 : " + sum1);
		System.out.println("sub1 : " + sub1);
		System.out.println("mul1 : " + mul1);
		System.out.println("div1 : " + div1);
		
		sc.close();
		
	}
	
	// method4 �� ���� Scanner �� double ���ϱ� ���� ���ϱ� ������ ���
	// double num7 = sc.nextDouble();
	// double num8 = sc.nextDouble();
	// ���ϱ� double sum2 
	// ���� double sub2
	// ���ϱ� double mul2
	// ������ double div2
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ� A�� �Է��ϼ���. �� ");
		double num7 = sc.nextDouble();
		System.out.print("�Ǽ� B�� �Է��ϼ���. �� ");
		double num8 = sc.nextDouble();
		
		double sum2 = num7 + num8;
		double sub2 = num7 - num8;
		double mul2 = num7 * num8;
		double div2 = num7 / num8;
		
		System.out.println("���� �� : " + sum2);
		System.out.println("�� �� : " + sub2);
		System.out.println("���� �� : " + mul2);
		System.out.println("���� �� : " + div2);
		
		sc.close();
	}

	public static void main(String[] args) {
		// ���� ���� ���� �޼���
		// �����δ� ���� �޼��� �߿��� ����ϰ� ���� �޼��常 �ۼ��� ��
		
		// ���࿡ method1() �ȿ� �ۼ��� ������ ����ϰ� �ʹٸ�,
		// method1(); �̶�� �ۼ� �� ����ϸ� �ȴ�.
		//method1();
		//method2();
		//method3();
		method4();
		
		

	}

}
