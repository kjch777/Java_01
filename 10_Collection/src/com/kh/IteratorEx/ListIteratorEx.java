package com.kh.IteratorEx;

import java.util.*; // .util.*;

/*
 					ListIterator
 									
 					.next() �� ������� // �տ�������
			     .hasNext() : ���� ���� �����ϴ��� true false �� Ȯ���� �� ����Ѵ�.
			        .next() : ���� �� ��������
			        
				.previous() �� �������� // �ڿ�������	        
			 .hasPrevious() : ���� ���� �����ϴ��� true false �� Ȯ���� �� ����Ѵ�.
			    .previous() : ���� �� ��������
			    
			      ���� �߰��ϰų� ������ ��
			      
			         .add() : �߰�
			      .remove() : ����
 */
public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList<String> ����� = new ArrayList<>(Arrays.asList("�Ͼ�", "�ʷ�"));
		�����.add("����");

		ListIterator<String> �ݺ��ϱ� = �����.listIterator();

		System.out.println("�տ������� ����ϱ�");
		while (�ݺ��ϱ�.hasNext()) {
			String ���� = �ݺ��ϱ�.next();
			System.out.println(����); // �߰��� ������� ��µȴ�.
		}

		System.out.println("=====");

		System.out.println("�ڿ������� ����ϱ�");
		while (�ݺ��ϱ�.hasPrevious()) {
			String ���� = �ݺ��ϱ�.previous();
			System.out.println(����); // �߰��� ������ �������� ��µȴ�.
		}

		System.out.println(".add() �� ����Ͽ� �߰��ϱ�");
		�ݺ��ϱ�.add("�Ķ�");
		// .add() �� ���� �߰��ϰ� ����غ���, �߰��� ������� ��µȴ�.
		System.out.println(�����);

		// ���� .previous() �� ����Ͽ�, ���� ��ġ�� �Ķ��� ��ġ�� �̵���Ű��
		�ݺ��ϱ�.previous();
		�ݺ��ϱ�.remove();
		System.out.println("���� �ƴ��� Ȯ���ϱ� �� " + �����);
		/*
		 System.out.println(�����); 
		 
		 Exception in thread "main"
		 java.lang.IllegalStateException at
		 java.base/java.util.ArrayList$Itr.remove(ArrayList.java:980) at
		 com.kh.IteratorEx.ListIteratorEx.main(ListIteratorEx.java:47)
		 
		 .add() �� ���� �߰��ϸ鼭 ������ �̵��� ��������, ���� ��ġ�� �ڵ����� ����Ʈ�� ���� �ڸ��ϰ� �ȴ�.
		 ����, ���̻� ������ ���� ������ ������ �� ����.
		 
		 �ذ� ���
		 .next() �� ȣ���Ͽ� ���� ��ġ�� ������ ����, .remove() �� ȣ���ϰų�,
		 .previous() �� ȣ���Ͽ� ���� ��ġ�� ������ ����, .remove() �� ȣ���Ѵ�.
		 */

	}
}
