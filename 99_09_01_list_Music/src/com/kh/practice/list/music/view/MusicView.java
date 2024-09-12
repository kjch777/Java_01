package com.kh.practice.list.music.view;

import java.util.*; // .util.*;

import com.kh.practice.list.music.controller.MusicController;

public class MusicView {

// �ʵ�
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

// �޼���
	// ��� void
	public void mainMenu() {
		while(true) {
			System.out.println("===== ����Ƽ���� =====");
			System.out.println("1. �� �ڿ� �뷡 �߰�");
			System.out.println("2. �� �տ� �뷡 �߰�");
			System.out.println("3. ��ü �뷡 ��� ���");
			System.out.println("4. Ư�� �뷡 �˻�");
			System.out.println("5. Ư�� �뷡 ����");
			System.out.println("6. Ư�� �뷡 ����");
			System.out.println("7. �뷡 �������� ����");
			System.out.println("8. ���� �������� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int choice = sc.nextInt();
			sc.nextLine(); // ���� �����
			
			switch(choice) {
			
			case 1 : 
				addList();
				break;
			case 2 : 
				addAtZero();
				break;
			case 3 :
				printAll();
				break;
			case 4 : 
				searchMusic();
				break;
			case 5 : 
				removeMusic();
				break;
			case 6 : 
				setMusic();
				break;
			case 7 : 
				ascTitle();
				break;
			case 8 : 
				descSinger();
				break;
			case 9 : 
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("�߸��� �޴� �����Դϴ�. �ٽ� ���� ���ּ���.");
			
			}
		}
	}

	public void addList() {
		System.out.print("�뷡 ���� �Է� : ");
		String title = sc.nextLine();
		System.out.print("���� �̸� �Է� : ");
		String singer = sc.nextLine();
		mc.addList(title, singer);
	}

	public void addAtZero() {
		System.out.print("�뷡 ���� �Է� : ");
		String title = sc.nextLine();
		System.out.print("���� �̸� �Է� : ");
		String singer = sc.nextLine();
		mc.addAtZero(title, singer);
	}
	
	public void printAll() {
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		System.out.print("�˻��� �뷡 �Է� : ");
		String title = sc.nextLine();
		System.out.println(mc.searchMusic(title));
	}
	
	public void removeMusic() {
		System.out.print("������ �뷡 �Է� : ");
		String title = sc.nextLine();
		System.out.println(mc.removeMusic(title));
	}
	
	public void setMusic() {
		System.out.print("������ �뷡 �Է� : ");
		String title = sc.nextLine();
		System.out.print("������ ���� �Է� : ");
		String singer = sc.nextLine();
		System.out.println(mc.setMusic(title, singer));
	}
	
	public void ascTitle() {
		mc.ascTitle();
		System.out.println("�뷡�� ������������ �����߽��ϴ�.");
	}
	
	public void descSinger() {
		mc.descSinger();
		System.out.println("������ ������������ �����߽��ϴ�.");
	}

}
