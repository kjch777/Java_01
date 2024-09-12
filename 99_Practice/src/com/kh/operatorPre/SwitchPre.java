package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchPre {

	public static void main(String[] args) {
		
		//method1();
		//method2();
		//method3();
		//method4();
		method5();

	}
	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int day = sc.nextInt(); // Ű����� �Է� �� ���� �޾� ����
		
		switch(day) {
		case 1 : 
			System.out.println("������ �Դϴ�.");
			break;
		case 2 :
			System.out.println("ȭ���� �Դϴ�.");
			break;
		default : 
			System.out.println("�ƹ� ���ϵ� �ƴմϴ�.");
		}
		
	}

	public static void method2() {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("���ϴ� �޴� ��ȣ�� �Է��ϼ��� : ");
		int menuNumber = sc.nextInt();
		
		switch (menuNumber) {
		case 1 :
			System.out.println("�Ƹ޸�ī�� ���Խ��ϴ�.");
			break;
		case 2 : 
			System.out.println("ī��� ���Խ��ϴ�.");
			break;
		case 3 : 
			System.out.println("������Ƽ ���Խ��ϴ�.");
			break;
		default :
			System.out.println("�߸��� �Է��Դϴ�. �ٽ� �̿��� �ּ���.");
		}
		
	}

	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˰���� ���� �̸��� �Է��ϼ��� : ");
		String city = sc.nextLine();
		
		switch (city) {
		case "����" : // String ���� �Է��Ҷ� ���� �յڷ� "" ū ����ǥ�� �Է��� �־�� �Ѵ�.
					// ���� char �� ��ٸ� '' ���� ����ǥ
			System.out.println("���ѹα�");
			break;
		case "����" : 
			System.out.println("�̱�");
			break;
		case "��ũ��" : 
			System.out.println("���þ�");
			break;
		case "����" : 
			System.out.println("����");
			break;
		case "�õ��" : 
			System.out.println("ȣ��");
			break;
		default : 
			System.out.println("���� �н����� ���� �����Դϴ�.");
		}
		
	}

	public static void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1���� 12������ ������ �ϳ��� �Է��ϼ��� : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 3 : case 4 : case 5 : 
			System.out.println(month + " ���� ���Դϴ�.");
			break;
		case 6 : case 7 : case 8 : 
			System.out.println(month + " ���� �����Դϴ�.");
			break;
		case 9 : case 10 : case 11 : 
			System.out.println(month + " ���� �����Դϴ�.");
			break;
		case 12 : case 1 : case 2 : 
			System.out.println(month + " ���� �ܿ��Դϴ�.");
			break;
		default :
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
	}

	public static void method5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("A, B, C, D �� �ش��ϴ� ����� �Է��ϼ��� : ");
		char grade = sc.next().charAt(0);
		// charAt �� ȣ���ؼ� �ۼ��� ���ڿ� �߿� () ���� ���ڿ� �ش��ϴ� �ڸ����� ���ڸ� ����ϰڴٴ� �ǹ��̴�.
		switch (grade) {
		case 'A' : case 'a' :
			System.out.println("4.0");
			break;
		case 'B' : case 'b' :
			System.out.println("3.0");
			break;
		case 'C' : case 'c' :
			System.out.println("2.0");
			break;
		case 'D' : case 'd' :
			System.out.println("1.0");
			break;
		default :
			System.out.println("�Է��� ��޿� �ش��ϴ� ������ �����ϴ�.");
		}
	}

}
