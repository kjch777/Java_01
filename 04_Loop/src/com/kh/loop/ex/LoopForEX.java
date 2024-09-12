package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEX {
	
	// LoopForEX ���� ����ϱ� ���Ѵٸ�,
	// public static void guguDan ���� static �� �߰����� ����,
	// public static void main(String[] args){
	// 				   guguDan();
	// }
	
	// static �� �߰����� �ʰ� ����ϱ� ���Ѵٸ�,
	// ��¿� Ŭ������ ���� ����ϸ� �ȴ�.
	
	public void guguDan() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���α׷��� �����մϴ�.");
		// ����ڰ� 0 �� �Է��ϱ� ������ �������� �ݺ��ؼ� ����ϵ��� �����
		// �ݺ��ϱ� ���� while �� ���
		while(true) { // �������� �ѹ��� �鿩���� �Ϸ��� �巡�� �� Tab
			System.out.println("���Ḧ ���ϸ� 0 �� �Է��ϼ���");
			System.out.print("���ڸ� �Է��ϼ��� : ");
			int dan = sc.nextInt();
			
			// ���� ���� 0 �� �ԷµǸ� ���α׷� �����Ű��
			if (dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " X " + i + " = " + (dan * i));
			}
		}
	}
	
	public void guguDan2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Ųٷ� ����ϴ� ���α׷� �Դϴ�.");
		
		while(true) {
			System.out.println("�����Ϸ��� 0 �� �Է��ϼ���.");
			System.out.print("���ϴ� ���ڸ� �Է��ϼ��� : ");
			int dan = sc.nextInt();
			if(dan == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break; // for while switch ������ �ܵ����� ����� ����������,
					   // if ������ �ܵ����� ����� �Ұ����ϴ�.
			}
			// if 1 ~ 9 ������ �Է��� �����ϵ��� ������ �ɰ� ������
			if (dan < 1 || dan > 9) {
				System.out.println("1 ���� 9 ������ ���ڸ� �Է� ���ּ���.");
				continue; // continue �� ���� �������� �ʴ´�.
			}
			System.out.println("�Ųٷ� ��� �����մϴ�.");			
			for(int i = 9; i > 0; i--) {
				System.out.println(dan + " X " + i + " = " + (dan*i));
			}
		}
	}

	public void guguDan3() {
		// �������� 1�ܺ��� 9�ܱ��� ��� ���
		
		for(int dan=1; dan<=9; dan++) {
			System.out.println("===== " + dan + "��" + " =====");
			for(int num=1; num<=9; num++) {
				System.out.println(dan + " X " + num + " = " + (dan*num));
			}
		}
		
	}
	
	public void guguDan4() {
		for(int dan=2; dan<=9; dan++) {
			System.out.println("===== " + dan + " ��" + " =====");
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " X " + i + " = " + (dan*i));
			}
		}
	}

	public void randomNumber() {
		// Random �� �ҷ���, ���� ������ ���� ���� ���ڸ� �������� ����ϱ�
		Random ���� = new Random(); // �ζ� ��ȣ ���� �ϴ� �ڵ�ε� ��� ����
		
		int �������� = ����.nextInt(5); 
		// nextInt ( ) �Ұ�ȣ �ȿ� ���ڸ� �־ ���� ���� ����
		// ���� ������ ���� ���ڿ��� -1 �� �� ���ڸ� �־��־�� �Ѵ�.
		// ��ǻ�ʹ� ����� ������ �� �� 0 ���� �����ϱ� �����̴�.
		// ������ ���� �����س��� ������ -2^ ~ 2^
		System.out.println("�������� : " + ��������);
	}

	public void randomFor() {
		Random ���� = new Random();
		
		for(int Ƚ��=1; Ƚ�� <=3; Ƚ��++) {
			int �������� = ����.nextInt(10)+1;
			// �׳� 10 �� �ۼ��ϸ� 0 ~ 9 
			// �Ұ�ȣ �ٱ��� +1 �� �ۼ��ϸ� 1 ~ 10
			System.out.println("���� ���� " + Ƚ�� + " : " + ��������);
		}
		
	}

	public void randomFor2() {
		// for �� ����ؼ�, 1 ~ 45 ������ ���� �� 6���� ���ڸ� �������� ���
		Random rd = new Random();
		
		for(int ȸ��=1; ȸ��<=6; ȸ��++) {
			int rdN = rd.nextInt(45)+1;
			System.out.println("���� ���� " + ȸ�� + " : " + rdN);
		}
	}
	
	public void oddNum() { // Ȧ�� == odd
		for(int o = 1; o <= 10; o++) {
			if(o % 2 != 0) {
				System.out.println(o);
			}
		}
	}

	public void evenNum() { // ¦�� == even
		
		for(int even = 1; even <= 10; even++) {
			if(even % 2 == 0) {
				System.out.println(even);
			}
		} 
		
	}

	public void squareStar() {
		int star = 5;
		for(int i=0; i<star; i++) { // ���� ��� 0 1 2
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println(); // ���� ���ٷ� * �� ����� ����, �ٹٲ�
		}
	}

	public void fiveStar() {
		int star = 5;
		
		for (int i=0; i<star; i++) {
			for(int j=0; j<star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void numberGame() {
		// ���� ���߱� ����
		Scanner sc = new Scanner(System.in);
		// �������� ������� ���ڰ� �������� Ű����� �Է��Ͽ� ���ߴ� ����
		
		// �������� ���� �����
		Random rand = new Random();
		
		while(true) {
			int randNum = rand.nextInt(3)+1;
			for(int try1 = 1; try1 < 3; try1++) {
				System.out.println(try1 + " ��° �õ��Դϴ�.");
				System.out.print("���ڸ� ���纸���� : ");
				int guess = sc.nextInt(); // ����ڰ� �Է��� ���� �޾ƿ���
				
				if(guess == randNum) {
					System.out.println("�����մϴ�! ���ڸ� ������ϴ�!");
					break;
				} else if (guess < randNum){
					System.out.println("Ʋ�Ƚ��ϴ�. ���ڰ� �ʹ� �۽��ϴ�.");
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�. ���ڰ� �ʹ� Ů�ϴ�.");
				}
				
			}
			System.out.println("������ " + randNum + " �̾����ϴ�.");
			System.out.print("������ �ٽ� �����ϰڽ��ϱ�? (1�� �ٽ� ���� / 2�� ����) : ");
			int playAgain = sc.nextInt();
			if(playAgain == 2) {
				System.out.println("������ �����մϴ�.");
				break;
			} else if(playAgain != 2)
			
		}
	
	}
	
}
