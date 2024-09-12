package com.kh.practice.book.view;

import java.util.*;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {
	
// �ʵ�
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;
	
// �޼���
	// �⺻ ������
	public BookMenu() {
		// Ctrl + Space
	}
	
	// ���θ޴� ���
	public void mainMenu() {
		while(true) {
			System.out.println("1. ���� �߰� ����");
			System.out.println("2. ���� ���� ���");
			System.out.println("9. ���α׷� ������");
			System.out.print("�޴� ��ȣ : ");
			int choice = sc.nextInt();
			sc.nextLine(); // ���� �����
			switch(choice) {
			case 1 : 
				fileSave();
				break;
			case 2 :
				fileRead();
				break;
			case 9 :
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է� ���ּ���.");	
			}
		}
	}
	
	// ������ å ������ �޾ƿ���
	public void fileSave() {
		System.out.print("���� �̸� : ");
		String title = sc.nextLine();
		System.out.print("�۰� �̸� : ");
		String name = sc.nextLine();
		System.out.print("���� ���� : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("���� ��¥ (yyyy-mm-dd) : ");
		// Calendar
		
	}
	
	// ����� å ���� ���
	public void fileRead() {
		
	}

}
