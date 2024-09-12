package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

// �ʵ�
	// ����ڰ� ���� ���� �޴��� ���� �� �� ����
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
// �޼���
	// ��� void
	public void mainMenu() {
		System.out.println("=== �������� ���Ű� ȯ���մϴ� ===");
		
		// ���� ������ �ݺ� ����
		while(true) {
			System.out.println("=== ���� ���� ���α׷� ===");
			System.out.println("1. ���� �߰�");
			System.out.println("2. ��ü ���� ��� ��ȸ");
			System.out.println("3. ���� �˻� �� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("6. ����");
			System.out.print("�޴� ��ȣ ���� : ");
			int menu = sc.nextInt();
			sc.nextLine(); // ���� �����
			
			// �� �޴��� �Է� �� �ش� �޼���� �̵�
			switch(menu) {
			case 1 : 
				insertBook();
				break;
			case 2 : 
				selectList();
				break;
			case 3 : 
				searchBook();
				break;
			case 4 : 
				deleteBook();
				break;
			case 5 : 
				ascBook();
				break;
			case 6 : 
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default : 
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��� �ּ���.");
			}
		}
	}
	
	// å�� �߰��ϱ� ���� Ű����� �Է��� ������ �޴� �޼���
	public void insertBook() {
		System.out.print("���� : ");
		String title = sc.nextLine();
		
		System.out.print("���� : ");
		String author = sc.nextLine();
		
		System.out.print("ī�װ� : ");
		String category = sc.nextLine();
		
		System.out.print("���� : ");
		int price = sc.nextInt();
		sc.nextLine(); // ���� �����
		
		// å ������ �����ϴ� Book ��ü �ҷ�����
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
		System.out.println("���� �߰��� �Ϸ� �Ǿ����ϴ�.");
	}
	
	// ��ü ���� ��� ��� ������ �˸��� �޼���
	public void selectList() {
		bc.selectList();
	}
	
	// Ư�� ���� �˻� ����� �����ִ� �޼���
	public void searchBook() {
		System.out.print("�˻��� Ű���带 �Է� �ϼ��� : ");
		String keyword = sc.nextLine();
		bc.searchBook(keyword);
	}
	
	// Ư�� ���� ���� ������ �˸��� �޼���
	public void deleteBook() {
		System.out.print("������ �������� �Է��ϼ��� : ");
		String title = sc.nextLine();
		System.out.print("������ ���ڸ��� �Է��ϼ��� : ");
		String author = sc.nextLine();
		
		// BookController ���� �����ϴ� ��� �߰�
		bc.deleteBook(title, author); // Ctrl Ű ���� ä�� ���콺 ���� ��ư�� ������ �̵��� �� �ִ�.
	}
	
	// å �� �������� ���� ������ �˸��� �޼���
	// asc �� ascending �� ���ڷ�, ���������̶�� ���̴�.
	public void ascBook() {
		
		// BookController ���� ������������ �����ϴ� ��� �߰�
		bc.ascBook();
	}

}
