package com.kh.op;

import java.util.Scanner;

public class OperatorEx {
	// ���� �޼��� ȣ��
	public static void main(String[] args) {
		
		// ���� ��ĳ�ʷ� �Է� ���� ���� ��µǰ� �غ���
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ȳ��ϼ���. ���⿹��.");
		System.out.print("a ���� �Է��ϼ��� : ");
		int a = sc.nextInt();
		System.out.print("b ���� �Է��ϼ��� : ");
		int b = sc.nextInt();
		// a = b ���� ū ���� ���
		// b = a ���� ���� ���� ���
		
		
		// int a = 1;
		// int b = 3;
		System.out.println(a+b);
		
		int sum = a+b; // ����
		System.out.println("���� ��� sum : " + sum);
		
		int dif = a-b; // ����
		System.out.println("���� ��� dif : " + dif);
		
		int mul = a*b; // ����
		System.out.println("���� ��� mul : " + mul);
		
		int div = b/a; // ������
		System.out.println("������ ��� div : " + div);
		
		sc.close();
		
		

	}

}
