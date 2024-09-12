package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {

	public static void main(String[] args) {
		//takeAtaxi();
		//howScore();
		//whatDaySc();
		whatDayIf();

	}

	public static void takeAtaxi() {
		// if ���� ����Ͽ� 
		// �Է��� ���� 3_000�� �̻��� ��쿡�� 
		// �ýø� Ż ������ �����
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �ִ� ���� �׼��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		
		if (money >= 3_000) {
			System.out.println("�ýø� Ż���? (��/�ƴϿ�)");
			String answer = sc.next();
			
			switch (answer) { // answer ���� ���� ó��
			case "��" :
				System.out.println("�ýø� �����ϴ�.");
				break;
			case "�ƴϿ�" :
				System.out.println("�ýø� Ÿ�� �ʾҽ��ϴ�.");
				break;
			default : 
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		} else {
			System.out.println("3000�� �̸��Դϴ�. �ܾ��� �����մϴ�.");
		}
		
		
	}
	
	public static void howScore() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt(); // Ű����� ���� �Է�
		String grade;
		
		if ((score>0) && (score>=60)) {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else {
				grade = "D";
			}
			System.out.println(grade + " �����Դϴ�.");
		} else {
			grade = "F";
			System.out.println(grade + " �����Դϴ�.");
			System.out.print("����� �Ͻðڽ��ϱ�? (yes/no) : ");
			String reScore = sc.next();
			
			switch (reScore) {
			case "YES" : case "yes" : 
				System.out.println("����� ��û�� �Ϸ� �Ǿ����ϴ�.");
				break;
			case "NO" : case "no" :
				System.out.println("����� ��û�� ���� �ʾҽ��ϴ�.");
				break;
				default : 
					System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		
		
		
	}

	public static void whatDaySc() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		char day = sc.next().charAt(0);
		
		switch (day) {
		case '��' : case '��' : case '��' :
			System.out.println("�ｺ");
			break;
		case 'ȭ' : case '��' :
			System.out.println("����");
			break;
		case '��' : case '��' : 
			System.out.print("�ָ��Դϴ�. ������ �����ǰ���? (��/�ƴϿ�) : ");
			String answer = sc.next();
			switch (answer) {
			case "��" :
				System.out.println("�˰ڽ��ϴ�. ǫ ������!");
				break;
			case "�ƴϿ�" : 
				System.out.println("� Ȱ���� �ϰ� ��������? (1 ~ 4�� ��1) : ");
				int act = sc.nextInt();
				switch (act) {
				case 1 : 
					System.out.println("���");
					break;
				case 2 : 
					System.out.println("����");
					break;
				case 3 : 
					System.out.println("����");
					break;
				default :
					System.out.print("�߸��� �Է��Դϴ�.");
					return;
				}
			
			}
			break; // ��ġ�� ������ �߿���.
			default :
			System.out.print("�߸��� �Է��Դϴ�.");
			return;
		}
	
	}
	
	public static void whatDayIf() {
		
		// �� �޼��� �ȿ��� switch �� default �� ������ 
		// ���� �ݵ�� ������ �ʾƵ� �Ǵ°� ������...???
		// �� switch �� �ȿ���, case �� break �� ������ ���� ���ƾ� �Ѵ�.
		// default ���� �ݵ�� return �� ���־�� �ϳ�?
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		char day = sc.next().charAt(0);
		String result;
		
		switch(day) {
		case '��' : case '��' : case '��' :
			System.out.println("�ｺ");
			break;
		case 'ȭ' : case '��' : 
			System.out.println("����");
			break;
		case '��' : case '��' : 
			System.out.print("�ָ��Դϴ�. ������ �����ǰ���? (��/�ƴϿ�) : ");
			String answer = sc.next();
			if (answer.equals("��")) {
				System.out.println("ǫ ������!");
			} else if (answer.equals("�ƴϿ�")) {
				System.out.println("�� �� �ſ���?");
				System.out.print("(1. ��� / 2. ���� / 3. ����) : ");
				int act = sc.nextInt();
				switch (act) {
				case 1 : 
					result = "���";
					break;
				case 2 :
					result = "����";
					break;
				case 3 :
					result = "����";
					break;
				default : 
					System.out.println("�߸��� �Է��Դϴ�.");
					return;
				}
				System.out.println(result + "�� �����̿���.");
			} else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			break;
		}
		
		
	}

}
