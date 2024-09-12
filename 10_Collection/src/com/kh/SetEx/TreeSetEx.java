package com.kh.SetEx;

import java.util.*;

/*
 TreeSet : �ߺ��� ������� �ʰ�, ���� �ڵ����� �����ϴ� �����̴�.
 		   �˻� Ʈ���� ���·� �����͸� �����ϸ�, �ڵ����� ���ĵ� ���¸� �����Ѵ�.
 		   �ڵ����� 0 �� 9, A �� Z, a �� z, �� �� �� ������ �������ش�.
 	    
 	     .add() : �߰�
 	  .remove() : ����
 	.contains() : ������ ���� �ִ��� Ȯ���� �� ����Ѵ�.
 	 .isEmpty() : TreeSet �� ����ִ��� Ȯ���� �� ����Ѵ�.
 	    .size() : ���� Ȯ��
 	   .first() : ���� ���� �����͸� ��ȯ�� �� ����Ѵ�.
 	    .last() : ���� ū �����͸� ��ȯ�� �� ����Ѵ�.
 	   .clear() : ��� ���� ������ �� ����Ѵ�.
 */
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>(); // Set �� �ߺ� �� ���簡 �Ұ�����, ȣ�ָӴ� ���� �����̴�.
		                                       // ȣ�ָӴ� ���ٴ°�, �ȿ� ������� ������ �Ǿ� ���� �ʴٴ� �ǹ��̴�.
		
		// �߰�
		ts.add(5);
		ts.add(2);
		ts.add(1);
		
		System.out.println("TreeSet ��� ���� : " + ts);
		
		// ����
		ts.remove(2);
		System.out.println("TreeSet ��� ���� : " + ts); 
		// ����Ű : �ڵ� �� �̵� == Alt + ȭ��ǥ ��/�Ʒ�
		// ����Ű : �ڵ� �� ���� == Ctrl + D
		
		// ���� ���ԵǾ� �ִ��� Ȯ���ϱ�
		System.out.println(ts.contains(5)); // ��ȯŸ�� : boolean // ������ true
		// ��ȯŸ�� == ���Ÿ��
		
		// ����ִ��� Ȯ���ϱ�
		System.out.println(ts.isEmpty()); // ��ȯŸ�� : boolean // ��������� true
		// ��ȯŸ�� == ���Ÿ��
		
		// ������ ���� Ȯ���ϱ�
		System.out.println(ts.size());
		
		// ���� ���� �� Ȯ���ϱ�
		System.out.println(ts.first());
		
		// ���� ū �� Ȯ���ϱ�
		System.out.println(ts.last());
		
		// ��� �� ����
		ts.clear();
		System.out.println("��� ���� : " + ts);
	}
}
