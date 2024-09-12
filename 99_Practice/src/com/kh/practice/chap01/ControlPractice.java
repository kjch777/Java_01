package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��й�ȣ ����⸦ �����մϴ�.");
		
		while(true) {
			System.out.print("��й�ȣ�� �Է��ϼ��� ( 1000 ~ 9999 ) : ");
			int pw = sc.nextInt();
			
			if((pw < 1000) || (pw > 10000)) {
				System.out.println("4�ڸ��� �ƴմϴ�.");
				continue;
			}
			
			int[] digits = new int[4]; 	 // 4�ڸ��� ���, 0 ~ 3 �� ����
			digits[0] = pw / 1000; 		 // õ�� �ڸ�
			digits[1] = (pw / 100) % 10; // ���� �ڸ�
			digits[2] = (pw / 10) % 10;	 // ���� �ڸ�
			digits[3] = pw % 10; 		 // ���� �ڸ�
			
			boolean isTrue = true;
			// length : ũ��
			for(int i = 0; i < digits.length; i++) {
				for(int j = i + 1; j < digits.length; j++) {
					if(digits[i] == digits[j]) {
						isTrue = true;
						break;
					}
				}
				
				if(!isTrue) {
					break;
				}
				// �ߺ� ���ο� ���� �޼��� ���
				if(!isTrue) {
					System.out.println("�ߺ��� ���� �ֽ��ϴ�.");
				} else {
					System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
					break; // ��й�ȣ�� �� ��������ٸ� ��� ����
				}
			}
			
		}
	}
	
}
