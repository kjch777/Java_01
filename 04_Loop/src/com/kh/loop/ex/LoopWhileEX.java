package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEX {
	/*
	 while ���� ����Ͽ�
	 4���� �Է��ϸ� ���α׷��� �����ϴ� �ڵ� �ۼ��غ��� 
	 */
	public static void main(String[] args) {
		/*
		 public �� ��𼭵� ���� ���� �ϴٴ� �� (��ü����)
		 protected �� ���� ���� �ȿ����� ���� ����
		 default �� ���� ���� �ȿ��� ���� ���� ������, protected ���ٴ� ���������� ���� ����
		 private �� �� class �ȿ����� ���� ����, �ۼ��� ���� �ȿ����� ���� ����
		 �ַ� public �� private �� ��� �Ѵ�. 
		 */ 
		
		// void �� ��ȯ�ϴ� �� ���� �ٷ� ��� �� �� ���
		// ���߿��� static ���� ��� 
		
		//method1();
		//khī��();
		//getMoney();
		//allNumber();
		//tree();
		//method2();
		//getCoffee();
		//iLovePork();

	}
	
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���α׷� ����Դϴ�.");
		
		while(true) {
			System.out.println("1. �����ϱ� / 2. �����ϱ� / 3. ���ڱ� / 4. ���α׷� ����"
							  + "\n���ϴ� ��ȣ�� �Է��ϼ��� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.println("������ �����մϴ�.");
				return;
			case 2 : 
				System.out.println("������ �����մϴ�.");
				return;
			case 3 : 
				System.out.println("���� �ڰڽ��ϴ�.");
				return;
			case 4 : 
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("�߸��� ��ȣ�Դϴ�. �ٽ� �Է��� �ּ���.");
				break;
			}
		
		}
	}

	public static void khī��() { // �޼��� �� �ѱ��� ����ص� ������ �ȴ�!
		Scanner sc = new Scanner(System.in);
		System.out.println("kh ī�信 ���� ���� ȯ���մϴ� ^^!");
		
			while(true) {
				System.out.println("���Ͻô� �޴��� �Է����ּ���~\n"
								  + "1 �Ƹ޸�ī�� / 2 ī��� / 3 ���� / 4 ������Ƽ / 5 �ֹ���� : ");
				String menu = sc.next();
				
				switch(menu) {
				case "1" : case "�Ƹ޸�ī��" :
					System.out.println("�Ƹ޸�ī�� �ֹ� �Ǿ����ϴ�."
									  + " �ֹ� �߰� �Ͻ÷���");
					break;
				case "2" : case "ī���" :
					System.out.println("ī��� �ֹ� �Ǿ����ϴ�."
									  + " �ֹ� �߰� �Ͻ÷���");
					break;
				case "3" : case "����" :
					System.out.println("���� �ֹ� �Ǿ����ϴ�."
									  + " �ֹ� �߰� �Ͻ÷���");
					break;
				case "4" : case "������Ƽ" :
					System.out.println("������Ƽ �ֹ� �Ǿ����ϴ�."
									  + " �ֹ� �߰� �Ͻ÷���");
					break;
				case "5" : case "�ֹ����" :
					System.out.println("�ֹ��� ��� �Ǿ����ϴ�. �ȳ��� ������ ~ ");
					return;
				default :
					System.out.println("��ȣ�� �߸� �Է��߽��ϴ�. �ٽ� �Է��� �ּ���.");
				}
		
			}
		
	}

	public static void getMoney() {
		// Ŀ�� 10 ��		Ŀ�ǰ� 300��
		int coffee = 10;
		int money = 300;
		
		// ���� ������ �� 0���� �ƴ϶��, Ŀ�Ǹ� ��� �����ϰ�
		// Ŀ�ǰ� �� �����Ǹ�, �ǸŸ� �����Ѵ�.
		
		while(money > 0) {
			System.out.println("Ŀ�Ǹ� �帱�Կ�");
			// Ŀ�Ǵ� �� 10��		1�� �����ߴٸ� -1
			coffee--;
			System.out.println("���� Ŀ�Ǵ� �� " + coffee + " �� �Դϴ�.");
			// Ŀ�ǰ� ��� �����ƴٸ� �ǸŸ� ����
			if(coffee == 0) {
				System.out.println("Ŀ�ǰ� �� �����ƽ��ϴ�. �ǸŸ� �����մϴ�.");
				return;
			}
		}
		
	}

	public static void allNumber() { // 1 ~ 5 ����ϱ�
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++; // num = num + 1;
		}
	}

	public static void tree() {
		int hit = 0;
		while(hit < 10) {
			hit++;
			System.out.println("������ " + hit + " �� ������ϴ�!");
			if(hit == 10) {
				System.out.println("������ �Ѿ�ϴ�!");
			}
		}
	}

	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ���� ū ������ �Է��� �ּ��� : ");
		int num = sc.nextInt();
		
		if(num < 1) {
			System.out.println("1 �̻��� ������ �Է��� �ּ��� : ");
			// num = sc.nextInt(); �ϴ� ���Ҵ�...
		} else {
			System.out.println("1 ���� " + num + " ������ ������ ��� ����մϴ�.");
			int ber = 1;
			while(ber <= num) {
				System.out.println(ber);
				ber++;
			}
		}
	}
	
	public static void getCoffee() {
		// Ŀ�ǰ� 100��	���� ������ Ŀ�Ǹ� �� ��� �ڵ�
		Scanner sc = new Scanner(System.in);
		int coffeePrice = 100;
		System.out.println("ī�信 ���� ���� ȯ���մϴ�!");
		System.out.print("���� ������ �ִ� �ݾ��� �Է��� �ּ��� : ");
		int money = sc.nextInt();
		
		while(money < coffeePrice) {
			System.out.println("�ܾ��� �����մϴ�. �ٽ� Ȯ���� �ּ���.");
			System.out.print("���� ������ �ִ� �ݾ��� �ٽ� �Է��� �ּ��� : ");
			money = sc.nextInt(); 
		}
		
		int change = money - coffeePrice;
		System.out.println("Ŀ�Ǹ� �����߽��ϴ�. �Ž������� " + change + " �� �Դϴ�.");
		
	}

	public static void iLovePork() {
		// ���� 10_000 �� �̻� ���� ���, �������� ��Ű�� ���ϴ� �ڵ�
		Scanner sc = new Scanner(System.in);
		int porkPrice = 10_000;
		System.out.print("������ �ִ� �ݾ��� �Է��ϼ��� : ");
		int money = sc.nextInt();
		
		while(money < porkPrice) {
			System.out.print("�ܾ��� �����մϴ�.\n�ٽ� �Է��� �ּ��� : ");
			money = sc.nextInt();
		}
		int change = money - porkPrice;
		System.out.println("�ֹ��� �Ϸ�ƽ��ϴ�.\n�Ž������� " + change + " �� �Դϴ�.");
	}

}