package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		/*
		// for ���� Ȱ���� �迭 ���
		
		int numbers[] = new int[5];
		// 1 ���� 4 ���� �迭�� ���ڸ� �־��
		// index 0 ���� �����ϱ� ������ i = 0;
		// length : ����
		// numbers.length : numbers �� �ִ� ���̸� ���ϰڴٴ� ��
		System.out.println("�ִ� ���� : " + numbers.length);
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers[" + i + "] = " + i);
		}
		*/
		
		// method1();
		ArrayEx2 ae = new ArrayEx2();
		ae.practice17();
		
	}
	
	public static void method1() {
		
		// ���� 0 1 2 �� ���� 10 20 30 �� �ְ� ����ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("0 1 2 �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int[] num1 = new int[3];
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		if((0 <= num) && (num < 3)) {
			for(int i = 0; i < num1.length; i++) {
				if(i == 0) {
					System.out.println(num1[i]);
					return;
				} else if(i == 1) {
					System.out.println(num1[i]);
					return;
				} else if(i == 2) {
					System.out.println(num1[i]);
					return;
				}
			}
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
	}
	
	public static void method2() {
		
		// ���ڿ�  �� ȭ �� �� �� �� ��  �� �ڸ��� � ������ �� �ִ��� ����ϱ�
				String[] str = {"��", "ȭ", "��", "��", "��", "��", "��"};
				//          [] �� �� �ڸ��� �ۼ��ص� �������.
				for(int i = 0; i < str.length; i++) {
					System.out.println(str[i] + " ");
				}
				
				// �Ǽ� index 2 ���� ����� ���
				double[] dbl = new double[3];
				dbl[0] = 10.1;
				dbl[1] = 11.2;
				dbl[2] = 12.3;
				
				for(int i = 0; i < dbl.length; i++) {
					System.out.print(dbl[i] + " ");
				}
				
				// ���� A B C �ְ� �� �ڸ� ����ϱ�
				char chr[] = {'A', 'B', 'C'};
				
				for(int i = 0; i < chr.length; i++) {
					System.out.println(chr[i] + " ");
				}
				
	}

	public void practice17() {
		
		String[] chickenMenu = {"�Ķ��̵� ġŲ", "��� ġŲ", "���� ġŲ"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�԰� ���� ġŲ �̸��� �Է� �ϼ��� : ");
		String inputChic = sc.nextLine();
		
		// �迭�� ����ڰ� �Է��� ġŲ�� �ִ��� �˻��ϱ�
		boolean found = false;
		
		// for - each ���� ����Ͽ� ġŲ�� �ִ��� Ȯ���ϱ�
		for(String Chic : chickenMenu) {
			
			if(Chic.equals(inputChic)) { // ���� ġŲ�� �����Ѵٸ�, found = true; break;
				found = true;
				break;
			}
			
		} 
		
		// ���� ġŲ�� �����Ѵٸ�, ��� ���� �̶�� ����ϰ�,
		if(found) {
			System.out.println(inputChic + "�� ��� �����մϴ�!");
		} else { // �������� �ʴ´ٸ�, ����ġŲ�� ���� �޴� �Դϴ�. ����ϱ�
			System.out.println(inputChic + "��(��) �������� �ʴ� �޴��Դϴ�.");
		}
		
	}

}
