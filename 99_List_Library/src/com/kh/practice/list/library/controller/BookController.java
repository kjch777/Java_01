package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

// �ʵ�
	ArrayList<Book> list = new ArrayList<>();
	
// �޼���
	// �⺻ ������
	public BookController() {
		// Ctrl + Space
	}
	
	// ����Ʈ�� å�� �߰��ϴ� �޼���
	public void insertBook(Book bk) {
		list.add(bk); // .add(); �� å �߰�
	}
	
	// ��� å ����� ����ϴ� �޼��� // ��� == void
	public void selectList() {
		if(list.isEmpty()) { // ���� å�� ���ٸ� ��ϵ� ������ ���ٰ� ����ϰ�
			System.out.println("��ϵ� ������ �����ϴ�.");
		} else { // å�� �ִٸ� å ����� �����ֱ�
			// for - each ��
			for(Book b : list) {
				System.out.println(b.toString()); // (������.toString()) �� �ϸ� �ּҰ��� �ƴ� ���� ���� ���� ������ ��� �ȴ�.
			}
		}
	}
	
	// Ű����� å�� �˻��ϴ� �޼���
	public void searchBook(String keyword) { // void ����� �ϳ�...
		List<Book> �˻���� = new ArrayList<>();
		for(Book b : list) {
			if(b.getTitle().contains(keyword)) {
				�˻����.add(b);
			}
		}
		if(�˻����.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			for(Book b2 : �˻����) {
				System.out.println(b2);
			}
		}
	}
	
	// å ����� ���� ������ å�� �����ϴ� �޼���
	public void deleteBook(String title, String author) {
		
		// true false �� ���� ������ �ƴ��� �� �ƴ��� Ȯ���� �� �ֵ��� ���ֱ�
		boolean removed = false; // boolean �� �⺻���� false �̱� ������, removed == false �� �����̴�.
		
		// å ����� ���ڸ� �˻��Ͽ� ������ å ã��
		// ��ü ��� for - each ��
		for(Book bbb : list) {
			
			// ���� ���� �����ϰ��� �ϴ� å ����� ���ڰ� �����Ѵٸ�
		   // (å ���� ��������.���ϱ�(���� �����ϰ��� �ϴ� å ����)) && (å ���� ��������.���ϱ�(���� �����ϰ��� �ϴ� ���� �̸�))
			if(bbb.getTitle().equals(title) && bbb.getAuthor().equals(author)){
				list.remove(bbb);
				
				// ���� ������ true
				removed = true;
				break;
			}
		}
		
		// ���� ���� �ƴٸ� ���� �ƴٸ� true false Ȱ���Ͽ� ǥ���ϱ�
		if(removed) {
			System.out.println("���� ������ �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println("�ش��ϴ� ������ ã�� �� �����ϴ�.");
		}
		
	}
	
	public void ascBook() {
		// for while short ���� ����Ͽ� �������� ������ ���൵ ������, �׷��� �ڵ尡 �������.
		//         .sort() �� ����� �������� �Ǵ� ������������ �������� �� ����Ѵ�.
		//         .sort(?, Comparator)
		//                                          �����ϴ� ���� å���� å ����
		//                                              :: == �� ������ :: �� ���� �����ؼ� ����ϰڴ�.
		//                               .comparing == ���ϴ�
		Collections.sort(list, Comparator.comparing(Book::getTitle));
	}
	
}
