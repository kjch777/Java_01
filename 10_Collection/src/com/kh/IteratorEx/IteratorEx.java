package com.kh.IteratorEx;

import java.util.ArrayList;
import java.util.Iterator; // ��κ��� ��� .util �� ���� �ȴ�.

/*
 Collection(List, Set, Map)�� �ݺ��ϴ� ���� ����ϴ� �͵� ��
 
	  Enumeration : ���̻� ������ �ʴ´�. Vector�� ���ó�� ������ ���� Ŭ���������� ���ȴ�.
	 
	     Iterator : �ݺ��ϴ� ���� ����Ѵ�.(���������� ȸ���Ѵ�.)
	 			    �б⸸ �����ϰ�, �߰��ϰų� ������ �� ����.
	 
	 ListIterator : Iterator�� ���׷��̵� �����̴�.
	 			    List(Vector, ArrayList, LinkedList) Collection������ ����Ѵ�.
	 			    ��������� ������ ȸ���� �� �ִ�.
	 			    ��������� ��ȸ == �յڷ� �̵� ����
	 			    �߰��ϰų� ������ �� �ִ�.
	 			    
 Iterator ������ �����ϴ� �޼����
 	.hasNext() : ������ �ִ��� ������ Ȯ���� �� ����Ѵ�.
 	 			 ���� �����Ѵٸ� true // �������� �ʴ´ٸ� false
 	 			
 	   .next() : ���� ���� ������ �� �� ����Ѵ�.
 	   			 .hasNext() �� ����ؼ� ������ �ִ��� �������� ���� Ȯ���ϰ�,
 	   			 .next() �� ����ϴ� ���� �����ϴ�.(�׷��� ������ exception ���� �� �� ����)
 */
public class IteratorEx {
	public static void main(String[] args) {
		ArrayList<String> ���ϵ� = new ArrayList<>();
		���ϵ�.add("���");
		���ϵ�.add("��纣��");
		���ϵ�.add("�м��ĸ���");
		���ϵ�.add("����");
		
		// Iterator ����
		Iterator<String> �ݺ� = ���ϵ�.iterator();
		
		// .hasNext() �� ���� ���� �ִ��� ���� Ȯ�� // ���� true false �� ���´�.
		while(�ݺ�.hasNext()) {
			
			// .next() �� ���� �� ��������
			String ���� = �ݺ�.next();
			System.out.println(����);
		}
	}
}
