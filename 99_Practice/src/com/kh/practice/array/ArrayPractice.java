package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int num[] = new int[11];
		
		for(int i = 1; i < num.length; i++) {
			num[i] = i;
			System.out.print(i + " ");
		}
	}

	public void practice2() {
		int num[] = new int[10];
							// length �� size ����, max �� ������ �ƴϴ�.
		for(int i = 0; i < num.length; i++) {
			num[i] = num.length - i; 
		 // num[0] =         10 - 0;	�� 10 
		 //	num[1] =         10 - 1;	��  9
		 // num[9] = 		 10 - 9;    ��  1 
			System.out.println("num[" + i + "] = " + num[i]);
		                     // num    [0]     =       10; 
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int size = sc.nextInt();
		
		// �Է� ���� ���� ũ���� �迭 ����
		int num[] = new int[size]; 
		
		        // size == num.length
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
	}

	public void practice4() {
						 //  0	   1	 2	    3	    4
		String[] fruits = {"���", "��", "����", "������", "����"};
						 // �߰�ȣ { } �� ����Ѵ�.
		System.out.println(fruits[1]);
	}

	public void practice6() {
		// int number[] = new int[5];
	    // index		    0 ���� [ ] ���� ���� - 1
		// length                 5
		
		// ���� ����
				// length  7
				// index   0	   1	   2	   3	   4	   5	   6
		String[] dotw = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		Scanner sc = new Scanner(System.in);
		
		// 0 ���� 6 ������ ���� �Է�
		System.out.print("0 ~ 6 �� �ϳ��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		// �Էµ� ���ڰ� 0 ~ 6 ������ ���ڰ� �´��� Ȯ�� ��, �´ٸ� ���� ���
		if((0 <= num) && (num <= 6)) { // .length �� ����ϸ� ���ڷ� �ν��ϰ� �ȴ�.
			System.out.println(dotw[num]);
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

	public void practice9() {
		
		// ���̰� 7�� �迭 �����ϱ�
		int[] num = new int[7]; // index : [0 1 2 3 4 5 6]		length : 7
		
		// ������ �̿��Ͽ� ���� ����ϱ�
			// 1. Random ��ü ��� : ���� �� ���� ������ ���� ��� ����
			// 2. Math ��ü���� random() �޼��� ��� : �� Random ��ü���ٴ� ���� ������ ��� ����
		for(int i = 0; i < num.length; i++) { // num �� ���� ���̸� �˱� ���� num.length �� ����ߴ�.
			num[i] = (int)(Math.random() * 45 + 1); 
			// 45�� ���� 0 ~ 44�� ������ ������, + 1�� �Ἥ 1 ~ 45�� ������ �Ѵ�.
			
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}

}
