package com.kh.practice.numRange.view;

import java.util.Scanner;

public class NumberMenu {

// �޼���
	// ��� void
	public void menu() {
		// ����ڿ��� �� ������ �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		sc.nextLine(); // ���� �����
		System.out.println("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		sc.nextLine(); // ���� �����
		
		// �Է� ���� �� ������ NumberController �� checkDouble() �� �Ű������� �Ѱ��־� ��ȯ ���� ����ϱ�
	}
	
}
