package com.kh.practice.set.view;

import java.util.Scanner;

import com.kh.practice.set.controller.LotteryController;
import com.kh.practice.set.model.vo.Lottery;

public class LotteryMenu {
	
// �ʵ�
	// ��ü ����
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
// �޼���
	// ��� void
	public void mainMenu() {
		System.out.println("===== �ζ� ��÷ ���α׷� =====");
		
		// ����ڰ� ���� ���� �޴��� ���� �� �� ����. ���� ������ �ݺ� ����. �� �޴��� ���� �� �ش� �޼���� �̵�.
		while(true) {
			System.out.println("===== ���� �޴� =====");
			System.out.println("1�� : ��÷�� �߰�");
			System.out.println("2�� : ��÷�� ����");
			System.out.println("3�� : ��÷�� Ȯ��");
			System.out.println("4�� : ��÷�� �����ؼ� Ȯ��");
			System.out.println("5�� : ��÷�� �˻�");
			System.out.println("9�� : ���α׷� ����");
			System.out.print("���ϴ� �޴��� ��ȣ�� �Է��ϼ��� : ");
			int menu = sc.nextInt();
			sc.nextLine(); // ���� �����
			
			switch(menu) {
			case 1 : 
				insertObject();
				break;
			case 2 :
				deleteObject();
				break;
			case 3 : 
				winObject();
				break;
			case 4 : 
				sortedWinObject();
				break;
			case 5 : 
				searchWinner();
				break;
			case 9 : 
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			}
		}


	}
	
	// ��÷�� �߰��� ���� ������ �޴� �޼���
	// ��÷�� �߰��� view �޼���
	public void insertObject() {
		
		// �߰��� ��÷�� �� �Է� �ޱ�
		System.out.print("�߰��� ��÷�� ���� �Է� �ϼ��� : ");
		int num = sc.nextInt();
		sc.nextLine(); // ���� �����
		
		// �Է� ���� ����ŭ ��÷�� �̸��� ��÷�� ��ȭ��ȣ �Է� �ޱ�
		for(int i = 1; i <= num; i++) {
			System.out.print("��÷�� �̸��� �Է� �ϼ��� : ");
			String name = sc.nextLine();
			System.out.print("��÷�� ��ȭ��ȣ�� �Է� �ϼ��� : ");
			String phone = sc.nextLine();
			
			// �Ű����� ������ (��, �ʼ� ������) �� �̿��� Lottery ��ü�� ��÷�� ���� ���� �ϱ�
			Lottery lottery = new Lottery(name, phone);
			// import �ؾ� �ϰ�             (�ڷ����� ������ ������, ������ �������� , �� ����)
			
			// Lottery ��ü�� lc (LotteryController) �� �� �ʵ忡 �̹� �ִ�! 
			// .insertObject() �� ����
			lc.insertObject(lottery);
			
			// ��, �ߺ��� ��÷�ڸ� �Է��߰ų�, �̹� ��÷ HashSet �� ����� �ִ� ���,
			// "�ߺ��� ����Դϴ�. �ٽ� �Է��ϼ���." ��� ��, �ٽ� ��ü �Է��ϰ� �ϱ�
			// ��� �Է��� �Ϸ�Ǹ� "�߰� �Ϸ� �Ǿ����ϴ�." ���
			
		}
		
	}
	
	// Ư�� ��÷�� ���� ����� �˸��� �޼��� // �˸���, void == ���
	// ��÷�� ������ view �޼���
	public void deleteObject() {
		// ������ ����� �̸��� ��ȭ ��ȣ�� �ް�,
		System.out.println("������ ����� �̸��� ��ȭ ��ȣ�� �Է� �ϼ���.");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("��ȭ ��ȣ : ");
		String phone = sc.nextLine();
		
		// �Ű������� �ִ� Lottery ������ (��, �ʼ� ������) �� �̿��Ͽ�, 
		Lottery lottery = new Lottery(name, phone);
		
		// ��ü�� ������ ��� lc �� ��ü ������
		lc.deleteObject(lottery);
		
		// ���� ����� ���� true �� "���� �Ϸ� �Ǿ����ϴ�."
		
		// false �� "�������� �ʴ� ����Դϴ�." ���
	}
	
	// println �޼��带 �̿��Ͽ�, ��÷�ڸ� ����ϴ� �޼���
	public void winObject() {
		
	}
	
	// ���ĵ� ��÷�� Ȯ��
	public void sortedWinObject() {
		// lc ���� �޾ƿ� HashSet ��ü�� Iterator �� ���� ����ϱ�
	}
	
	// ��÷�� �� Ư�� ����� �ִ��� ����� ����ϴ� �޼���
	// ��÷�� �˻��� view �޼���
	public void searchWinner() {
		System.out.println("�˻��� ����� �̸��� ��ȭ ��ȣ�� �Է��ϼ���.");
		
		// �˻��� ����� �̸��� ��ȭ ��ȣ�� �޾�,
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.println("��ȭ ��ȣ : ");
		String phone = sc.nextLine();
		
		// �Ű������� �ִ� Lottery ������ (��, �ʼ� ������) �� �̿��Ͽ�,
		Lottery lottery = new Lottery(name, phone);
		
		// ��ü�� ������ ��� lc �� ��ü ������
		lottery.
		
		// ���� ����� ���� true �� "�����մϴ�. ��÷ ��Ͽ� �����մϴ�."
		// false �� "��Ÿ�����ϴ�. ��÷ ��Ͽ� �������� �ʽ��ϴ�." ���
	}
	
}
