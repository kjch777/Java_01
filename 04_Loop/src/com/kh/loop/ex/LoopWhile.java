package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhile {
	/*
	 while(���ǽ�) : ���� Ȯ������ ���� �ݺ��� ����Ѵ�.
	  
	 while(���ǽ��� ���� ���) {
	 						���ǽ��� ���� ��쿡 ����
	 }
	 						���ǽ��� ������ ��� ���� ���� 
	  
	 ���� �ڵ� 1
	 	while(true){
	 		System.out.println("���� �ݺ�);
	 	} 
	 
	 ���� �ڵ� 2
	 	while(false){
	 		System.out.println("�������� ���� ä�� ����");
	 	}
	  
	 */
	public static void main(String[] args) {
		// �������� �����ϴ� ���� �޼���
		
		//inLoop();
		//whileLoop();
		whileLoopEX();

	}

	public static void inLoop() {
		// �������� ���������� ������, �ڵ带 �ۼ��� �� �ִ� �޼���
		
		while(true) {
			System.out.println("���� ����");
		}
	}
	
	public static void outLoop() {
		
		/*	while(false) {
				System.out.println("���� �ȵ�");
		}	*/
		
	}
	
	public static void whileLoop() { // i �� 3 �̻��̸� ������ ����
		
		int i = 1;
		while(i <= 2) { // ������ ���� �� ������ �ڵ�
			
			System.out.println("i�� �� : " + i);
			i++;
		}
		
	}
	
	public static void whileLoopEX() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // while () �ȿ� true ��� �ᵵ ������ �ȴ�.
			System.out.println("1. ���� / 2. ����");
			System.out.print("���ϴ� ��ȣ�� �Է��ϼ��� : ");
			
			int num = sc.nextInt();
			switch(num) {
			case 1 :
				System.out.println("���α׷��� �����մϴ�.");
				break;
			case 2 : 
				System.out.println("���α׷��� �����մϴ�.");
				//break;
				return; 
				// break �� return ��� case �� Ż���ϴ� �����̱� ������, ���� ����� ���� ����.
				// break �� ��� while �� true �� ����, ������� �ʰ� ��� �ݺ��ȴ�.
				// return �� ��� while �� true ����, while �ڵ带 Ż���ؼ� ����ȴ�.
			default : 
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��� �ּ���.");
				System.out.println("1. ���� / 2. ����");
				System.out.print("���ϴ� ��ȣ�� �Է��ϼ��� : ");
			}
		}
		
		
		
	}

}
