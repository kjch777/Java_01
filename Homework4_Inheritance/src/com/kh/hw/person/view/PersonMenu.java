package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	// ����ڷκ��� ���ڸ� �Է¹ް�
	Scanner sc = new Scanner(System.in);
	
	// PersonController ��������
	PersonController pc = new PersonController();
	
// �޼���
	// ��� void
	public void mainMenu() {
		while (true) {
			System.out.println("==== ���� �޴� ====");
			System.out.println("1. �л� �޴�");
			System.out.println("0. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();
			sc.nextLine(); // �����ִ� Enter ���ֱ�

			// ��ȣ�� ������ �� �ִ� switch �� �ۼ�
			switch (choice) {
			case 1:
				studentMenu();
				break;
			// �л� �޴� �ۼ� �� break;

			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				return;

			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			}
		}
	}

	// �л��� �߰��ϰų� ��ȸ�ϱ�
	public void studentMenu() {
		while (true) {
			System.out.println("==== �л� �޴� ====");
			System.out.println("1. �л� �߰�");
			System.out.println("2. �л� ���");
			System.out.println("0. ���� �޴��� ���ư���");
			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();
			sc.nextLine(); // �����ִ� Enter ���ֱ�

			switch (choice) {
			case 1:
				insertStudent();
				// �л� �߰��ϱ�
				break;

			case 2:
				printStudent();
				// �л� ����ϱ�
				break;

			case 0:
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;

			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			}
		}
	}

	public void insertStudent() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();

		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine(); // �����ִ� Enter ���ֱ�

		System.out.println("���� : ");
		double height = sc.nextDouble();
		sc.nextLine(); // �����ִ� Enter ���ֱ�

		System.out.print("������ : ");
		double weight = sc.nextDouble();
		sc.nextLine(); // �����ִ� Enter ���ֱ�

		System.out.print("�г� : ");
		int grade = sc.nextInt();
		sc.nextLine(); // �����ִ� Enter ���ֱ�

		System.out.println("���� : ");
		String major = sc.nextLine();

		// 2��°�� �л� �߰� �ֱ�
		pc.insertStudent(name, age, height, weight, grade, major);
		System.out.println("�л��� �߰��Ǿ����ϴ�.");
	}
	
	// �л��� �󸶳� �����ϴ��� ����ϱ�
	public void printStudent() {
		// �л� ������ ����ִ� Student ��ٱ��� ����� �迭 ��������
		Student[] students = pc.printStudent();
		System.out.println("==== �л� ��� ====");
		
		// for - each ��
		for(Student s : students) {
			
			// ���� ���� ������� �ʴٸ� �л����� �����ֱ�
			if(s != null) {
				System.out.println(s);
			} else {
				System.out.println("������ �л� ������ �����ϴ�.");
			}
			
		}
		
	}

}
