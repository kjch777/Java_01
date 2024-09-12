package com.kh.operatorPre;

import java.util.Scanner;

public class ControlPre {

	public static void main(String[] args) {
		
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		practice5();

	}
	
	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ������ �Է��ϼ��� : ");
		int num = sc.nextInt(); // Ű����� ���� �Է��ϱ�
		
		if(num > 0) { // �Է��� ���ڰ� ����� ��쿡�� �߰�ȣ {} �ȿ� �ִ� �ڵ� ����
			if((num % 2 == 0) && (num > 0)) { // ���ڰ� ¦���� ��쿡�� ���
				System.out.println("¦���Դϴ�.");
			} else { // ���ڰ� Ȧ���� ��쿡�� ���
				System.out.println("Ȧ���Դϴ�.");
			} 
			
		} else { // �Է��� ���ڰ� ������ ��쿡�� ���
			System.out.println("�����Դϴ�. ����� �Է��ϼ���!");
		}
				
	}

	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int ko = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int en = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int ma = sc.nextInt();
		
		int tS = ko + en + ma;
		double aS = (double) tS / 3.0;
		
		if((ko >= 40) && (en >= 40) && (ma >= 40) && (aS >= 60)) {
			
			System.out.println("���� ���� : " + ko + " ��");
			System.out.println("���� ���� : " + en + " ��");
			System.out.println("���� ���� : " + ma + " ��");
			System.out.println("���� ���� : " + tS + " ��");
			System.out.printf("��� ���� : %.2f ��\n" , aS);
			
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}

	public static void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��ϼ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��ϼ��� : ");
		double weight = sc.nextDouble();
		
		double BMI = weight / (height * height);
		System.out.printf("BMI ���� : %.2f\n" , BMI);
		
		if(BMI > 0) {
			
			if(BMI < 18.5) {
				System.out.println("��ü�� �Դϴ�.");
			} else if(BMI < 23) {
				System.out.println("����ü�� �Դϴ�.");
			} else if(BMI < 25) {
				System.out.println("��ü�� �Դϴ�.");
			} else if(BMI < 30) {
				System.out.println("���� �Դϴ�.");
			} 
		
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
			}
		
	}
	
	public static void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ������ �Է��ϼ��� : ");
		double mid = sc.nextDouble();
		System.out.print("�⸻ ��� ������ �Է��ϼ��� : ");
		double fin = sc.nextDouble();
		System.out.print("���� ������ �Է��ϼ��� : ");
		double asm = sc.nextDouble();
		System.out.print("�⼮ Ƚ���� �Է��ϼ��� : ");
		int atd = sc.nextInt();
		
		double midScr = mid * 0.2; // 100�� ������ 20%
		double finScr = fin * 0.3; // 100�� ������ 30%
		double asmScr = asm * 0.3; // 100�� ������ 30%
		double atdPer = (double) atd / (20 * 100);
		// /20*100 == * 0.2 �� ����.
		// atd / 20 == �⼮�� Ƚ���� ��ü ���� Ƚ��(20)�� ������ �⼮ ������ ���
		// double �Ҽ��� �ؿ� �ִ� ������ �������� ���Ͽ�
		// �Ǽ��� �� ���� 100 �� ���ؼ� ������� ��ȯ
		double atdScr = atdPer * 0.2; // 100�� ���� 0.2
		// * 0.2 == /20*100 �� ����.
		double totScr = midScr + finScr + asmScr + atdScr;
		
		if((totScr >= 70) && (atdPer >= 70)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println("========== ��� ===========");
		System.out.println("�߰���� ����(20�� ����) : " + midScr);
		System.out.println("�⸻��� ����(30�� ����) : " + finScr);
		System.out.println("��	�� ����(30�� ����) : " + asmScr);
		System.out.println("��	�� Ƚ��(20�� ����) : " + atdScr);
		System.out.println("��		��		�� : " + totScr);
		
	}
	
	public static void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �˰� ���� ���� ���ڸ� �Է� �ϼ��� : ");
		int month = sc.nextInt(); // Ű����� �Է��� ��(����)
		int daysMonth; // �ش��ϴ� ���� �ϼ�
		
		switch (month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
			daysMonth = 31;
			break;
		case 2 :
			daysMonth = 28;
			break;
		case 4 : case 6 : case 9 : case 11 :  
			daysMonth = 30;
			break; // break �� �Ἥ ���� ���͵� switch �� �ٱ��� �ڵ�� ����ȴ�.
		default :
			//daysMonth = 0;
			System.out.println(month + " ���� �߸� �Էµ� ���Դϴ�.");
			return; // return �� �Ἥ ���� ������ return �ؿ� �ۼ��� �ڵ�� ������� �ʴ´�.
		}
		
		System.out.println(month + " ���� " + daysMonth + " �ϱ��� �ֽ��ϴ�.");
		
	}

}
