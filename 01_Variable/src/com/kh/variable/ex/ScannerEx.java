package com.kh.variable.ex;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		/*
		 Scanner Ŭ����
		 
		 ����ڷκ��� Ű���� �Է��� �ޱ� ���� Java���� �����ϴ� Ŭ����
		 
		 �⺻���� �����Ǿ� �ִ� ���� �ƴϱ� ������ (�⺻ �����̸� �ҹ��ڷ� ����)
		 ��� ��Ű�� �̸� �ؿ� import java.util ��Ű�� ǥ�⸦ ���� �� ����� �� ����
		 import ��Ȯ�� ǥ��� : import java.util.Scanner;
		 import �� �����´�, �����Ѵٴ� �ǹ�
		 
		 Scanner.next() : ���� �Ұ�, �ܾ�(String) 1�� �Է� ����
		 Scanner.nextLine() : ������ �����Ҽ� �ְ�, ���ڿ� 1�� �Է� ����
		 Scanner.nextInt() : int�� ���� 1�� �Է�
		 Scanner.nextLong() : long�� ���� 1�� �Է�
		 Scanner.nextDouble() : �Ǽ� 1�� �Է�
		 
		 �̿ܿ��� Scanner Ŭ���� �ȿ��� �������� ����� ����
		 ��ĳ�ʴ� �ҷ��� ���� close�� ����ؼ� ������ �ݾ��ش� ��� ǥ�ø� ���ִ°� ������ (�ʼ��� �ƴ�)
		 * */ 

		// Scanner ��� �غ���
		// 1. Ŭ���� ���� import ������ ���ܾ� ��
		// 2. Scanner ��ü ���
		Scanner sc = new Scanner(System.in);
		// 3. System.in �� ����ؼ� Ű����� �Է��ϴ� ���� ���� �� �ֵ��� ��
		System.out.print("���� �Է� : ");
		int num1 = sc.nextInt(); // ������ �Էµ� ������ ������ num1 �� ����
		
		System.out.print("���� �Է� 2 : ");
		int num2 = sc.nextInt(); // ������ �Էµ� ������ ������ num2 �� ����
		
		// �Ǽ� �Է� nextDouble �� ����ؼ� num3 ���� �Ǽ� �Է� �����
		System.out.print("�Ǽ� �Է� : ");
		double num3 = sc.nextDouble();
		// next �� ����ؼ� �ܾ� �Է� 2�� �ϱ� : ������ word1 word2
		System.out.print("�ܾ� 2�� �Է� : ");
		String word1 = sc.next();
		// Scanner �� �̿��ؼ� �Է��� ������ ���
		// System.out.print �� �̿��ؼ� ����� ���� �Էµƴ���
		// ������ ������ Ȯ�� ����� ���ִ� ������ ���̴� ���� ����
		String word2 = sc.next();
		
		//***********************************************
		// next() / nextInt() / nextDouble() ���� �ۼ��� ����
		// nextLine() �� �ۼ��ؾ��ϴ� ��Ȳ�� ����
		// nextLine() �� �̸� �ѹ� �ۼ��ϰ� ���
		
		sc.nextLine(); // next() �ڿ� �����ִ� ���۰��� Line �ȿ� �־���
		// �׷���, ���۰��� �츮�� ������ ���ų� ������ �ؾ��� ������ ���� ������
		// �տ� �ڷ����̳� �������� ����ؼ� ���۸� �־� �����ؾ��� ������ ����
		// ����, sc.nextLine() �� ȣ���Ͽ� ���� �� ���͸� �����Ѵ�
		
		
		System.out.print("���� �Է� : ");
		String str = sc.nextLine();
		
		
		// 4. System.out �� ����ؼ� Ű����� �ۼ��� ���� ����ϱ�
		System.out.println("���� 1�� �� : " + num1);
		System.out.println("���� 2�� �� : " + num2);
		System.out.println("�Ǽ� �� : " + num3);
		System.out.println("�ܾ� 2�� : " + word1 + ", " + word2);
		System.out.println("�߰��� ���� : " + str);
		// 5. Scanner close �� ����ؼ� �ݾ��ֱ�
		sc.close(); 
		// Scanner ����� �� �ߴٸ�, �� �̻� ������ �������� �ʰ� �ϱ� ����
	    // Scanner �� �����ϴ� close �� ����ؼ� �ݾ��ش�
		
		
	}

}

