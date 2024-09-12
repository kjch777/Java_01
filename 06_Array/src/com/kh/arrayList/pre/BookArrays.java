package com.kh.arrayList.pre;

import java.util.Arrays;

public class BookArrays {

	public static void main(String[] args) {
		
		Book[] å�� = new Book[3];
		å��[0] = new Book("�Ƹ��", "�տ���");
		å��[1] = new Book("�Һ��� ��Ģ", "��� �Ͽ�ö");
		å��[2] = new Book("���� �а� ���� ������", "�տ���");
		
		// å ���� ����
		Book[] ������������ = Arrays.copyOf(å��, å��.length);
		
		// ������������ ���� ���
		System.out.println("=== ������ ������ å ���� ===");
		
		// for - each ��
		for(Book å : ������������) {
			System.out.println(å.getBookName() + " - " + å.getAuthor());
		}
		
		// å��� ������������ å�� ������ ��
		boolean same = Arrays.equals(å��, ������������);
		System.out.println("å��� ������������ å�� ������? : " + same);
		
		// ���������������� ��Ȳ���������� å�� 1�Ǹ� �����ؼ� ������ ����
		//									     ���ο� �ִ� ����
		Book[] ��Ȳ������ = Arrays.copyOf(������������, 1); 
		//            Ctrl ������ copyOf ���� ���콺 ��ư ������ ������ ���.
		
		// for - each ������ ��Ȳ�������� �ִ� å ���� ���
		for(Book b : ��Ȳ������) {
			System.out.println(b.getBookName() + " - " + b.getAuthor());
		}

	}

}
