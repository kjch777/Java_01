package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	
	// ���� �޴��� ���� �Է��ϰ�, �� �� �ִ� â �����
	private Scanner sc = new Scanner(System.in);
	private SnackController scr = new SnackController();
	
	// ��� void �޼��� : ���� ��ȯ���� �ʰ�, ��¸� �ϴ� �޼���
	public void menu() {
		System.out.println("�԰���� ������ �Է��ϼ���!");
		System.out.print("���� : ");
		String kind = sc.next();
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print(" �� : ");
		String flavor = sc.next();
		System.out.print("���� : ");
		int numOf = sc.nextInt();
		System.out.print("���� : ");
		int price = sc.nextInt();
		
		System.out.println("������ ������ Ȯ�� �Ͻðڽ��ϱ�? (y / n)");
		String answer = sc.next();
		
		// ���� y �� �����ٸ�, ������ ���� ����ϱ�
		// .equalsIgnoreCase �� ����ϸ�, ��/�ҹ��� ���̸� �����ϰ� ����� �� �ִ�.
		if(answer.equalsIgnoreCase("y")) { 
			// ������ ���� ���
			System.out.println(scr.saveData(kind, name, flavor, numOf, price));
			// ������ ������ �� ������ ����ؼ� Ȯ�� 
			System.out.println(scr.confirmData());
		} else if(answer.equals("n")) {	
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		
	}
		
}


